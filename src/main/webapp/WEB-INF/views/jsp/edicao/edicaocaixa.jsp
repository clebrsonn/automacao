<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h3>Edicao de Caixa</h3>

    <div id="form">
        <form id="formCategoria" action="edicao" method="POST">


            <p>ID da Categoria:</p>
            <input name="id" type="text" class="inp-form" readonly="readonly" value="${categoria.id}"/>

            <p>Categoria Pai:</p>
            <select name="catpai" id="files" class="inp-form">
                <option value="${categoria.catpai}">${categoria.catpai.nome}</option>

                <optgroup label="Categoria Pai">
                    <c:forEach var="categoria" items="${categoriaList}">


                        <option value="${categoria.id}">${categoria.nome}</option>
                    </c:forEach>

                </optgroup>
            </select>


            <p>Nome da Categoria:</p>
            <input name="nome" type="text" class="inp-form" value="${categoria.nome}"/>


            <div id="botoes">

                <button class="button">Atualizar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>
</div>
