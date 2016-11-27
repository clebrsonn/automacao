<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h2>Cadastro de Devolucao de Venda</h2>
	
	
	<div id="form">
		<form id="formRecebimentos" action="add" method="POST">
			<fieldset>
				<legend>Dados Pedido de Venda</legend>

			<div id="dadospedido" class="dadospedido">
	
	           ID do Pedido Venda: 
	           <input id="idpedidovenda" name="idpedidovenda" type="text" class="idpedido" value="${pv.id }"/>
	
			   <button class="button"formaction="CarregarPedidoVenda" formmethod="get">carregarPedidoVenda</button>
	
						
	            ID Cliente:
	            <input name="idcliente" type="text" class="tipo" value="${pv.cliente }"/>
				
	<!-- 			Total: -->
	<!-- 			<input id="totalpedido" name="totalpedido" type="text" class="totalpedido" /> -->
	
	
	
				Status:
				<select name="status" id="status" class="status">
					<optgroup label="Status do Pedido">
								<option value="${pv.status}">${pv.status}</option>
					</optgroup>
				</select>
					
				Data Compra
				<input id="datacompra" name="datacompra"  type="date" value="${pv.datacompra}"
				<fmt:formatDate pattern="dd/MM/yyyy" value="${pv.datacompra}"/> />
	        
		</div>
		</fieldset>
		
		
		<fieldset>
		
		<legend>Dados da Devolucao</legend>
				
				Data Devolucao		
				<input id="data" name="data"  type="date" value="${pv.data}"/>
				<fmt:formatDate pattern="dd/MM/yyyy" value="${pv.data}"/>
    
    			<div id="botoes">
			
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
				
			</div>
      </fieldset> 
      
      </br>
      </br>  
	
		</div>
		

			
					
		</div>

		
		      <table border="0" width="75%"cellpadding="0" cellspacing="0"  class="product-table2">
    			 <th class="table-header-check"><a id="toggle-all" ></a> </th>
                 <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Pedido Compra </a></th>         
               	 <th class="table-header-repeat line-left minwidth-1"><a>Codigo de Barras</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Preco Unitario</a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th>             
	             <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>                                  
                 <th class="table-header-repeat line-left"><a>Acao</a></th>
                 
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

