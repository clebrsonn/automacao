<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h3>Cadastro de Serviços</h3>

    <div id="form">
        <form id="formServicos" action="add" method="POST">
            <p>Numero do Serviço:</p>
            <input name="numero" type="text" class="inp-form"/>
            <p>Nome do Serviço:</p>
            <input name="nome" type="text" class="inp-form"/>
            <p>Preço do Serviço:</p>
            <input name="preco" type="text" class="inp-form"/>

            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>

    </div>
</div>