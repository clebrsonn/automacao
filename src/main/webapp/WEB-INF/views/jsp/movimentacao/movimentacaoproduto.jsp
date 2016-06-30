<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimentação Produto</h3>
            	<div id="content-table">
	<form id="mainform">

      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                      <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th> 
            <th class="table-header-repeat line-left minwidth-1"><a>Preço de Custo</a></th> 
             <th class="table-header-repeat line-left minwidth-1"><a>Preço de Venda</a></th> 
            
                <th class="table-header-repeat line-left minwidth-1"><a>Um</a></th>
<!--                      <th class="table-header-repeat line-left minwidth-1"><a>Desenvolvedor</a></th> -->
<!--                  <th class="table-header-repeat line-left minwidth-1"><a>Data Abertura</a></th>  -->
                           
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fechamento</a></th>             -->
                                  
                <th class="table-header-repeat line-left"><a>Acão</a></th>
                 
                <c:forEach var="produto" items="${produtoList}" varStatus="id">




<c:choose>
  <c:when test="${produto.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${produto.id}</td>
                     <td>${produto.codebar}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.precoCusto}</td>
                    <td>${produto.precoVenda}</td>                   
                    <td>${produto.um}</td>

                   
                    <td class="options-width">
                        <a href="edicaoproduto?id=${produto.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${produto.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${produto.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaoproduto/delete?id=${produto.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${produto.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
             
                    <td>${produto.id}</td>
                     <td>${produto.codebar}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.precoCusto}</td>
                    <td>${produto.precoVenda}</td>
                    <td>${produto.um}</td>
                    <td class="options-width">
                        <a href="edicaoproduto?id=${produto.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${produto.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${produto.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaoproduto/delete?id=${produto.id}" class="icon-5 info-tooltip" title="ccc"></a>
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
