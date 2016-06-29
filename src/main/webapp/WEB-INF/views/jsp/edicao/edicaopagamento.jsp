<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edi��o de Formas de Pagamentos</h3>
	
	
	<div id="formm">
	<form id="formPagamento" action="movimentacaopagamento/edicaopagamento" method="POST">


		<p>ID da Forma de Pagamento:</p>
		<input type="text" class="inp-form"  name="id" readonly="readonly" value="${pagamento.id }"/>

		<p>Numero d Pagamento:</p>
		<input name="numero" type="text" class="inp-form" value="${pagamento.numero }"/>
		
		<p>Nome da Forma de Pagamento:</p>
		<input name="nome" type="text" class="inp-form" value="${pagamento.nome }"/>
		<p>Tipo de Forma de Pagamento:</p>
		<input name="tipo" type="text" class="inp-form" value="${pagamento.tipo }" />
		<p>Parcelas da Forma de Pagamento:</p>
		<input name="parcelas" type="text" class="inp-form" value="${pagamento.parcelas }"/>




<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>

</div>


</div>