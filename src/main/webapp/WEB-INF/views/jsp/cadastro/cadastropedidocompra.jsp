<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2 class="title">Cadastro de Pedido Compra</h2>


    <div id="form">
        <form id="formPedido" action="add" method="POST">
           
            <p>Data:</p>
            <input name="data" type="text" class="inp-form"/>

<!--             <p>Tipo de Pedido:</p> -->
<!--             <select name="tipo" id="files" class="inp-form"> -->
<!--                 <optgroup label="Tipo de Pedido"> -->

<%--                     <c:forEach var="garcon" items="${tipoList}"> --%>
<%--                         <option value="${garcon.id}">${garcon.nome}</option> --%>
<%--                     </c:forEach> --%>


<!--                 </optgroup> -->
<!--             </select> -->


            <p>Fornecedor:</p>
            <select name="fornecedor" id="files" class="inp-form">
                <optgroup label="fornecedor">

                    <c:forEach var="fornecedor" items="${fornecedorList}">
                        <option value="${fornecedor.id}">${fornecedor.nomefantasia}</option>
                    </c:forEach>


                </optgroup>
            </select>

            <p>Status:</p>
            <select name="status" id="files" class="inp-form">
                <optgroup label="Status do Pedido">

                    <c:forEach var="tipostatus" items="${tipoStatusList}">
                        <option value="${tipostatus}">${tipostatus}</option>
                    </c:forEach>


                </optgroup>
            </select>

            <p>Total:</p>
            <input name="total" type="text" class="inp-form" disabled="disabled"/>

<!--             <p> Garcon:</p> -->

<!--             <select name="tipo" id="files" class="inp-form"> -->
<!--                 <optgroup label="Garçon"> -->

<%--                     <c:forEach var="garcon" items="${garconList}"> --%>
<%--                         <option value="${garcon.id}">${garcon.nome}</option> --%>
<%--                     </c:forEach> --%>


<!--                 </optgroup> -->
<!--             </select> -->


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>


</div>
<!-- end content-table-inner -->






