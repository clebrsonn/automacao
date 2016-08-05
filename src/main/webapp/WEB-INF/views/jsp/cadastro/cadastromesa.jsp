<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h3>Cadastro de Mesa</h3>


    <div id="form">
        <form id="formMesa" action="add" method="POST">
            <p>Numero da Mesa:</p>
            <input name="numero" type="text" class="inp-form"/>

            <p>Status:</p>
            <select id="status" name="status" id="files" class="inp-form">
                <optgroup label="Tipo de Pedido">

                    <option value="Disponivel">Disponivel</option>
                    <option value="Indisponivel">Indisponivel</option>
                    <option value="Avariada">Avariada</option>


                </optgroup>
            </select>

            <!-- 		<p> Projeto:</p> -->


            <!-- 		<select name="projeto" id="files" class="inp-form"> -->
            <!-- 			<optgroup label="Projeto"> -->

            <!-- 						 <option value=""></option> -->

            <%-- 						<c:forEach var="projeto" items="${projetoList}"> --%>

            <%-- 					        <option value="${projeto.id}">${projeto.nome}</option> --%>
            <%-- 						</c:forEach> --%>
            <!-- 			</optgroup> -->

            <!-- 		</select> -->

            <!-- 		<button class="form-submit">Add</button> -->


            <div id="botoes">

                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>


            </div>

        </form>
    </div>
</div>
		








