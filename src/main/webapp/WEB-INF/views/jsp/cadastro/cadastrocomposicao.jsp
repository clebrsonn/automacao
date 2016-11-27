<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Composicao</h2>


    <div id="form">
        <form id="formComposicao" action="add" method="POST">
        
        
       
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
<!-- 			FIM DADOS DO REGISTRO -->


			<fieldset>
				<legend>Dados da Composicao</legend>
			
			
			            <p>Numero da Composicao:
			            	<input name="numero" type="text" class="inp-form"/>
			            </p>
			
			            <p>Nome da Composicao:
			            	<input name="nome" type="text" class="inp-form"/>
			            </p>
			            
			            <div id="botoes">
			                <button class="button">Adicionar</button>
			                <button class="button">Apagar</button>
			                <button class="button">AddItem</button>
			                
			            </div>
			</fieldset>


            
        
		
		      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table2">
    			 <th class="table-header-check"><a id="toggle-all" ></a> </th>
                 <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Id Composicao </a></th>         
               	 <th class="table-header-repeat line-left minwidth-1"><a>Codigo de Barras</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th> 
	             <th class="table-header-repeat line-left minwidth-1"><a>Preco Unitario</a></th>
	             <th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th>
   	             <th class="table-header-repeat line-left minwidth-1"><a>Unidade Medida</a></th>
	                        
	             <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>                                  
                 <th class="table-header-repeat line-left"><a>Acao</a></th>
                 
<c:forEach var="item" items="${itemList}" varStatus="id">




<c:choose>
  <c:when test="${item.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${item.id}</td>
                    <td>${item.pedido}</td>
                    
                     <td>${item.codigo}</td>
                    <td>${item.descricao}</td>
                    <td>${item.precoUnitario}</td>
                    <td>${item.qtd}</td>                   
                    <td>${item.totalItem}</td>

                   
                    <td class="options-width">
                        <a href="edicaoitem?id=${item.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${item.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="cadastrorecebimento2?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaorecebimento/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${item.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
             
                    <td>${item.id}</td>
                                        <td>${item.pedido}</td>
                    
                     <td>${item.codigo}</td>
                    <td>${item.descricao}</td>
                    <td>${item.precoUnitario}</td>
                    <td>${item.qtd}</td>                   
                    <td>${item.totalItem}</td>
                    
                    <td class="options-width">
                        <a href="edicaoitem?id=${item.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${item.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="cadastrorecebimento2?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaorecebimento/delete?id=${item.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>

</c:choose>

                </c:forEach>             
            </table>

        </form>
    </div>


</div>

