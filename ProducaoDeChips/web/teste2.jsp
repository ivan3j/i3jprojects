<%-- 
    Document   : teste
    Created on : 30/01/2017, 20:38:48
    Author     : INFRAERO
--%>

<%@page import="Entities.Pedido"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.net.URL"%>
<%
    List lista = (List)request.getAttribute("lista");
    
      %>
    

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Cadastro de Clientes</title>
        <style type="text/css">
            td {text-transform: capitalize}
        </style>
    </head>
    <body>
       <table>
  
           <%-- List lista = (List)request.getAttribute("lista");
	   for (int i = 0; i <lista.size(); i++ ) {
			    <tr>

            		&lt;tr&gt; 
  				&lt;td&gt; &lt;%=((Aluno)lista.get(i)).getNome() %&gt; &lt;/td&gt;
  				&lt;td&gt; &lt;%=((Aluno)lista.get(i)).getCurso() %&gt; &lt;/td&gt;
  			&lt;/tr&gt;	 
             		&lt;%>
                        }--%>
             	
  	<c:forEach var="inc" items="${lista}"> 
		<li>		
			<c:out value="${pedido.id}"></c:out>
		</li>
	</c:forEach>	 
  </table>
       
  
    </body>
</html>