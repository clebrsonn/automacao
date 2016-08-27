<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="content" class="content">

    <h2>Cadastro de Categorias</h2>


    <div id="form">
        <form id="formCategoria" action="add" method="POST">

            <p> Categoria Pai:
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


            <div id="botoes">

                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>


</div>









