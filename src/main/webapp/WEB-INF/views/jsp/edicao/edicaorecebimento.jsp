<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

		<h3>Edi��o de Recebimento</h3>
	
	
	<div id="form">
	<form id="formRecebimento" action="edicao" method="POST">


		<p>ID do Recebimento:</p>
		<input name="id"type="text" class="inp-form" readonly="readonly" />
		
		<p>Data:</p>
		<input name="data"type="text" class="inp-form" />
		
				<p>Tipo:</p>
				<select name="tipo" id="files" class="inp-form">
			<optgroup label="Tipo de Pedido">
				       
				        <option value="Mesa">Mesa</option>
				        <option value="Balcao">Balcao</option>
				        <option value="Delivery">Delivery</option>
				         
			
				        
					
			</optgroup>
		</select>
		

		<p>Mesa:</p>
		<input name="mesa" type="text" class="inp-form" />
		
		<p>Status:</p>
				<select name="status" id="files" class="inp-form">
			<optgroup label="Status">
				       
			        <option value="Aberto">Aberto</option>
				        <option value="Aguardando">Aguardando Prepara��o</option>
				        <option value="Aberto">Cancelado</option>
				        <option value="Em Prepara��o">Em Prepara��o</option>
				        <option value="Entregue">Entregue</option>
				       	<option value="Finalizado">Finalizado</option>
				        <option value="Impedido">Impedido</option>
				        <option value="Pronto">Pronto</option>
				         
			
				        
					
			</optgroup>
		</select>
		
		<p>Total:</p>
		<input name="total" type="text" class="inp-form" />
		
		<p> Garcon:</p>
		<input name="garcon" type="text" class="inp-form" />



<div id="botoes">
<button class="button">Adicionar</button>
<button class="button">Apagar</button>
</div>

	</form>
</div>


</div>
<!--  end content-table-inner  -->






