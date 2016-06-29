<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edição de Bug</h3>
	
	
		<div id="form">
	<form id="formProduto" action="movimentacaoproduto/edicaoproduto" method="POST">


		<p>ID do Produto:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" value="${produto.id}"/>
		
		<p>Código de Barra do Produto:</p>
		<input name="codebar"type="text" class="inp-form" value="${produto.codebar}"/>
		

		<p>Descrição do Produto:</p>
		<input name="descricao" type="text" class="inp-form" value="${produto.descricao}"/>
		
		<p>Preço Custo do Produto:</p>
		<input name="precoCusto" type="text" class="inp-form" value="${produto.precoCusto}"/>
		
		<p>Preço Venda do Produto:</p>
		<input name="precoVenda" type="text" class="inp-form" value="${produto.precoVenda}"/>
		
		<p> Um do Produto:</p>
		<input name="um" type="text" class="inp-form" value="${produto.um}"/>



<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>
</div>





