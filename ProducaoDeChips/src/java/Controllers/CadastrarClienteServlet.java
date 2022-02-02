/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Modelo.DAO.ClienteDAO;
import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ivan
 */
public class CadastrarClienteServlet extends HttpServlet {

    
    
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
   HttpSession session=request.getSession(false);  
   if(session!=null){  
    String name=(String)session.getAttribute("usuario");  
       
            try {
                
    String nome = request.getParameter("nome");
    String logradouro = request.getParameter("logradouro");
    String cnpj = request.getParameter("cnpj");
    String cpf = request.getParameter("cpf");
   
    /**
   List<Cliente> clientes = new ArrayList();
    
    Cliente c = new Cliente();
    
    c.getIdCliente();
    c.setNome(nome);
    c.setLogradouro(logradouro);
    c.setCnpj(cnpj);
    c.setCpf(cpf);
    clientes.add(c);
      
    //salva no BD properties
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    URL url = classLoader.getResource("/Modelo/BD/cliente.properties");
    FileInputStream in = new FileInputStream(url.getPath());
    Properties props = new Properties();
    props.load(in);
    in.close();
    int idcliente=1;
    idcliente = (Integer.parseInt(props.getProperty("cliente.id"))+1);
    props.setProperty("cliente.id", String.valueOf(idcliente));
    props.setProperty("cliente.nome"+idcliente, c.getNome());
    props.setProperty("cliente.logradouro"+idcliente, c.getLogradouro());
    props.setProperty("cliente.cnpj"+idcliente, c.getCnpj());
    props.setProperty("cliente.cpf"+idcliente, c.getCpf());
    
   FileOutputStream out = new FileOutputStream(url.getPath());
   props.store(out, "---CLIENTES ---");  
   out.close();  
   
    */
    ClienteDAO cliente = new ClienteDAO();
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    URL url = classLoader.getResource("/Modelo/BD/cliente.properties");
   
    cliente.IncluiCliente(nome, logradouro, cnpj, cpf, url);
    
   request.getRequestDispatcher("/WEB-INF/JSP/cadastrar-cliente.jsp").include(request, response);

            } catch (Exception e) {
                throw new ServletException(
                  "A lógica de negócios causou uma exceção", e);
            }
    }
      // out.print("Hello, "+name+" Welcome to Profile");  
        
    else{  
          request.getRequestDispatcher("sessionError.html").include(request, response);  
          request.getRequestDispatcher("login.html").include(request, response);  
      }  
 }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
