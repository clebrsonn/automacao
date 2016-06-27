<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

<h3>Edição de Categoria</h3>
	
<div id="form">
	<form id="formCategoria" action="movimentacaocategoria/editarCategoria" method="GET">



		<p>ID da Categoria:</p>
		<input name="id" type="text" class="inp-form" readonly="readonly" value="${categoria.id}" />


		<p>Nome da Categoria:</p>
		<input name="nome"type="text" class="inp-form" value="${categoria.nome}"/>





		<div id="botoes">
				
				<button class="button">Atualizar</button>
				<button class="button">Apagar</button>
				
		
		</div>
	
	
	
</div>
