<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Cadastro de Fornecedor</h3>
	
	<div id="form">
	<form id="formFornecedor" action="AddFornecedor" method="POST">


		<p>ID do Fornecedor:</p>
		<input type="text" class="inp-form"   name="id" />

		<p>Nome Fantasia :</p>
		<input name="nomefantasia"type="text" class="inp-form"/>
		
				<p>Razao Social:</p>
		<input name="razaoSocial"type="text" class="inp-form"/>
		
				<p>cnpj:</p>
		<input name="cnpj"type="text" class="inp-form"/>
		
				<p>Inscricao Estadual:</p>
		<input name="inscricaoestadual"type="text" class="inp-form"/>


<!-- 		<p>Tipo de Objeto:</p> -->

<!-- 		<select name="tipo" class="inp-form"> -->
<!-- 			<optgroup label="Tipo de Objeto"> -->
<!-- 				<option  value="WORKFLOW PROCESS">workflow process</option> -->
<!-- 				<option  value="BS">BS</option> -->
<!-- 				<option  value="LOV">LOV</option> -->
<!-- 				<option  value="DVM">DVM</option> -->
<!-- 			</optgroup> -->
	
<!-- 		</select> -->

<%-- 	<c:forEach var="obj" items="${objeto}"> --%>
<%--     NOME: ${obj.nome} Name: ${obj.tipo}<br/> --%>
<%--   	</c:forEach> --%>



<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>

</div>

</div>

