<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Categorias</h2>


    <div id="form">
        <form id="formCategoria" action="add" method="POST">


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
		<legend>Dados da Categoria</legend>

            <p>Categoria Pai:
	            <select id="catpai" name="catpai" id="files" class="inp-form">
	                <option value=""></option>
	
	                <optgroup label="Categoria Pai">
	                    <c:forEach var="categoria" items="${categoriaList}">
	                        <option value="${categoria.id}">${categoria.nome}</option>
	                    </c:forEach>
	
	                </optgroup>
            	</select>
            </p>


            <p>Nome da Categoria:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
	</fieldset>

            <div id="botoes">

                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>


</div>









