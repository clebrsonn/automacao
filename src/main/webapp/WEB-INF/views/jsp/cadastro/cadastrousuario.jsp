<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">
<h2> Cadastro Usuario </h2> 
<div id="form"> 
 
 <form id="formUsuario" action="add" method="POST">

			<p>Id Usuario</p>
			<input id="id" name="id" type="text" readonly="readonly"/>
			
			
			<p>Nome</p>
			<input id="nome" name="nome" type="text" />
			
			<p>Senha</p>
			<input id="senha" name="senha" type="text" />
			
            <p> Tipo:</p>
            <select id="tipo" name="tipo" id="files" class="inp-form">           
                <optgroup label="Tipos de Usuario">
           			<c:forEach var="tipo" items="${tipoList}">
           			
           				<option value="${tipo}">${tipo}</option>
           				      				
           				
       				</c:forEach>
                </optgroup>
            </select>
			
			<p>Email</p>
			<input id="email" name="email" type="text" />
			
	
			

				
<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>
				

</form>
</div>
</div>

