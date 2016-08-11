<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edição de Desconto</h3>
	
	
	<div id="form">
	<form id="formDesconto" action="edicao" method=POST>


		<p>ID do Desconto:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${desconto.id }"/>

		<p>Numero do Desconto:</p>
		<input name="numero"type="text" class="inp-form" value="${desconto.numero }"/>


		<p>Nome do Desconto:</p>
		<input name="nome"type="text" class="inp-form" value="${desconto.nome }"/>
		
		<p>Valor do Desconto:</p>
		<input name="valor"type="text" class="inp-form" value="${desconto.valor }"/>
		



<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>
