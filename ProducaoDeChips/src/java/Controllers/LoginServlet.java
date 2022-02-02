package Controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author INFRAERO
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        
                  
        String name=request.getParameter("usuario");  
        String password=request.getParameter("senha");  
        
        if(name.equals("Gerente") && password.equals("gere123")){  
        HttpSession session=request.getSession();  
        session.setAttribute("usuario",name);
        request.getRequestDispatcher("/WEB-INF/HTM/pageGerente.html").forward(request, response);
      
        }
        if(name.equals("Coordenador") && password.equals("cord123")){  
      
        HttpSession session=request.getSession();  
        session.setAttribute("usuario",name); 
        request.getRequestDispatcher("/WEB-INF/HTM/pageCoordenador.html").forward(request, response);
        }  
        if(name.equals("Comercial") && password.equals("come123")){  
        
        HttpSession session=request.getSession();  
        session.setAttribute("usuario",name);  
        request.getRequestDispatcher("/WEB-INF/HTM/pageComercial.html").forward(request, response);
        }  
        else{  
           request.getRequestDispatcher("loginError.html").include(request, response); 
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
