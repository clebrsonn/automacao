<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Fornecedor</h2>

    <div id="form">
        <form id="formFornecedor" action="add" method="POST">
        
        
        
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
				
				<legend>Dados do Fornecedor</legend>
			
 

            <p>Nome Fantasia :
            	<input name="nomefantasia" type="text" class="inp-form"/>
            </p>

            <p>Razao Social:
            	<input name="razaoSocial" type="text" class="inp-form"/>
            </p>

            <p>cnpj:
           	 	<input name="cnpj" type="text" class="inp-form"/>
            </p>

            <p>Inscricao Estadual:
            	<input name="inscricaoestadual" type="text" class="inp-form"/>
            </p>


            <!-- 		<p>Tipo de Objeto:</p> -->

            <!-- 		<select name="tipo" class="inp-form"> -->
            <!-- 			<optgroup label="Tipo de Objeto"> -->
            <!-- 				<option  value="WORKFLOW PROCESS">workflow process</option> -->
            <!-- 				<option  value="BS">BS</option> -->
            <!-- 				<option  value="LOV">LOV</option> -->
            <!-- 				<option  value="DVM">DVM</option> -->
            <!-- 			</optgroup> -->

            <!-- 		</select> -->

            <%-- 	<c:forEach var="obj" items="${objeto}"> --%>
            <%--     NOME: ${obj.nome} Name: ${obj.tipo}<br/> --%>
            <%--   	</c:forEach> --%>
            
            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>
	</fieldset>


        </form>

    </div>

</div>

