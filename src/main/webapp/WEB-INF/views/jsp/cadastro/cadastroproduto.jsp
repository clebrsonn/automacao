<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Cadastro de Produto</h3>
	
	
	<div id="form">
	<form id="formProduto" action="AddProduto" method="POST">


		<p>ID do Produto:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" />
		
		<p>Código de Barra do Produto:</p>
		<input name="codebar"type="text" class="inp-form" />
		

		<p>Descrição do Produto:</p>
		<input name="descricao" type="text" class="inp-form" />
		
		<p>Preço Custo do Produto:</p>
		<input name="precoCusto" type="text" class="inp-form" />
		
		<p>Preço Venda do Produto:</p>
		<input name="precoVenda" type="text" class="inp-form" />
		
		<p> Um do Produto:</p>
		<input name="um" type="text" class="inp-form" />



<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>
<!--  end content-table-inner  -->






