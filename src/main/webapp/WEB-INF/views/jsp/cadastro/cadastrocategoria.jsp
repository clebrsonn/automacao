<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="content" class="content">

    <h3>Cadastro de Categorias</h3>


    <div id="form">
        <form id="formCategoria" action="add" method="POST">

            <p> Categoria Pai:</p>
            <select id="catpai" name="catpai" id="files" class="inp-form">
                <option value=""></option>

                <optgroup label="Categoria Pai">
                    <c:forEach var="categoria" items="${categoriaList}">
                        <option value="${categoria.id}">${categoria.nome}</option>
                    </c:forEach>

                </optgroup>
            </select>


            <p>Nome da Categoria:</p>
            <input name="nome" type="text" class="inp-form"/>


            <div id="botoes">

                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>


</div>









