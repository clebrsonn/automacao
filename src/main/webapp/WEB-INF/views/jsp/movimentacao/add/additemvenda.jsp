<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Add Item ao Venda</h3>
	
	
	<div id="formAddItem">
	<form id="formAdd" action="AddItemVenda" method="POST">


		ID do Pedido:
		<input name="idpedidovenda"type="text" class="idpedido" value="${pv.id }"/>
		

		Tipo:
<%-- 		<input name="tipo" type="text" class="tipo" value="${pv.tipo }"/> --%>
		
		Total:
		<input id="totalpedido" name="total" type="text" class="totalpedido" value="${pv.total }"/>
		
		<p></p>
		
	
		
		
		<p>Cod Prod
		
			<input id="codigoitem"name="codigo" type="text" list="id" class="codigoitem" />
			
			<datalist id="id">
			
			   			<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	<option value="${produto.codebar}" />
                		</c:forEach>		
			

			</datalist>
			
			
		</p>
		
		<p>Descrição
		
			<input id="descricaoitem" name="descricao" type="text" list="produtos" class="descricaoitem" />
			
					
                	<datalist id="produtos" >
                		
                		<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	
						 	 	<option value="${produto.descricao}" />
						 	 	
                		</c:forEach> 
                		

					</datalist>

					

		</p>
		
		<p>Quantidade
			
			<input id="quantidadeitem" name="quantidade" type="text" class="quantidadeitem" />

		
		
		
		
		
		
			Valor Item
					
			<input id="valoritem"name="valor" type="text" class="valoritem" />
		
		
		
		
		
		
			Total Item
					
			<input id="valortotal"name="valor" type="text" class="valortotal" />
		
		</p>
		
		
					SubTotal
					
			<input id="subtotal"name="subtotal" type="text" class="subtotal" />
		
		</p>
		
		
		
		<div id="botoes">
<button class="button">AdicionarItem</button>
<button class="button">Apagar</button>
<button class="button" onclick="window.location.href='movimentacaopagamento'">Caixa</button>
</div>

</br>
		
		      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			 <th class="table-header-check"><a id="toggle-all" ></a> </th>
                 <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Pedido </a></th>         
               	 <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Preço Unitario</a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th>             
	             <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>                                  
                 <th class="table-header-repeat line-left"><a>Acão</a></th>
                 
<c:forEach var="item" items="${itemList}" varStatus="id">




<c:choose>
  <c:when test="${item.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${item.id}</td>
                    <td>${item.pedido}</td>
                    
                     <td>${item.codigo}</td>
                    <td>${item.descricao}</td>
                    <td>${item.precoUnitario}</td>
                    <td>${item.qtd}</td>                   
                    <td>${item.totalItem}</td>

                   
                    <td class="options-width">
                        <a href="edicaoitem?id=${item.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${item.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaovenda/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${item.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
             
                    <td>${item.id}</td>
                                        <td>${item.pedido}</td>
                    
                     <td>${item.codigo}</td>
                    <td>${item.descricao}</td>
                    <td>${item.precoUnitario}</td>
                    <td>${item.qtd}</td>                   
                    <td>${item.totalItem}</td>
                    
                    <td class="options-width">
                        <a href="edicaoitem?id=${item.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${item.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaovenda/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>

</c:choose>

                </c:forEach>             
            </table>


	</form>
</div>


</div>
<!--  end content-table-inner  -->






