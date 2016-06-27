<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="content" class="content">

		<h3>Cadastro de Categorias</h3>
	
	
	<div id="form">
	<form id="formCategoria" action="AddCategoria" method="POST">



		<p>ID da Categoria:</p>
		<input name="id" type="text" class="inp-form" readonly="readonly" />


		<p>Nome da Categoria:</p>
		<input name="nome"type="text" class="inp-form" />





		<div id="botoes">
				
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
				
		
		</div>
		
			</form>
		</div>





</div>









