<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Garçon</h2>


    <div id="form">
        <form id="formGarcon" action="add" method="POST">
            <p>Nome do Garcon:
            	<input name="nome" type="text" class="inp-form"/>
            </p>


            <!-- 		<p>Líder do Projeto:</p> -->


            <!-- 		<select name="lider" id="files" class="inp-form"> -->
            <!-- 		<optgroup label="Lideres"> -->

            <!-- 		        <option value=""></option> -->

            <%-- 			<c:forEach var="lider" items="${liderList}"> --%>
            <%-- 				<option value="${lider.id}">${lider.nome}</option> --%>


            <%-- 				</c:forEach>  --%>
            <!-- 			</optgroup> -->
            <!-- 		</select> -->


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>


</div>








