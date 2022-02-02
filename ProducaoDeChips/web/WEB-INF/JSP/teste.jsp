<%-- 
    Document   : teste
    Created on : 30/01/2017, 20:38:48
    Author     : INFRAERO
--%>

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
        <form name="cadastro" method="POST" action="CadastrarClienteServlet">
            <table width="60%" align="center" >
                <tr>
                    <th colspan="2">Cadastro de Clientes</th>
                </tr>
               <!-- <tr>
                    <td>Empresa:</td>
                    <td>
                        <input type="text" name="empresa" size="60" maxlength="60"
                               onkeypress="if (event.keyCode >= 33 && event.keyCode <= 64)
                                           event.returnValue = false;">
                        <!-- nesta linha bloqueei os numeros e caracteres especiais com a tabela ascII 
                    </td>
                </tr> -->
                <tr>
                    <td>Cliente:</td>
                    <td><input type="text" name="nome" size="60" style="text-transform:none" ></td>
                </tr>
                <tr>
                    <td>Logradouro:</td>
                    <td><input type="text" name="endereco" size="20" style="text-transform:none" ></td>
                </tr>
             <!--   <tr>
                    <td>Endereço:</td>
                    <td><input type="text" name="endereco" size="60" maxlength="60"></td>
                </tr>
                <tr>
                    <td>Estado:</td>
					<td><input type="text" name="estado" size="20" style="text-transform:none" ></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email" size="40" > (xxx@xx.xx)</td>
                </tr>
                <tr>
                    <td>Telefone:</td>
                    <td><input type="text" name="telefone" size="20" ></td>
               </tr> -->
                <tr>
                    <td colspan="2" >
                        <div align="center">
                            <input type="reset" value="Limpar">
                            <input type="submit" name="salvar"  value="salvar">
                        </div>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>

