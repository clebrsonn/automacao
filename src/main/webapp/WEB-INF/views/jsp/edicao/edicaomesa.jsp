<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

		<h3>Edição de Mesa</h3>
	
	<div id="form">
	<form id="formMesa" action="movimentacaomesa/editarmesa" method="get">


		<p>ID Mesa:</p>
		<input type="text" class="inp-form"   name="id" value="${mesa.id}"/>

		<p>Numero Mesa:</p>
		<input name="nome"type="text" class="inp-form" value="${mesa.numero }"/>


		<p>Status:</p>

		<select id="status"name="status" id="files" class="inp-form">
		
						        <option value="${mesa.status }">${mesa.status }</option>
		
			<optgroup label="Tipo de Pedido">
				       
				        <option value="Disponivel">Disponivel</option>
				        <option value="Indisponivel">Indisponivel</option>
				        <option value="Avariada">Avariada</option>
				         
			
				        
					
			</optgroup>
		</select>

<%-- 	<c:forEach var="obj" items="${objeto}"> --%>
<%--     NOME: ${obj.nome} Name: ${obj.tipo}<br/> --%>
<%--   	</c:forEach> --%>
	

<div id="clear">&nbsp;</div>
<div id="clear">&nbsp;</div>




<button class="form-submit">Update</button>
<!-- 		<input type="button" value="" class="form-submit" />  -->
		<input	type="reset" value="" class="form-reset" />

	</form>

</div>

</div>
<!--  end content-table-inner  -->
	<div id="clear">&nbsp;</div>
	<div id="clear">&nbsp;</div>
	<div id="clear">&nbsp;</div>
<!-- 			
				<div id="message-green" class="message-green"> -->
<!-- 				<table border="0" width="100%" cellpadding="0" cellspacing="0"> -->
<!-- 				<tr> -->
<%-- 					<td class="green-left">${msg} <a href="cadastroobjeto">Add new.</a></td> --%>
<!-- 					<td class="green-right"><a class="close-green"><img src="resources/images/table/icon_close_green.gif"   alt="" /></a></td> -->
<!-- 				</tr> -->
<!-- 				</table> -->
<!-- 				</div> -->

<div id="clear">&nbsp;</div>
<div id="clear">&nbsp;</div>
<div id="clear">&nbsp;</div>
