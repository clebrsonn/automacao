<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">

	<h2>Movimentacao Caixa</h2>


	<div id="form">
		<form id="formRecebimentos" action="AddItemVenda" method=GET>

			<div id="dadospedido" class="dadospedido">

				ID do Pedido: <input id="idpedidovenda" name="idpedidovenda"
					type="text" class="idpedido" value="${pv.id }" /> ID Cliente: <input name="tipo"
					type="text" class="tipo" value="${pv.cliente }"/> Total: <input id="totalpedido"
					name="totalpedido" type="text" class="totalpedido" value="${pv.total }"/>

			</div>


			<div id="item" class="item">


				Cod Prod <input id="codigoitem" name="codigoitem" type="text" list="id"
					class="codigoitem" values="${produto.codebar }"/>

				<datalist id="id">

					<c:forEach var="produto2" items="${listProduto}" varStatus="id">
						<option value="${produto2.codebar}" />
					</c:forEach>


				</datalist>


				Descricao <input id="descricaoitem" name="descricaoitem" type="text"
					list="produtos" class="descricaoitem" value="${produto.descricao}"/>


				<datalist id="produtos">

					<c:forEach var="produto3" items="${listProduto}" varStatus="id">

						<option value="${produto3.descricao}" />

					</c:forEach>


				</datalist>

			</div>

			<div id="detalheitem" class="detalheitem">

				Quantidade <input id="quantidadeitem" name="quantidadeitem" type="text"
					class="quantidadeitem" /> Valor Item <input id="valoritem"
					name="valoritem" type="text" class="valoritem" value="${produto.precoVenda }" /> Total Item <input
					id="valortotal" name="valortotal" type="text" class="valortotal" />


				SubTotal <input id="subtotal" name="subtotal" type="text"
					class="subtotal" />


			</div>

			<div id="botoes">
				<button class="button">AdicionarItem</button>
				<button class="button">ApagarItem</button>
				<button class="button">
					<a href="'${pageContext.request.contextPath}/pedidovenda/addformapagamento?id=${pedidovenda.id}'">Efetuar Pagamento</a>
				</button>
				<%--                 <button class="button"><a href="finalizacaorecebimento?id=${pedido.id }">FinalizarPedido</a></button> --%>

			</div>


			<table border="0" width="100%" cellpadding="0" cellspacing="0"
				class="product-table">
				<th class="table-header-check"><a id="toggle-all"></a></th>
				<th class="table-header-repeat line-left "><a>Id</a></th>
				<th class="table-header-repeat line-left minwidth-1"><a></a></th>
				<th class="table-header-repeat line-left minwidth-1"><a>Codigo
						de Barras</a></th>
				<th class="table-header-repeat line-left minwidth-1"><a>Descricao
				</a></th>
				<th class="table-header-repeat line-left minwidth-1"><a>Preco
						Unitario</a></th>
				<th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th>
				<th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>
				<th class="table-header-repeat line-left"><a>Acao</a></th>

				<c:forEach var="item" items="${itemList}" varStatus="id">


					<c:choose>
						<c:when test="${item.id % 2 == 0}">
							<tr class="alternate-row">
								<td><input type="checkbox" /></td>
								<td>${item.id}</td>
								<td>${item.pedido}</td>

								<td>${item.codigo}</td>
								<td>${item.descricao}</td>
								<td>${item.precoUnitario}</td>
								<td>${item.qtd}</td>
								<td>${item.totalItem}</td>


								<td class="options-width"><a
									href="edicaodevolucao?id=${devolucao.id}"
									class="icon-1 info-tooltip" title="Edit"></a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a href="/delete?id=${devolucao.id}"
									class="icon-4 info-tooltip" title="aaa"></a> <a
									href="cadastrodevolucao2?id=${devolucao.id}"
									class="icon-3 info-tooltip" title="bbb"></a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a
									href="movimentacaodevolucao/delete?id=${devolucao.id}"
									class="icon-5 info-tooltip" title="ccc"></a></td>
							</tr>
						</c:when>
						<c:when test="${item.id % 2 != 0}">
							<tr>
								<td><input type="checkbox" /></td>

								<td>${item.id}</td>
								<td>${item.pedido}</td>

								<td>${item.codigo}</td>
								<td>${item.descricao}</td>
								<td>${item.precoUnitario}</td>
								<td>${item.qtd}</td>
								<td>${item.totalItem}</td>

								<td class="options-width"><a
									href="edicaodevolucao?id=${devolucao.id}"
									class="icon-1 info-tooltip" title="Edit"></a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a href="/delete?id=${devolucao.id}"
									class="icon-4 info-tooltip" title="aaa"></a> <a
									href="cadastrodevolucao2?id=${devolucao.id}"
									class="icon-3 info-tooltip" title="bbb"></a>
									&nbsp;&nbsp;&nbsp;&nbsp; <a
									href="movimentacaodevolucao/delete?id=${devolucao.id}"
									class="icon-5 info-tooltip" title="ccc"></a></td>
							</tr>
						</c:when>

					</c:choose>

				</c:forEach>
			</table>


		</form>
	</div>


</div>
<!-- end content-table-inner -->

