<%-- 
    Document   : conclui-compra
    Created on : 07/04/2017, 16:51:31
    Author     : I9482086
--%>
<%@page import="modelo.Hotel"%>
<%@page import="modelo.Carro"%>
<%@page import="java.util.ArrayList"%>

<%
   ArrayList<Hotel> hoteis = new ArrayList();
   hoteis= (ArrayList)request.getAttribute("listahoteis");
   
    ArrayList<Carro> carros = new ArrayList();
    carros= (ArrayList)request.getAttribute("listacarros");
        
    %>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="frm" method="POST" action="">
            <table width="60%" align="center" >
						
			<tr>
			<td height="100px">COMPRA EFETUDA COM SUCESSO.</td>
			</tr>
			
			<tr>
			<td>Reserve o Hotel:</td>
			</tr>
			
			<tr>
			<td><select name="hotel" style="width: 400px">
					
                                 <option value=""></option>
                       
<%
  
  for(int i = 0; i < hoteis.size(); i++) {
     //Linha linhaLocal = pedidos.get(i);
 %>
        
 <option value="<%=hoteis.get(i).getNome() %>"> <%=hoteis.get(i).getQuarto() %></option>																
 <% } //fecha for
%>
                                
					</select></td>
			</tr>
			
			<tr>
			<td>Reserve seu veiculo:</td>
			</tr>
			
			<tr>
			<td><select name="carro" style="width: 400px">
					
                                <option value=""></option>
                       
<%
  
  for(int i = 0; i < carros.size(); i++) {
     //Linha linhaLocal = pedidos.get(i);
 %>
        
 <option value="<%=carros.get(i).getModelo() %>"> </option>																
 <% } //fecha for
%>
					</select></td>
			</tr>
			
		</table>
	   
            <div align="center">
       				<a href="TelaPrincipal.html">VOLTAR</a>
       			
				</div> 
	</form>
    </body>
</html>
