<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Composicão</h2>


    <div id="form">
        <form id="formComposicao" action="add" method="POST">

            <p>Numero da Composição:</p>
            <input name="numero" type="text" class="inp-form"/>

            <p>Nome da Composição:</p>
            <input name="nome" type="text" class="inp-form"/>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>


</div>

