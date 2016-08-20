<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edicao de Pedido Venda</h3>
	
	
		<div id="form">
	<form id="formPedido" action="edicao" method="POST">


		<p>ID do Pedido:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${pedidovenda.id }"/>
		
		<p>Data:</p>
		<input name="data"type="text" class="inp-form" value="${pedidovenda.data }"/>
		
				
							<p>Tipo de Pedido:</p>
			<select name="tipo" id="files" class="inp-form">
				<optgroup label="Tipo de Pedido">

					<c:forEach var="tipo" items="${tipoList}">
						<option value="${tipo}">${tipo}</option>
					</c:forEach>


				</optgroup>
			</select>

			<p>Origem do Pedido:</p>
			<select name="origempedido" id="files" class="inp-form">
				<optgroup label="Origem do Pedido">

					<c:forEach var="origempedido" items="${origemPedidoList}">
						<option value="${origempedido}">${origempedido}</option>
					</c:forEach>

				</optgroup>
			</select>

<!-- 		<p>Mesa:</p> -->
<%-- 		<input name="mesa" type="text" class="inp-form" value="${pedido.mesa }"/> --%>
		
		<p>Status:</p>
		
						<select name="status" id="files" class="inp-form">
					        <option value="${pedidovenda.status }">${pedidovenda.status }</option>
					
			<optgroup label="Status">
				       
				        <option value="Aberto">Aberto</option>
				        <option value="Aguardando">Aguardando Preparação</option>
				        <option value="Aberto">Cancelado</option>
				        <option value="Em Preparação">Em Preparação</option>
				        <option value="Entregue">Entregue</option>
				       	<option value="Finalizado">Finalizado</option>
				        <option value="Impedido">Impedido</option>
				        <option value="Pronto">Pronto</option>
				         
			
				        
					
			</optgroup>
		</select>
		
		<p>Total:</p>
		<input name="total" type="text" class="inp-form" value="${pedidovenda.total }"/>
		
<!-- 		<p> Garcon:</p> -->
<%-- 		<input name="garcon" type="text" class="inp-form" value="${pedido.garcon }"/> --%>



<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>





