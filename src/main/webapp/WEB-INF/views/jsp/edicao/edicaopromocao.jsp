<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

				<h3>Edição de Promoção</h3>
	
	
	<div id="form">
	<form id="formPromocao" action="edicao" method="POST">


		<p>ID do Promocao:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${promocao.id }"/>
		
		<p>Numero do Promocao:</p>
		<input name="numero"type="text" class="inp-form" value="${promocao.numero }"/>
		<p>Nome da Promocao:</p>
		<input name="nome"type="text" class="inp-form" value="${promocao.nome }"/>
		<p>Data de Inicio da Promocao:</p>
		<input name="datainicio"type="text" class="inp-form" value="${promocao.datainicio }"/>
		<p>Data Fim da Promocao:</p>
		<input name="datafim"type="text" class="inp-form" value="${promocao.datafim }"/>
		

<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>