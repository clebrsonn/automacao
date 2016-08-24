<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h2>Cadastro de Produto</h2>
	
	
	<div id="form">
	<form id="formProduto" action="add" method="POST">


		<p>ID do Produto:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" />
		
		<p>Codigo de Barra do Produto:</p>
		<input name="codebar"type="text" class="inp-form" />
        
        <p> Categoria:</p>
          <select id="categoria" name="categoria" id="files" class="inp-form">           
                <optgroup label="Selecione uma Categoria">
                    <c:forEach var="categoria" items="${categoriaList}">
                        <option value="${categoria.id}">${categoria.nome}</option>
                    </c:forEach>

                </optgroup>
           </select>
		

		<p>Descrição do Produto:</p>
		<input name="descricao" type="text" class="inp-form" />
		
		<p>Preço Custo do Produto:</p>
		<input name="precoCusto" type="text" class="inp-form" />
		
		<p>Preço Venda do Produto:</p>
		<input name="precoVenda" type="text" class="inp-form" />
		
				<p> Unidade de Medida:</p>
            <select id="un_medida" name="un_medida" id="files" class="inp-form">           
        
                <optgroup label="Tipos de Unidade de Medida">

           			<c:forEach var="un_medida" items="${umList}">
           			
           				<option value="${un_medida}">${un_medida}</option>
           				      				
           				
       				</c:forEach>
                </optgroup>
            </select>
            <p> Fornecedor:</p>
            <select id="fornecedor" name="fornecedor" id="files" class="inp-form">           
        
                <optgroup label="Lista de Fornecedores">

           				<option value=""></option>

           			<c:forEach var="fornecedor" items="${fornecedorList}">
           			
           				<option value="${fornecedor.id}">${fornecedor.nomefantasia}</option>
           				      				
           				
       				</c:forEach>
                </optgroup>
            </select>
            



<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>
<!--  end content-table-inner  -->






