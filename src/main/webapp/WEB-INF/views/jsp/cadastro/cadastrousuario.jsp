<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">
<h3> Cadastro Usuario </h3> 
<div id="form"> 
 
 <form id="formUsuario" action="AddUsuario" method="POST">

			<p>Id Usuario</p>
			<input id="id" name="id" type="text" readonly="readonly"/>
			
			
			<p>Nome</p>
			<input id="nome" name="nome" type="text" />
				<p>Senha</p>
			<input id="senha" name="senha" type="text" />
			
		

			
			<p>Email</p>
			<input id="email" name="email" type="text" />
			
	
			

				
<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>
				

</form>
</div>
</div>
