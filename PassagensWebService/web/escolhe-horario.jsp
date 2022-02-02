<%-- 
    Document   : escolhe-horario
    Created on : 07/04/2017, 16:02:30
    Author     : I9482086
--%>

<%@page import="modelo.Rotas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<%
   ArrayList<Rotas> rotas = new ArrayList();
                           
      rotas= (ArrayList)request.getAttribute("listarotas");
      
      //request.getAttribute("origem");
    %>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
      <form name="frm" method="post" action="DadosExternosServlet">
            <table width="60%" align="center" >
                <tr>
                    <th colspan="2">Escolha um Horário</th>
                </tr>
                <tr>
                    <td>. </td>
                </tr>
                <tr>
                    <td>. </td>
                </tr>
                <tr>
            
                    <td>Rota escolhida => De: <%=rotas.get(0).getCidadeDe() %></td> 
                    <td>Para: <%=rotas.get(0).getCidadePara() %></td>
                    <td>Ida: <%=rotas.get(0).getDataPartida() %></td> 
                    <td>Volta: <%=rotas.get(0).getDataRetorno() %></td> 
                       
                </tr>
                <tr>
                    <td>. </td>
                </tr>
                <tr>
                    <td>. </td>
                </tr>
                <tr height="30px"> 
                <td><input type="radio" value="valor1" name="valor" checked></td>                     
                <td>Saida: 08:00</td>
                <td>Chegada: 10:00</td>
                <td>R$400,00</td>
                <td>Azul</td>
                </tr>
                
                <tr height="30px"> 
                <td><input type="radio" value="valor2" name="valor"></td>                     
                <td>Saida: 13:00</td>
                <td>Chegada: 15:10</td>
                <td>R$425,00</td>
                <td>Azul</td>
                </tr>
				
				<tr height="30px"> 
                <td><input type="radio" value="valor3" name="valor"> </td>                     
                <td>Saida: 21:50</td>
                <td>Chegada: 23:10</td>
                <td>R$450,00</td>
                <td>Azul</td>
                </tr>
			
                </table>    
		
		
        <div align="center">
                    <input type="submit" name="comprar"  value="Comprar">
                    </div>
       
	   
            <div align="center">
       				<a href="TelaPrincipal.html">VOLTAR</a>
       			
				</div> 

	</form>
    </body>
</html>
