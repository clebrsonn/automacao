<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Promoção</h2>


    <div id="form">
        <form id="formPromocao" action="add" method="POST">
            <p>Numero do Promocao:</p>
            <input name="numero" type="text" class="inp-form"/>
            <p>Nome da Promocao:</p>
            <input name="nome" type="text" class="inp-form"/>
            <p>Data de Inicio da Promocao:</p>
            <input name="datainicio" type="text" class="inp-form"/>
            <p>Data Fim da Promocao:</p>
            <input name="datafim" type="text" class="inp-form"/>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>
</div>






