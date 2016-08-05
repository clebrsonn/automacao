<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Edição de Despesa</h3>
	

	
	<div id="form">
		<form id="formDespesa" action="edicao" method="POST">


		<p>ID da Despesa:</p>
		<input type="text" class="inp-form"  name="id" readonly="readonly" value="${despesa.id }"/>

		<p>Nome da Despesa:</p>
		<input name="nome" type="text" class="inp-form"  value="${despesa.nome }"/>
		
		<p>Valor da Despesa:</p>
		<input name="valor" type="text" class="inp-form"  value="${despesa.valor }"/>



<div id="botoes">


<button class="button">Adicionar</button>
<button class="button">Apagar</button>



</div>

	</form>
</div>


</div>









