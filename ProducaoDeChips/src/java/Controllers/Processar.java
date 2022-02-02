/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Modelo.LogicaDeNegocio.Logica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 *
 * @author INFRAERO
 */
public class Processar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        HttpSession session = request.getSession(false);
        //if(session!=null)
        //session.invalidate();
                         
        if(session!=null){  
        String name=(String)session.getAttribute("usuario");
            
        String parametro = request.getParameter("logica");
            String nomeDaClasse = "Modelo.LogicaDeNegocio.Logica" + parametro;

            try {
                Class<?> classe = Class.forName(nomeDaClasse);

                Logica logica = (Logica) classe.newInstance();
                String modelo = logica.executa(request, response);

      request.getRequestDispatcher(modelo).forward(request, response);

            } catch (Exception e) {
                throw new ServletException(
                  "A lógica de negócios causou uma exceção", e);
            }
    }
      
        else{  
            request.getRequestDispatcher("sessionError.html").include(request, response);  
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
