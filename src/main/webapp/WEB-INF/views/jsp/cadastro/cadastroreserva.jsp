<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

		
		<div id="conteudo" class="conteudo">
		

		<h3>Cadastro de Reserva</h3>
	
	
	<div id="formm">
	<form id="formReserva" action="add" method="POST">


		<p>ID da Reserva:</p>
		<input type="text" class="inp-form"  name="id"/>

		<p>Numero da Reserva:</p>
		<input name="numero" type="text" class="inp-form" />
		
			<p>Data da Reserva:</p>
		<input name="data" type="text" class="inp-form" />
		
			<p>Hora da Reserva:</p>
		<input name="hora" type="text" class="inp-form" />
		
			<p>Mesa  Reservada:</p>
		<input name="mesa" type="text" class="inp-form" />

<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>

</div>



</div>



	


