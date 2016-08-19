<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h3>Edicao de EMPRESA</h3>

    <div id="form">
        <form id="formFornecedor" action="edicao" method="POST">


            <p>ID do Fornecedor:</p>
            <input type="text" class="inp-form" name="id" value="${fornecedor.id }"/>

            <p>Nome Fantasia :</p>
            <input name="nomefantasia" type="text" class="inp-form" value="${fornecedor.nomefantasia }"/>

            <p>Razao Social:</p>
            <input name="razaoSocial" type="text" class="inp-form" value="${fornecedor.razaoSocial }"/>

            <p>cnpj:</p>
            <input name="cnpj" type="text" class="inp-form" value="${fornecedor.cnpj }"/>

            <p>Inscricao Estadual:</p>
            <input name="inscricaoestadual" type="text" class="inp-form" value="${fornecedor.inscricaoestadual }"/>


            <!-- 		<p>Tipo de Objeto:</p> -->

            <!-- 		<select name="tipo" class="inp-form"> -->
            <!-- 			<optgroup label="Tipo de Objeto"> -->
            <!-- 				<option  value="WORKFLOW PROCESS">workflow process</option> -->
            <!-- 				<option  value="BS">BS</option> -->
            <!-- 				<option  value="LOV">LOV</option> -->
            <!-- 				<option  value="DVM">DVM</option> -->
            <!-- 			</optgroup> -->

            <!-- 		</select> -->

            <%-- 	<c:forEach var="obj" items="${objeto}"> --%>
            <%--     NOME: ${obj.nome} Name: ${obj.tipo}<br/> --%>
            <%--   	</c:forEach> --%>


            <div id="botoes">
                <button class="button">Atualizar</button>
                <button class="button">Apagar</button>
            </div>

        </form>

    </div>

</div>
