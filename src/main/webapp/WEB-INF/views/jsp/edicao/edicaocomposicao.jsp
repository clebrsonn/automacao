<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edi��o de Composic�o</h3>
	
	
	<div id="form">
	<form id="formComposicao" action="movimentacaocomposicao/edicaocomposicao" method="POST">


		<p>ID da Composi��o:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${composicao.id }"/>

		<p>Numero da Composi��o:</p>
		<input name="numero"type="text" class="inp-form" value="${composicao.numero }" />
		
			<p>Nome da Composi��o:</p>
		<input name="nome"type="text" class="inp-form" value="${composicao.nome }"/>



		

		

<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>

</div>
