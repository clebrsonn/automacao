<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Promocao</h2>


    <div id="form">
        <form id="formPromocao" action="add" method="POST">
        
 
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
				<fmt:formatDate type="date"  value="${registro.status}" pattern="dd/MM/yyyy"/>
				
			</p>
			
			</fieldset>       
        
      <fieldset>
				
		<legend>Dados da Promocao</legend>
        
            <p>Numero do Promocao:
           		 <input name="numero" type="text" class="inp-form"/>
            </p>
            <p>Nome da Promocao:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
            <p>Data de Inicio da Promocao:
            	<input name="datainicio" type="date" class="inp-form"
            	<fmt:formatDate type="date"  value="${promocao.datainicio}" pattern="dd/MM/yyyy"/>/>
            </p>
            <p>Data Fim da Promocao:
            	<input name="datafim" type="date" class="inp-form"
            	<fmt:formatDate type="date"  value="${promocao.datafim}" pattern="dd/MM/yyyy"/>/>
            </p>

	</fieldset>
            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>
    </div>
</div>






