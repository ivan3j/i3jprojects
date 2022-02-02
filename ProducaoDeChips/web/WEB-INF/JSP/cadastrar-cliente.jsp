<%-- 
    Document   : testecadastro
    Created on : 02/02/2017, 23:04:41
    Author     : Ivan
--%>

<%
String nome = request.getParameter("nome");
String logradouro = request.getParameter("logradouro");
String cnpj = request.getParameter("cnpj");
String cpf = request.getParameter("cpf");

//int id = Integer.parseInt(idStr);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cliente Cadastrado com Sucesso</h1>
        
        <a>-- Nome: <%=nome %>, Endereço: <%=logradouro %>, CNPJ/CPF: <%=cnpj%> <%=cpf%> -- </a>
    </body>
</html>
