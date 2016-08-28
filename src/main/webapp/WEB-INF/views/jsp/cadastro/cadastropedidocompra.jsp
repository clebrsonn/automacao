<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2 class="title">Cadastro de Pedido Compra</h2>


    <div id="form">
        <form id="formPedido" action="add" method="POST">
        
        
 		
<!-- 				DADOS DO REGISTRO DIVIDIDOS EM DOIS PARAGRAFOS	 -->
			
			<fieldset>
				
				<legend>Dados do Registro</legend>
			
			
				<p>Data Criacao:
					<input name="datacriacao" type="date" class="inp-form" />
					<fmt:formatDate type="date"  value="${registro.data}" pattern="dd/MM/yyyy"/>
				
				
				Usuario Criou:
				<input name="usuario" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
			
				Data Ultima Modificacao:
				<input name="datamodificacao" type="date" class="inp-form" />
				<fmt:formatDate type="date"  value="${registro.datamodificacao}" pattern="dd/MM/yyyy"/>
				
				</p>
				
				<p>
				
				Usuario Modificou:
				<input name="usuario" type="text" class="inp-form"/>
				<fmt:formatDate type="date"  value="${registro.usuario}" pattern="dd/MM/yyyy"/>
				
				
				Status:
				<input name="status" type="text" class="inp-form" />
				
				
			</p>
			
			</fieldset>
			
			
			
			<fieldset>
				
				<legend>Dados do Pedido de Compra</legend>
			      
           
            <p>Data:
	            <input name="data" type="text" class="inp-form"/>
				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/>			
			</p>
<!--             <p>Tipo de Pedido:</p> -->
<!--             <select name="tipo" id="files" class="inp-form"> -->
<!--                 <optgroup label="Tipo de Pedido"> -->

<%--                     <c:forEach var="garcon" items="${tipoList}"> --%>
<%--                         <option value="${garcon.id}">${garcon.nome}</option> --%>
<%--                     </c:forEach> --%>


<!--                 </optgroup> -->
<!--             </select> -->


            <p>Fornecedor:
            <select name="fornecedor" id="files" class="inp-form">
                <optgroup label="fornecedor">

                    <c:forEach var="fornecedor" items="${fornecedorList}">
                        <option value="${fornecedor.id}">${fornecedor.nomefantasia}</option>
                    </c:forEach>


                </optgroup>
            </select>
			</p>
            <p>Status:
            <select name="status" id="files" class="inp-form">
                <optgroup label="Status do Pedido">

                    <c:forEach var="tipostatus" items="${tipoStatusList}">
                        <option value="${tipostatus}">${tipostatus}</option>
                    </c:forEach>


                </optgroup>
            </select>
			</p>
			
            <p>Total:
            	<input name="total" type="text" class="inp-form" disabled="disabled"/>
			</p>
<!--             <p> Garcon:</p> -->

<!--             <select name="tipo" id="files" class="inp-form"> -->
<!--                 <optgroup label="Garçon"> -->

<%--                     <c:forEach var="garcon" items="${garconList}"> --%>
<%--                         <option value="${garcon.id}">${garcon.nome}</option> --%>
<%--                     </c:forEach> --%>


<!--                 </optgroup> -->
<!--             </select> -->

		</fieldset>

            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>


</div>
<!-- end content-table-inner -->






