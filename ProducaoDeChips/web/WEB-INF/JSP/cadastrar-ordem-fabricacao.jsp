<%-- 
    Document   : testecadastro
    Created on : 02/02/2017, 23:04:41
    Author     : Ivan
--%>

<%

String nomeCliente = request.getParameter("pedido");
String dataVenda = request.getParameter("datavenda");
String nomeVendedor = request.getParameter("vendedor");
String qtdeChips = request.getParameter("qtdechips");
String valorvenda = request.getParameter("valor");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <table border="1">
            <thead>
                <tr>
                    <th>Ordem cadastrada com sucesso</th>
                    <!-- <th>Logradouro</th>-->
                    
                </tr>
            </thead>
            <tbody>
             <tr>
                    <td><p>Número do Pedido: ${anumPedido} </p></td>

                </tr>
              <!--  </c:forEach> -->
            </tbody>
        </table>
         
    </body>
</html>


<%--
<div class="element">
                    <label for="element">Product name </label>
                    <input id="name" name="name" class="text  err" />       
                </div>


                    <div class="element">
                    <label for="category">Category </label>                     
                    <select id='stateCombo'  onchange='stateComboChange();'>
       <option value='-1' title='-select one-'>-select one-</option>
       <option value='0' title='Mobile'>Mobile</option>
       <option value='1' title='Nsw'>Routers</option>
      <option value='2' title='Tas'>Datacard</option>
      <option value='' title='Tas'><%=request.getAttribute("category") %></option>

    </select>
                                              </div>
--%>
      