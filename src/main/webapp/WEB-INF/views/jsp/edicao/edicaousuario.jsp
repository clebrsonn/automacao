<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo"  class="conteudo">

<div id="page-heading"> <h1> Edi��o de Usuario </h1> </div>
 
 <form id="formUsuario" action="movimentacaousuario/edicaousuario" method="POST">

			<p>Id Usuario</p>
			<input id="id" name="id" type="text" readonly="readonly" value="${usuario.id }"/>
			<p>Nome</p>
			<input id="nome" name="nome" type="text" value="${usuario.nome }"/>
			<p>Senha</p>
			<input id="senha" name="senha" type="text" value="${usuario.senha }"/>
			<p>Email</p>
			<input id="email" name="email" type="text" value="${usuario.email }"/>
			
	
			

				
<div id="botoes">
<button class="button">Atualizar</button>
<button class="button">Apagar</button>
</div>
				

</form>
</div>