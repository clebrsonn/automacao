<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Cadastro de Gar�on</h3>
	
	
	<div id="form">
	<form id="formGarcon" action="AddGarcon" method="POST">

	<p>ID do Garcon:</p>
		<input name="id"type="text" class="inp-form" />
		
		
		<p>Nome do Garcon:</p>
		<input name="nome"type="text" class="inp-form" />



<!-- 		<p>L�der do Projeto:</p> -->



<!-- 		<select name="lider" id="files" class="inp-form"> -->
<!-- 		<optgroup label="Lideres"> -->
		        
<!-- 		        <option value=""></option> -->
			
<%-- 			<c:forEach var="lider" items="${liderList}"> --%>
<%-- 				<option value="${lider.id}">${lider.nome}</option> --%>
				
				
<%-- 				</c:forEach>  --%>
<!-- 			</optgroup> -->
<!-- 		</select> -->



<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>







