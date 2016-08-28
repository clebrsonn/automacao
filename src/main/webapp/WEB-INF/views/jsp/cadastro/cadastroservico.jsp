<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Servico</h2>

    <div id="form">
        <form id="formServicos" action="add" method="POST">
        
        

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
				
				<legend>Dados do Servico</legend>

            <p>Numero do Servico:
            	<input name="numero" type="text" class="inp-form"/>
            </p>
            <p>Nome do Servico:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
            <p>Preco do Servico:
            	<input name="preco" type="text" class="inp-form"/>
            </p>
            
             <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>
            
          </fieldset>  



        </form>

    </div>
</div>