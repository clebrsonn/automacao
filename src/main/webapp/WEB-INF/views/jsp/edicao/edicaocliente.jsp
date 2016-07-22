<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h3>Edi��o de Gerente</h3>

    <div id="form">
        <form id="formCliente" action="edicao" method="POST">


            <p>ID do Cliente:</p>
            <input name="id" type="text" class="inp-form" readonly="readonly" value="${cliente.id }"/>

            <p>Nome do Cliente:</p>
            <input name="nome" type="text" class="inp-form" value="${cliente.nome }"/>

            <p>Data Nascimento do Cliente:</p>
            <input name="dataNascimento" type="text" class="inp-form" value="${cliente.dataNascimento }"/>

            <p>Email do Cliente:</p>
            <input name="email" type="text" class="inp-form" value="${cliente.email }"/>

            <p>Telefone do Cliente:</p>
            <input name="telefone" type="text" class="inp-form" value="${cliente.telefone }"/>


            <!-- 		<p>Projeto:</p> -->


            <!-- 		<select name="projeto" id="files" class="inp-form"> -->
            <!-- 			<optgroup label="Projeto"> -->

            <!-- 							 <option value=""></option> -->

            <%-- 						<c:forEach var="projeto" items="${projetoList}"> --%>

            <%-- 					        <option value="${projeto.id}">${projeto.nome}</option> --%>
            <%-- 						</c:forEach> --%>
            <!-- 			</optgroup> -->
            <!-- 		</select> -->


            <div id="clear">&nbsp;</div>


            <div id="botoes">
                <button class="button">Atualizar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>


</div>