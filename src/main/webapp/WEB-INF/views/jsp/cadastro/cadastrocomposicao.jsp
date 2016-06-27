<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">

		<h3>Cadastro de Composicão</h3>
	
	
	<div id="form">
	<form id="formComposicao" action="ADDComposicao" method="POST">


		<p>ID da Composição:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly"/>

		<p>Numero da Composição:</p>
		<input name="numero"type="text" class="inp-form" />
		
			<p>Nome da Composição:</p>
		<input name="nome"type="text" class="inp-form" />



		

		

<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>

