/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.posestacio.soa.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Rotas;
import ws.Banda;

/**
 *
 * @author I9482086
 */
public class ControlePassagensServlet extends HttpServlet {

    static private Map<Integer, Rotas> rotasMap;
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
        response.setContentType("text/html;charset=UTF-8");
        
        String origem = request.getParameter("origem");
        String destino = request.getParameter("destino");
        String dataIda = request.getParameter("dataida");
        String dataVolta = request.getParameter("datavolta");
        
List listarotas = null;        
    
   
rotasMap = new HashMap<Integer, Rotas>();

Rotas r = new Rotas();
        r.setCidadeDe(origem);
        r.setCidadePara(destino);
        r.setDataPartida(dataIda);
        r.setDataRetorno(dataVolta);

rotasMap.put(r.getId(),r);

listarotas = new ArrayList<Rotas>(rotasMap.values());
                           
 request.setAttribute("listarotas", listarotas);
 request.setAttribute("origem", origem);
 request.setAttribute("destino", destino);
 request.setAttribute("dataida", dataIda);
 request.setAttribute("datavolta", dataVolta);
 
    request.getRequestDispatcher("/escolhe-horario.jsp").include(request, response);
    
        
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
