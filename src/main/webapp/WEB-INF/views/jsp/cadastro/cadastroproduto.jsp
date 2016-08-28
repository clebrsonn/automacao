<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h2>Cadastro de Produto</h2>
	
	
	<div id="form">
	<form id="formProduto" action="add" method="POST">
	
	

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
				
				<legend>Dados do Produto</legend>
			
		<p>Codigo:
			<input name="id"type="text" class="inp-form" readonly="readonly" />
		</p>
		
		<p>Barra:
			<input name="codebar"type="text" class="inp-form" />
		</p>
        
        <p> Categoria:
	          <select id="categoria" name="categoria" id="files" class="inp-form">           
	                <optgroup label="Selecione uma Categoria">
	                    <c:forEach var="categoria" items="${categoriaList}">
	                        <option value="${categoria.id}">${categoria.nome}</option>
	                    </c:forEach>
	
	                </optgroup>
	           </select>
		</p>

		<p>Descrição:
			<input name="descricao" type="text" class="inp-form" />
		</p>
		
		<p>Preço Custo:
			<input name="precoCusto" type="text" class="inp-form" />
		</p>
		<p>Preço Venda:
			<input name="precoVenda" type="text" class="inp-form" />
		</p>
		
			<p> Unidade de Medida:
            <select id="un_medida" name="un_medida" id="files" class="inp-form">           
        
                <optgroup label="Tipos de Unidade de Medida">

           			<c:forEach var="un_medida" items="${umList}">
           			
           				<option value="${un_medida}">${un_medida}</option>
           				      				
           				
       				</c:forEach>
                </optgroup>
            </select>
            </p>
           
            <p> Fornecedor:
            <select id="fornecedor" name="fornecedor" id="files" class="inp-form">           
        
                <optgroup label="Lista de Fornecedores">

           				<option value=""></option>

           			<c:forEach var="fornecedor" items="${fornecedorList}">
           			
           				<option value="${fornecedor.id}">${fornecedor.nomefantasia}</option>
           				      				
           				
       				</c:forEach>
                </optgroup>
            </select>
           </p>
            
	</fieldset>


			<div id="botoes">
			<button class="button">Adicionar</button>
			<button class="button">Apagar</button>
			</div>

	</form>
</div>


</div>
<!--  end content-table-inner  -->






