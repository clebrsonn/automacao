<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

	<h2>Cadastro de Pedido Venda</h2>


	<div id="form">
		<form id="formPedido" action="add" method="POST">
			<p>Data:
				<input name="data" type="text" class="inp-form" />
			</p>
			
		<p>Tipo de Pedido:
			<select name="tipo" id="files" class="inp-form">
				<optgroup label="Tipo de Pedido">

					<c:forEach var="tipo" items="${tipoList}">
						<option value="${tipo}">${tipo}</option>
					</c:forEach>


				</optgroup>
			</select>
		</p>

		<p>Origem do Pedido:
			<select name="origempedido" id="files" class="inp-form">
				<optgroup label="Origem do Pedido">

					<c:forEach var="origempedido" items="${origemPedidoList}">
						<option value="${origempedido}">${origempedido}</option>
					</c:forEach>

				</optgroup>
			</select>
		</p>

<!-- 			<p>Mesa:</p> -->
<!-- 			<select name="mesa" id="files" class="inp-form"> -->
<!-- 				<optgroup label="Mesas"> -->

<%-- 					<c:forEach var="mesa" items="${mesaList}"> --%>
<%-- 						<option value="${mesa.id}">${mesa.numero}</option> --%>
<%-- 					</c:forEach> --%>


<!-- 				</optgroup> -->
<!-- 			</select> -->

		<p>Status:
			<select name="status" id="files" class="inp-form">
				<optgroup label="Status do Pedido">

					<c:forEach var="tipostatus" items="${tipoStatusList}">
						<option value="${tipostatus}">${tipostatus}</option>
					</c:forEach>


				</optgroup>
			</select>
		</p>

		<p>Total:
			<input name="total" type="text" class="inp-form" disabled="disabled" />
		</p>
			<!--  -->
		
		<p>Cliente:
			<select name="cliente" id="files" class="inp-form">
				<optgroup label="Cliente">

					<c:forEach var="cliente" items="${clienteList}">
						<option value="${cliente.id}">${cliente.nome}</option>
					</c:forEach>


				</optgroup>
			</select>
		</p>

			<!--  div botões -->
			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
			</div>

		</form>
	</div>


</div>
<!-- end content-table-inner -->






