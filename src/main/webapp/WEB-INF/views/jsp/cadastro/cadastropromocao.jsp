<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Promocao</h2>


    <div id="form">
        <form id="formPromocao" action="add" method="POST">
            <p>Numero do Promocao:
           		 <input name="numero" type="text" class="inp-form"/>
            </p>
            <p>Nome da Promocao:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
            <p>Data de Inicio da Promocao:
            	<input name="datainicio" type="date" class="inp-form"
            	<fmt:formatDate type="date"  value="${promocao.datainicio}" pattern="dd/MM/yyyy"/>/>
            </p>
            <p>Data Fim da Promocao:
            	<input name="datafim" type="date" class="inp-form"
            	<fmt:formatDate type="date"  value="${promocao.datafim}" pattern="dd/MM/yyyy"/>/>
            </p>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>
</div>






