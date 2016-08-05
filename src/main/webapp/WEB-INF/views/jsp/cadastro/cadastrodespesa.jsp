<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<div id="conteudo" class="conteudo">


    <h3>Cadastro de Despesa</h3>


    <div id="formm">
        <form id="formDespesa" action="add" method="POST">

            <p>Nome da Despesa:</p>
            <input name="nome" type="text" class="inp-form"/>

            <p>Valor da Despesa:</p>
            <input name="valor" type="text" class="inp-form"/>

            <div id="botoes">

                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>

    </div>


    <!-- <div id="clear">&nbsp;</div> -->
    <!-- <div id="clear">&nbsp;</div> -->
    <!-- <div id="clear">&nbsp;</div> -->
    <!-- <div id="clear">&nbsp;</div> -->
    <!-- <div id="clear">&nbsp;</div> -->
    <!-- <div id="clear">&nbsp;</div> -->

</div>
<!-- end content-table-inner -->


<!-- <div id="clear">&nbsp;</div> -->
<!-- <div id="clear">&nbsp;</div> -->
<!-- <div id="clear">&nbsp;</div> -->
<!-- <div id="clear">&nbsp;</div> -->


	


