<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edi��o de Servicos</h3>
	

	
	<div id="form">
	<form id="formServicos" action="movimentacaoservico/edicaoservico" method="POST">


		<p>Id do Servico:</p>
		<input name="id" type="text" class="inp-form" readonly="readonly" value="${servico.id}"/>

		<p>Numero do Servi�o:</p>
		<input name="numero" type="text" class="inp-form" value="${servico.numero}"/>
		<p>Nome do Servi�o:</p>
		<input name="nome" type="text" class="inp-form" value="${servico.nome}"/>
		<p>Pre�o do Servi�o:</p>
		<input name="preco" type="number" class="inp-form" value="${servico.preco}"/>
			
		
		
		<div id="botoes">
			<button class="button">Atualizar</button>
			<button class="button">Apagar</button>
		</div>
		
		</form>

</div>
