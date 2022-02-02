<%-- 
    Document   : testecadastro
    Created on : 02/02/2017, 23:04:41
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="cadastro" method="POST" action="AlteraStatusOrdemServlet">
      <table width="60%" align="center" >
                <tr>
                    <th colspan="2">Iniciar Ordem de fabricação</th>
                </tr>
                <tr>
                    <td>Selecione a Ordem a ser INICIADA:</td>
                    <td>
                        <select name="idordem" >
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td colspan="2" >
                        <div align="center">
                            
                            <input type="reset" value="Limpar">
                            <input type="submit" name="iniciar"  value="Iniciar Ordem">
                        </div>
                        <div align="center">
                            <a href="LogoutServlet">Logout</a>
                        </div>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>