<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edição de Servicos</h3>
	

	
	<div id="form">
	<form id="formServicos" action="movimentacaoservico/edicaoservico" method="POST">


		<p>Id do Servico:</p>
		<input name="id" type="text" class="inp-form" readonly="readonly" value="${servico.id}"/>

		<p>Numero do Serviço:</p>
		<input name="numero" type="text" class="inp-form" value="${servico.numero}"/>
		<p>Nome do Serviço:</p>
		<input name="nome" type="text" class="inp-form" value="${servico.nome}"/>
		<p>Preço do Serviço:</p>
		<input name="preco" type="number" class="inp-form" value="${servico.preco}"/>
			
		
		
		<div id="botoes">
			<button class="button">Atualizar</button>
			<button class="button">Apagar</button>
		</div>
		
		</form>

</div>
