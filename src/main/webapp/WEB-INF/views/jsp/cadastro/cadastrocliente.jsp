<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Clientes</h2>


    <div id="form">
        <form id="formCliente" action="add" method="POST">


            <%--<p>ID do Cliente:</p>--%>
            <%--<input name="id"type="text" class="inp-form" readonly="readonly" />--%>

            <p>Nome do Cliente:
            <input name="nome" type="text" class="inp-form"/></p>

            <p>Data Nascimento :
            <input name="dataNascimento" type="date" class="inp-form"
            <fmt:formatDate type="date"  value="${cliente.dataNascimento}" pattern="dd/MM/yyyy"/> /> </p>


            <p>Email do Cliente:
            <input name="email" type="email" class="inp-form"/></p>

            <p>Telefone do Cliente:
            <input name="telefone" type="tel" class="inp-form"/></p>


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
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>


</div>
<!-- end content-table-inner -->

<div id="clear">&nbsp;</div>
<div id="clear">&nbsp;</div>








