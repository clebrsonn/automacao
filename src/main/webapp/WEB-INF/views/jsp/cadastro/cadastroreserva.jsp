<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false"%>

		
		<div id="conteudo" class="conteudo">
		

		<h2>Cadastro de Reserva</h2>
	
	
	<div id="formm">
	<form id="formReserva" action="add" method="post">
	
	
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
				
				<legend>Dados da Reserva</legend>
			

		<p>ID da Reserva:
		<input type="text" class="inp-form"  name="id" value="${reserva.id}"/> </p>

		<p>Numero da Reserva:
		<input name="numero" type="text" class="inp-form" value="${reserva.numero}"/> </p>
		
			<p>Data da Reserva:
		<input name="data" type="date" class="inp-form" 
		<fmt:formatDate type="date"  value="${reserva.data}" pattern="dd/MM/yyyy"/> /> </p>
		
			<p>Hora da Reserva:
		<input name="hora" type="time" class="inp-form"
		<fmt:formatDate type="time"  value="${reserva.hora}" /> /> </p>
		
			<p> Mesa:
	            <select id="mesa" name="mesa" id="files" class="inp-form">
	                <option value=""></option>
	
	                <optgroup label="Mesas Disponiveis">
	                    <c:forEach var="mesa" items="${mesaList}">
	                        <option value="${mesa.id}">${mesa.numero}</option>
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



	


