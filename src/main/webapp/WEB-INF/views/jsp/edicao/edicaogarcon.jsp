<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

<h3>Edi��o de Gar�on</h3>
	
		<div id="form">
	<form id="formGarcon" action="movimentacaogarcon/edicaogarcon" method="POST">

	<p>ID do Garcon:</p>
		<input name="id"type="text" class="inp-form" value="${garcon.id }"/>
		
		
		<p>Nome do Garcon:</p>
		<input name="nome"type="text" class="inp-form" value="${garcon.nome }" />





<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>
