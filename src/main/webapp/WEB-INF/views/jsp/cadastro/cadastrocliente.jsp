<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Clientes</h2>


  <div id="form">
      <form id="formCliente" action="add" method="POST">


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
<!-- 			FIM DADOS DO REGISTRO -->
			
			
			
			
	<fieldset>
	
		<legend>Dados do Cliente</legend>

            <%--<p>ID do Cliente:</p>--%>
            <%--<input name="id"type="text" class="inp-form" readonly="readonly" />--%>

            <p>Nome do Cliente:
            <input name="nome" type="text" class="inp-form"/></p>

            <p>Data Nascimento :
            <input name="dataNascimento" type="text" class="inp-form"
            <fmt:formatDate type="date"  value="${cliente.dataNascimento}" pattern="dd/MM/yyyy"/> /> </p>


            <p>Email do Cliente:
            <input name="email" type="email" class="inp-form"/></p>

            <p>Telefone do Cliente:
            <input name="telefone" type="tel" class="inp-form"/></p>
			
            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>
			
	</fieldset>

            <!-- 		<p>Projeto:</p> -->


            <!-- 		<select name="projeto" id="files" class="inp-form"> -->
            <!-- 			<optgroup label="Projeto"> -->

            <!-- 							 <option value=""></option> -->

            <%-- 						<c:forEach var="projeto" items="${projetoList}"> --%>

            <%-- 					        <option value="${projeto.id}">${projeto.nome}</option> --%>
            <%-- 						</c:forEach> --%>
            <!-- 			</optgroup> -->
            <!-- 		</select> -->


        </form>
    </div>


</div>
<!-- end content-table-inner -->

<div id="clear">&nbsp;</div>
<div id="clear">&nbsp;</div>








