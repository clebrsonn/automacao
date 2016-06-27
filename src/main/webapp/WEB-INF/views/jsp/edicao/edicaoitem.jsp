<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Edição Item</h3>
	
	
	<div id="formAddItem">
	<form id="formAdd" action="movimentacaoitem/edicaoitem" method="GET">


		ID do Pedido:
		<input name="idpedido"type="text" class="idpedido" readonly="readonly" value="${pedido.id }" />
		

		Mesa:
		<input name="mesa" type="text" class="mesapedido" value="${pedido.mesa }" readonly="readonly"/>
		
		Total:
		<input id="totalpedido" name="total" type="text" class="totalpedido" value="${pedido.total }" />
		
		<p></p>
		
	
			<p>Id  Item
		
			<input id="id" name="id" type="text"  class="iditem" value="${item.id}" />

		
		<p>Cod Prod
		
			<input id="codigoitem" name="codigo" type="text" list="id" class="codigoitem" value="${item.codigo}" />
			
			<datalist id="id">
			

			   			<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	<option value="${produto.codebar}" />
                		</c:forEach>		
			

			</datalist>
			
			
		</p>
		
		<p>Descrição
		
			<input id="descricaoitem" name="descricao" type="text" list="produtos" class="descricaoitem" value="${item.descricao}" />
			
					
                	<datalist id="produtos" >
                			
                	
                		
                		<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	
						 	 	<option value="${produto.descricao}" />
						 	 	
                		</c:forEach> 
                		

					</datalist>

					

		</p>
		
		<p>Quantidade
			
			<input id="quantidadeitem" name="quantidade" type="text" class="quantidadeitem" value="${item.qtd }" />

		
		
		
		
		
		
			Valor Item
					
			<input id="valoritem"name="valor" type="text" class="valoritem" value="${item.precoUnitario }"/>
		
		
		
		
		
		
			Total Item
					
			<input id="valortotal"name="valor" type="text" class="valortotal" value="${item.totalItem }"/>
		
		</p>
		
		
					SubTotal
					
			<input id="subtotal"name="subtotal" type="text" class="subtotal" />
		
		</p>
		
		
		
		<div id="botoes">
<button class="button">EditarItem</button>
<button class="button">Apagar</button>
</div>

</br>
		
		  


	</form>
</div>


</div>
<!--  end content-table-inner  -->






