<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

	<h2>Cadastro Empresa</h2>


	<div id="form">
		<form id="formEmpresa" action="add" method="POST">
		

<!-- 				DADOS DO REGISTRO DIVIDIDOS EM DOIS PARAGRAFOS	 -->
			
			<fieldset>
				
				<legend>Dados do Registro</legend>
			
			
				<p>Data Criacao:
					<input name="datacriacao" type="date" class="inp-form" />
					<fmt:formatDate type="date"  value="${registro.data}" pattern="dd/MM/yyyy"/>
				
				
				Usuario Criou:
				<input name="usuario" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
			
				Data Ultima Modificacao:
				<input name="datamodificacao" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.datamodificacao}" pattern="dd/MM/yyyy"/>
				
				</p>
				
				<p>
				
				Usuario Modificou:
				<input name="usuario" type="text" class="inp-form"/>
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
				
				Status:
				<input name="status" type="text" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/>
				
			</p>
			
			</fieldset>		


		<fieldset>
				
				<legend>Dados da Empresa</legend>
			



			<p>Razao Social:
				<input name="razaosocial" type="text" class="inp-form" required />
			</p>

			<p>Nome Fantasia:
				<input name="nomefantasia" type="text" class="inp-form" required />
			</p>

			<p>CNPJ:
				<input name="cnpj" type="text" class="inp-form" />
			</p>

			<p>Inscricao Estadual:
				<input name="inscricaoestadual" type="text" class="inp-form" />
			</p>

			<p>Logomarca:
				<input name="logo" type="text" class="inp-form" />
			</p>

			<p>Data Abertura:
				<input name="dataabertura" type="text" class="inp-form" />
					<fmt:formatDate type="date"  value="${empresa.dataabertura}" pattern="dd/MM/yyyy"/>
				
			</p>

			<!-- <p>Inscrição estadual:</p>
			<input name="inscricaoestadual" type="text" class="inp-form" required />
 -->

			<!--              <p>Data de Abertura:</p>
            <input name="dataabertura" type="text" class="inp-form" required/>
-->


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
			
	</fieldset>


		</form>
	</div>


</div>
