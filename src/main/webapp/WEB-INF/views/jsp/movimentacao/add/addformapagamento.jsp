<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Add Form de Pagamento</h3>
	
	
	<div id="formAddItem">
	<form id="formAdd" action="movimentacaopagamento/addformapagamento" method="GET">


		ID do Pedido:
		<input name="idpedido"type="text" class="idpedido" value="${pedido.id }"/>
		

		Tipo:
		<input name="tipo" type="text" class="tipo" value="${pedido.tipo }"/>
		
		
		
		Total:
		<input id="totalpedido" name="total" type="text" class="totalpedido" value="${pedido.total }"/>
		
		<p></p>
		
	
		
		
		<p>Nome Forma de Pagamento
		
			<input id="nome"name="nome" type="text" list="formapagamento" class="formapagamento" />
			
			<datalist id="formapagamento">
			
			   			<c:forEach var="pagamento" items="${pagamentoList}" varStatus="id">
						 	 	<option value="${pagamento.nome}" />
                		</c:forEach>		
			

			</datalist>
			
			
		</p>
		
				Qtd Parcelas
					
			<input id="qtdparcela"name="qtdparcela" type="text" class="valoritem" />
		
			Valor Pagamento
					
			<input id="valorpagamento"name="valorpagamento" type="text" class="valorpagamento" />
		
		
		
		
		
										Restante
					
			<input id="subtotal"name="subtotal" type="text" class="subtotal" />
		
		</p>
		
							Troco
					
			<input id="troco"name="troco" type="text" class="subtotal" />
		
		</p>
		
		
		<div id="botoes">
<button class="button">AdicionarFormadePagamento</button>
<button class="button">Apagar</button>
<a href="finalizacaovenda?id=3"><div class="button" >FinalizarVenda</div></a>
</div>

</br>
		
		      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			 <th class="table-header-check"><a id="toggle-all" ></a> </th>
                 <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Pedido </a></th>         
               	 <th class="table-header-repeat line-left minwidth-1"><a>Nome da Forma de Pagamento</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Parcela </a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Valor da Parcela</a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Total</a></th>             
<!-- 	             <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>                                   -->
                 <th class="table-header-repeat line-left"><a>Ac�o</a></th>
                 
<c:forEach var="pagamento" items="${pagamentoList}" varStatus="id">




<c:choose>
  <c:when test="${pagamento.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${pagamento.id}</td>
                    <td>${pedido.id }</td>
                    <td>${pagamento.nome}</td>
                    <td>${pagamento.parcelas}</td>
                    <td>5.00</td>
                    <td>100.00</td>


                   
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
  <c:when test="${pagamento.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
             
         			<td>${pagamento.id}</td>
         			 <td>${pedido.id }</td>
         			
                    <td>${pagamento.nome}</td>
                    <td>${pagamento.parcelas}</td>
                    <td>5.00</td>
                    <td>100.00</td>
                    
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





