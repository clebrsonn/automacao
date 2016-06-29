<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Add Item ao Pedido</h3>
	
	
	<div id="formAddItem">
	<form id="formAdd" action="movimentacao/additem" method="GET">


		ID do Pedido:
		<input name="idpedido"type="text" class="idpedido" readonly="readonly" value="${pedido.id }" />
		

		Mesa:
		<input name="mesa" type="text" class="mesapedido" value="${pedido.mesa }" readonly="readonly"/>
		
		Total:
		<input id="totalpedido" name="total" type="text" class="totalpedido" value="${pedido.total }" />
		
		<p></p>
		
	
		
		
		<p>Cod Prod
		
			<input id="codigoitem"name="codigo" type="text" list="id" class="codigoitem" />
			
			<datalist id="id">
			
			   			<c:forEach var="produto" items="${listProduto}" varStatus="id">
						 	 	<option value="${produto.codebar}" />
                		</c:forEach>		
			

			</datalist>
			
			
		</p>
		
		<p>Descri��o
		
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
</div>

</br>
		
		      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                <th class="table-header-repeat line-left minwidth-1"><a>Pedido </a></th> 
                
                      <th class="table-header-repeat line-left minwidth-1"><a>C�digo de Barras</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th> 
            <th class="table-header-repeat line-left minwidth-1"><a>Pre�o Unitario</a></th> 
             <th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th> 
            
                <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>
<!--                      <th class="table-header-repeat line-left minwidth-1"><a>Desenvolvedor</a></th> -->
<!--                  <th class="table-header-repeat line-left minwidth-1"><a>Data Abertura</a></th>  -->
                           
<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fechamento</a></th>             -->
                                  
                <th class="table-header-repeat line-left"><a>Ac�o</a></th>
                 
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
                        <a href="movimentacaoitem/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
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
                        <a href="movimentacaoitem/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
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
		
		
<!-- <ul> -->
<!-- <li>C�digo</li> -->
<!-- <li>Descri��o</li> -->
<!-- <li>Pre�o Unitario</li> -->
<!-- <li>Quantidade</li> -->
<!-- <li>Total</li> -->
<!-- </ul> -->




	</form>
</div>


</div>
<!--  end content-table-inner  -->






