<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimentação Serviço</h3>
            	<div id="content-table">
	<form id="mainform">

      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Número do Serviço</a></th> 
                                  <th class="table-header-repeat line-left minwidth-1"><a>Nome do Serviço</a></th>
                                                   <th class="table-header-repeat line-left minwidth-1"><a>Preço do Serviço</a></th>
                                                            
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Projeto</a></th>                               -->
                <th class="table-header-repeat line-left"><a>Acão</a></th>
                 
                <c:forEach var="servico" items="${servicoList}" varStatus="id">
                
<%-- <c:if test="${objeto.id % 2 == 0}"> --%>
<!--  			 <tr class="alternate-row"> -->
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
<%-- </c:if> --%>




<c:choose>
  <c:when test="${servico.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${servico.id}</td>
                     <td>${servico.numero}</td>
                     <td>${servico.nome}</td>
                     <td>${servico.preco}</td>
<%--                     <td>${lider.projeto}</td> --%>
                   
                    <td class="options-width">
                        <a href="edicaoservico?id=${servico.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${servico.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${servico.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaoservico/delete?id=${servico.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${servico.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
                           <td>${servico.id}</td>
                     <td>${servico.numero}</td>
                     <td>${servico.nome}</td>
                     <td>${servico.preco}</td>
<%--                     <td>${lider.projeto}</td> --%>
                    <td class="options-width">
                        <a href="edicaoservico?id=${servico.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${servico.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${servico.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaoservico/delete?id=${servico.id}" class="icon-5 info-tooltip" title="ccc"></a>
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