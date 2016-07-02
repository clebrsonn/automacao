<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimentação Cozinha</h3>
            	<div id="content-table">
	<form id="mainform"  action="cadastropedido">

      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
  			<th class="table-header-check"><a id="toggle-all" ></a> </th>
            <th class="table-header-repeat line-left "><a>Id</a></th>
<!--                       <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th> -->
          	<th class="table-header-repeat line-left minwidth-1"><a>Data </a></th> 
            <th class="table-header-repeat line-left minwidth-1"><a>Tipo </a></th>
            <th class="table-header-repeat line-left minwidth-1"><a>Mesa</a></th> 
            <th class="table-header-repeat line-left minwidth-1"><a>Status</a></th> 
            <th class="table-header-repeat line-left minwidth-1"><a>Garçon</a></th>
            <th class="table-header-repeat line-left minwidth-1"><a>Total</a></th>

<!--                  <th class="table-header-repeat line-left minwidth-1"><a>Data Abertura</a></th>  -->
                           
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fechamento</a></th>             -->
                                  
                <th class="table-header-repeat line-left"><a>Acão</a></th>
                 
                <c:forEach var="pedido" items="${pedidoList}" varStatus="status">




<c:choose>
  <c:when test="${pedido.status != 'CANCELADO'}">
  
  
			    <tr class="alternate-row">
			                <td><input  type="checkbox"/></td>
			                    <td>${pedido.id}</td>
			                     <td>${pedido.data}</td>
			                     <td>${pedido.tipo}</td>
			                    <td>${pedido.mesa}</td>
			                    <td>${pedido.status}</td>
			                    <td>${pedido.garcon}</td>                   
			                    <td>${pedido.total}</td>
			
			                   
			                    <td class="options-width">
			                        <a href="edicaocozinha?id=${pedido.id}" class="icon-1 info-tooltip" title="Edit"></a>
			                        &nbsp;&nbsp;&nbsp;&nbsp;
			                        <a href="/delete?id=${pedido.id}" class="icon-40 info-tooltip" title="aaa"></a>
			                         <a href="additem?id=${pedido.id}" class="icon-30 info-tooltip" title="Adicionar Item ao Pedido"></a>
			                        &nbsp;&nbsp;&nbsp;&nbsp;
			                        <a href="movimentacaocozinha/delete?id=${pedido.id}" class="icon-5 info-tooltip" title="ccc"></a>
			                    </td>
	                </tr>
 		
  </c:when>


</c:choose>

                </c:forEach>             
            </table>
            
            

            
            </form>
</div>




</div>

</div>
