<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edição de Pedido</h3>
	
	
		<div id="form">
	<form id="formPedido" action="edicao" method="POST">


		<p>ID do Pedido:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${pedido.id }"/>
		
		<p>Data:</p>
		<input name="data"type="text" class="inp-form" value="${pedido.data }"/>
		
				
				<p>Tipo:</p>
				<select name="tipo" id="files" class="inp-form">
			        <option value="${pedido.tipo }">${pedido.tipo }</option>
				
				
			<optgroup label="Tipo de Pedido">
				       
				        <option value="Mesa">Mesa</option>
				        <option value="Balcao">Balcao</option>
				        <option value="Delivery">Delivery</option>
				         
			
				        
					
			</optgroup>
		</select>

		<p>Mesa:</p>
		<input name="mesa" type="text" class="inp-form" value="${pedido.mesa }"/>
		
		<p>Status:</p>
		
						<select name="status" id="files" class="inp-form">
					        <option value="${pedido.status }">${pedido.status }</option>
					
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
		<input name="total" type="text" class="inp-form" value="${pedido.total }"/>
		
		<p> Garcon:</p>
		<input name="garcon" type="text" class="inp-form" value="${pedido.garcon }"/>



<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>





