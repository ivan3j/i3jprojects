<%-- 
    Document   : teste
    Created on : 30/01/2017, 20:38:48
    Author     : INFRAERO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <a>-- Cliente: <%=nomeCliente %>, Data Venda: <%=dataVenda %>, Vendedor: <%=nomeVendedor %> -- </a>
  <table>
  <c:forEach var="Ivan" items="${clientes}">
    <tr>
      <td><c:out value="${p.nomeCliente}"/> </td>
      <!-- código omitido -->
    </tr>
  </c:forEach>
</table>
    </body>
</html>