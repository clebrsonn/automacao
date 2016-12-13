<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimentacao Recebimento</h3>
            	<div id="content-table">
	<form id="mainform"  action="cadastro">

      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
<!--                       <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th> -->
                 <th class="table-header-repeat line-left minwidth-1"><a>Data </a></th> 
                   <th class="table-header-repeat line-left minwidth-1"><a>Fornecedor </a></th> 
<!--             <th class="table-header-repeat line-left minwidth-1"><a>Mesa</a></th>  -->
             <th class="table-header-repeat line-left minwidth-1"><a>Status</a></th> 
<!--               <th class="table-header-repeat line-left minwidth-1"><a>Garçon</a></th> -->
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Total</a></th> -->

<!--                  <th class="table-header-repeat line-left minwidth-1"><a>Data Abertura</a></th>  -->
                           
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fechamento</a></th>             -->
                                  
                <th class="table-header-repeat line-left"><a>Acao</a></th>
                 
                <c:forEach var="recebimento" items="${recebimentoList}" varStatus="id">




<c:choose>
  <c:when test="${recebimento.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${recebimento.id}</td>
                     <td><fmt:formatDate type="date"  value="${recebimento.data}" /></td>
                     <td>${recebimento.fornecedor}</td>
<%--                     <td>${recebimento.mesa}</td> --%>
                    <td>${recebimento.status}</td>
<%--                     <td>${recebimento.garcon}</td>                    --%>
<%--                     <td>${recebimento.total}</td> --%>

                   
                    <td class="options-width">
                        <a href="edicao?id=${recebimento.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="addformapagamento?id=${recebimento.id}" class="icon-40 info-tooltip" title="aaa"></a>
                         <a href="additemrecebimento?id=${recebimento.id}" class="icon-30 info-tooltip" title="Adicionar Item ao Pedido"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${recebimento.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${recebimento.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
             
                        <td>${recebimento.id}</td>
                     <td><fmt:formatDate type="date"  value="${recebimento.data}" /></td>
                     <td>${recebimento.fornecedor.nomefantasia}</td>
<%--                     <td>${recebimento.mesa}</td> --%>
                    <td>${recebimento.status}</td>
<%--                     <td>${recebimento.garcon}</td>                    --%>
<%--                     <td>${recebimento.total}</td> --%>               
                 
                    <td class="options-width">
                        <a href="edicao?id=${recebimento.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="addformapagamento?id=${recebimento.id}" class="icon-40 info-tooltip" title="aaa"></a>
                         <a href="additemrecebimento?id=${recebimento.id}" class="icon-30 info-tooltip" title="Adicionar Item ao Pedido"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${recebimento.id}" class="icon-5 info-tooltip" title="ccc"></a>
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
            
            
            		<div id="botoes">
				
				<button class="button">Criar Recebimento</button>
							
		
		</div>
            
            </form>
</div>




</div>

</div>
