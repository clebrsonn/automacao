<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

<h3>Edição de Reserva</h3>
	
	
	<div id="formm">
	<form id="formReserva" action="edicao" method="POST">


		<p>ID da Reserva:</p>
		<input type="text" class="inp-form"  name="id" value="${reserva.id }"/>

		<p>Numero da Reserva:</p>
		<input name="numero" type="text" class="inp-form" value="${reserva.numero }"/>
		
			<p>Data da Reserva:</p>
		<input name="data" type="text" class="inp-form" value="${reserva.data }"/>
		
			<p>Hora da Reserva:</p>
		<input name="hora" type="text" class="inp-form" value="${reserva.hora }"/>
		
			<p>Mesa  Reservada:</p>
		<input name="mesa" type="text" class="inp-form" value="${reserva.mesa }" />

<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>

</div>
</div>
