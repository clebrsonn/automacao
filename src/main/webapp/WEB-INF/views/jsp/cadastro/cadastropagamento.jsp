<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<div id="conteudo" class="conteudo">


    <h2>Cadastro de Formas de Pagamentos</h2>


    <div id="formm">
        <form id="formPagamento" action="add" method="POST">
            <p>Numero:
            	<input name="numero" type="text" class="inp-form"/>
            </p>

            <p>Nome:
            	<input name="nome" type="text" class="inp-form"/>
            </p>
            <p>
            Tipo:
	            <select id="tipo" name="tipo" id="files" class="inp-form">
	                <optgroup label="Tipo Forma Pagamento">
	
	                    <option value="DINHEIRO">DINHEIRO</option>
	                    <option value="CREDITO">CREDITO</option>
	                    <option value="DEBITO">DEBITO</option>
	
	
	                </optgroup>
	            </select>
            </p>
            <p>Parcelas:
            	<input name="parcelas" type="number" class="inp-form"/>
            </p>


            <div id="botoes">
                <button class="button">Adicionar</button>
                <button class="button">Apagar</button>
            </div>

        </form>

    </div>


</div>



	


