<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Cadastro de Recebimentos</h3>
	
	
	<div id="form">
	<form id="formRecebimentos" action="additemrecebimento" method="GET">

		<div id="dadospedido" class="dadospedido">

			ID do Pedido:
			<input id="idpedidocompra"name="idpedidocompra"type="text" class="idpedido" />
			
	
			ID FORNECEDOR:
			<input name="tipo" type="text" class="tipo"/>
			
			Total:
			<input id="totalpedido" name="totalpedido" type="text" class="totalpedido" />
			
		</div>
		
	
		
		<div id="item" class="item">
		
		Cod Prod
		
			<input id="codigoitem"name="codigo" type="text" list="id" class="codigoitem" />
			
			<datalist id="id">
			
			   			<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	<option value="${produto.codebar}" />
                		</c:forEach>		
			

			</datalist>
			
	
		
		Descrição
		
			<input id="descricaoitem" name="descricao" type="text" list="produtos" class="descricaoitem" />
			
					
                	<datalist id="produtos" >
                		
                		<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	
						 	 	<option value="${produto.descricao}" />
						 	 	
                		</c:forEach> 
                		

					</datalist>

					
		</div>
		
		<div id="detalheitem" class="detalheitem">
		
			Quantidade
				
				<input id="quantidadeitem" name="quantidade" type="text" class="quantidadeitem" />
	

				Valor Item
						
				<input id="valoritem"name="valor" type="text" class="valoritem" />
			

				Total Item
						
				<input id="valortotal"name="valor" type="text" class="valortotal" />
			
		
		
		
					SubTotal
					
			<input id="subtotal"name="subtotal" type="text" class="subtotal" />
		</div>
		
		
		
		<div id="botoes">
<button class="button">AdicionarItemRecebimento</button>
<button class="button">Apagar</button>
<button class="button"><a href="AddRecebimento?id=${pedido.id }">Salvar</a></button>
<button class="button"><a href="finalizacaorecebimento?id=${pedido.id }">FinalizarRecebimento</a></button>

</div>

</br>
		
		      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table2">
    			 <th class="table-header-check"><a id="toggle-all" ></a> </th>
                 <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Pedido Compra </a></th>         
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
                         <a href="cadastrorecebimento2?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaorecebimento/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
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
                         <a href="cadastrorecebimento2?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaorecebimento/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
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






