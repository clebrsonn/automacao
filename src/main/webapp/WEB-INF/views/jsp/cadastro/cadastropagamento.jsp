<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<div id="conteudo" class="conteudo">


    <h3>Cadastro de Formas de Pagamentos</h3>


    <div id="formm">
        <form id="formPagamento" action="add" method="POST">
            <p>Numero d Pagamento:</p>
            <input name="numero" type="text" class="inp-form"/>

            <p>Nome da Forma de Pagamento:</p>
            <input name="nome" type="text" class="inp-form"/>
            <p>Tipo de Forma de Pagamento:</p>
            <input name="tipo" type="text" class="inp-form"/>
            <p>Parcelas da Forma de Pagamento:</p>
            <input name="parcelas" type="text" class="inp-form"/>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>

    </div>


</div>



	


