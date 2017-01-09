<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edicao de Pedido Venda</h3>
	
	
		<div id="form">
	<form id="formPedido" action="edicao" method="POST">


		<p>ID do Pedido:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${pedidovenda.id}"/>
		
		<p>Data:</p>
		<input name="data"type="text" class="inp-form" value="${pedidovenda.data}"/>
		<fmt:formatDate type="date" pattern="yyyy/MM/dd" value=""/>
		
		
				
				<p>Tipo:</p>
				<select name="tipo" id="files" class="inp-form">
			<option value="${pedidovenda.tipo }">${pedidovenda.tipo }</option>		
			<optgroup label="Tipo de Pedido Venda">
			
			<c:forEach var="tipo" items="${tipoList}">

						<option value="${tipo}">${tipo}</option>


					</c:forEach>	         
			
				        
					
			</optgroup>
		</select>
		
		
				       
<p>Origem Pedido:</p>
			<select id="origempedido" name="origempedido" id="files" class="inp-form">

				<option value="${pedidovenda.origempedido}">${pedidovenda.origempedido}</option>


				<optgroup label="Origem do Pedido de venda">


					<c:forEach var="origempedido" items="${origemPedidoList}">

						<option value="${origempedido}">${origempedido}</option>


					</c:forEach>	         
			
				        
					
			</optgroup>
		</select>

<!-- 		<p>Mesa:</p> -->
<%-- 		<input name="mesa" type="text" class="inp-form" value="${pedidovenda.mesa }"/> --%>
		
		<p>Status:</p>
		
						<select name="status" id="files" class="inp-form">
					        <option value="${pedidovenda.status }">${pedidovenda.status }</option>
					
					<optgroup label="Status do Pedido de venda">


					<c:forEach var="statuspedido" items="${tipoStatusList}">

						<option value="${statuspedido}">${statuspedido}</option>


					</c:forEach>	         
			
				        
					
			</optgroup>
		</select>
		
		<p>Total:</p>
		<input name="total" type="text" class="inp-form" value="${pedidovenda.total}"/>
		
<!-- 		<p> Garcon:</p> -->
<%-- 		<input name="garcon" type="text" class="inp-form" value="${pedido.garcon }"/> --%>



<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>





