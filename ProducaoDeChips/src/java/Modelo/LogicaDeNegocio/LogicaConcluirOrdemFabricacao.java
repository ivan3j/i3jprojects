/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.LogicaDeNegocio;

import Modelo.LogicaDeNegocio.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INFRAERO
 */
public class LogicaConcluirOrdemFabricacao implements Logica {

  @Override
  public String executa(HttpServletRequest req, HttpServletResponse res)
      throws Exception {

    return "/WEB-INF/JSP/concluir-ordem-fabricacao.jsp";
 

 }
}
