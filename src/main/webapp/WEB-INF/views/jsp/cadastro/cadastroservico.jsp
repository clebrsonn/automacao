<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Serviços</h2>

    <div id="form">
        <form id="formServicos" action="add" method="POST">
            <p>Numero do Servico:
            	<input name="numero" type="text" class="inp-form"/>
            </p>
            <p>Nome do Servico:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
            <p>Preco do Servico:
            	<input name="preco" type="text" class="inp-form"/>
            </p>
            

            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>

    </div>
</div>