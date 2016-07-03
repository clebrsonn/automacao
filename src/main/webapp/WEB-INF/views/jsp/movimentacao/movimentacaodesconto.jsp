<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimenta��o Desconto</h3>
            	<div id="content-table">
	<form id="mainform">

      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Nome Desconto</a></th>          
                <th class="table-header-repeat line-left minwidth-1"><a>N�mero Desconto</a></th>                               
                <th class="table-header-repeat line-left minwidth-1"><a>Valor Desconto</a></th>                               
                
                <th class="table-header-repeat line-left"><a>Ac�o</a></th>
                 
                <c:forEach var="desconto" items="${descontoList}" varStatus="id">
                





<c:choose>
  <c:when test="${desconto.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${desconto.id}</td>
                     <td>${desconto.nome}</td>
                    <td>${desconto.numero}</td>
                    <td>${desconto.valor}</td>
                    
                    <td class="options-width">
                        <a href="edicaodesconto?id=${desconto.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${desconto.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${desconto.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaodesconto/delete?id=${desconto.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${desconto.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
                   <td>${desconto.id}</td>
                      <td>${desconto.nome}</td>
                    <td>${desconto.numero}</td>
                    <td>${desconto.valor}</td>
                    
                    <td class="options-width">
                        <a href="edicaodesconto?id=${desconto.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${desconto.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${desconto.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaodesconto/delete?id=${desconto.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>

</c:choose>
<!--                 <tr> -->
<!--                 <td><input  type="checkbox"/></td> -->
<%--                     <td>${objeto.id}</td> --%>
<%--                     <td>${objeto.nome}</td> --%>
<%--                     <td>${objeto.tipo}</td> --%>
<!--                     <td class="options-width"> -->
<%--                         <a href="/edit?id=${objeto.id}" class="icon-1 info-tooltip" title="Edit"></a> --%>
<!--                         &nbsp;&nbsp;&nbsp;&nbsp; -->
<%--                         <a href="/delete?id=${objeto.id}" class="icon-4 info-tooltip" title="aaa"></a> --%>
<%--                          <a href="/edit?id=${objeto.id}" class="icon-3 info-tooltip" title="bbb"></a> --%>
<!--                         &nbsp;&nbsp;&nbsp;&nbsp; -->
<%--                         <a href="/delete?id=${objeto.id}" class="icon-5 info-tooltip" title="ccc"></a> --%>
<!--                     </td> -->
<!--                 </tr> -->
                </c:forEach>             
            </table>
            
            </form>
</div>




</div>

</div>