<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Desconto</h2>


    <div id="form">
        <form id="formDesconto" action="add" method=POST>

            <p>Numero do Desconto:</p>
            <input name="numero" type="text" class="inp-form"/>


            <p>Nome do Desconto:</p>
            <input name="nome" type="text" class="inp-form"/>

            <p>Valor do Desconto:</p>
            <input name="valor" type="text" class="inp-form"/>


            <div id="clear">&nbsp;</div>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>


</div>



