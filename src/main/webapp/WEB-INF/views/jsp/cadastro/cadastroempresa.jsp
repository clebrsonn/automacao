<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

	<h2>Cadastro Empresa</h2>


	<div id="form">
		<form id="formGarcon" action="add" method="POST">

			<p>Razão Social:</p>
			<input name="razaosocial" type="text" class="inp-form" required/>

			<p>Nome Fantasia:</p>
			<input name="nomefantasia" type="text" class="inp-form" required/>

			<p>CNPJ:</p>
			<input name="cnpj" type="text" class="inp-form" required/>

			<p>Inscrição estadual:</p>
			<input name="inscricaoestadual" type="text" class="inp-form" required/>


            <p>Data de Abertura:</p>
            <input name="dataabertura" type="text" class="inp-form" required/>



            <!--     <p>L�der do Projeto:</p> -->


			<!--     <select name="lider" id="files" class="inp-form"> -->
			<!--     <optgroup label="Lideres"> -->

			<!--             <option value=""></option> -->

			<%--       <c:forEach var="lider" items="${liderList}"> --%>
			<%--         <option value="${lider.id}">${lider.nome}</option> --%>


			<%--         </c:forEach>  --%>
			<!--       </optgroup> -->
			<!--     </select> -->


			<div id="botoes">
				<button class="button">Adicionar</button>
				<button class="button">Apagar</button>
			</div>

		</form>
	</div>


</div>
