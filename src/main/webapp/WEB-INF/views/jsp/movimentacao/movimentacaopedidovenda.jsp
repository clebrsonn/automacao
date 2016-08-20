<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<div id="conteudo" class="conteudo">
	<div align="">
		<h3>Movimentacao Pedido Venda</h3>
		<div id="content-table">
			<form id="mainform" action="cadastro">

				<table border="0" width="100%" cellpadding="0" cellspacing="0"
					class="product-table">
					<th class="table-header-check"><a id="toggle-all"></a></th>
					<th class="table-header-repeat line-left "><a>Id</a></th>
					<!--                       <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th> -->
					<th class="table-header-repeat line-left minwidth-1"><a>Cliente
					</a></th>
					<th class="table-header-repeat line-left minwidth-1"><a>Tipo
					</a></th>
<!-- 					<th class="table-header-repeat line-left minwidth-1"><a>Origem Pedido</a></th> -->
					<th class="table-header-repeat line-left minwidth-1"><a>Data</a></th>
					<th class="table-header-repeat line-left minwidth-1"><a>Status</a></th>
					<th class="table-header-repeat line-left minwidth-1"><a>Total</a></th>

					<!--                  <th class="table-header-repeat line-left minwidth-1"><a>Data Abertura</a></th>  -->

					<!--                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fechamento</a></th>             -->

					<th class="table-header-repeat line-left"><a>Acao</a></th>

					<c:forEach var="pedido" items="${pedidovendaList}"
						varStatus="id">




						<c:choose>
							<c:when test="${pedido.id % 2 == 0}">
								<tr class="alternate-row">
									<td><input type="checkbox" /></td>
									<td>${pedido.id}</td>
									<td>${pedido.cliente}</td>
									<td>${pedido.tipo}</td>
<%-- 									<td>${pedido.origempedido}</td> --%>
									<td>${pedido.data}</td>
									<td>${pedido.status}</td>
									<td>${pedido.total}</td>


									<td class="options-width"><a
										href='${pageContext.request.contextPath}/pedidovenda/edicao?id=${pedido.id}' class="icon-1 info-tooltip"
										title="Edit"></a> &nbsp;&nbsp;&nbsp;&nbsp; <a
										href='${pageContext.request.contextPath}/pedidovenda/addformapagamento?id=${pedido.id}'
										class="icon-40 info-tooltip" title="aaa"></a> <a
										href='${pageContext.request.contextPath}/pedidovenda/additemvenda?idpedidovenda=${pedido.id}'
										class="icon-30 info-tooltip" title="Adicionar Item ao Pedido"></a>
										&nbsp;&nbsp;&nbsp;&nbsp; <a href='${pageContext.request.contextPath}/pedidovenda/delete?id=${pedido.id}'
										class="icon-5 info-tooltip" title="ccc"></a></td>
								</tr>
							</c:when>
							<c:when test="${pedido.id % 2 != 0}">
								<tr>
									<td><input type="checkbox" /></td>

									<td>${pedido.id}</td>
									<td>${pedido.cliente}</td>
									<td>${pedido.tipo}</td>
<%-- 									<td>${pedido.origempedido}</td> --%>
									<td>${pedido.data}</td>
									<td>${pedido.status}</td>
									<td>${pedido.total}</td>
									
									<td class="options-width"><a
										href='${pageContext.request.contextPath}/pedidovenda/edicao?id=${pedido.id}' class="icon-1 info-tooltip"
										title="Edit"></a> &nbsp;&nbsp;&nbsp;&nbsp; <a
										href='${pageContext.request.contextPath}/pedidovenda/addformapagamento?id=${pedido.id}'
										class="icon-40 info-tooltip" title="aaa"></a> <a
										href='${pageContext.request.contextPath}/pedidovenda/additemvenda?idpedidovenda=${pedido.id}'
										class="icon-30 info-tooltip" title="Adicionar Item ao Pedido"></a>
										&nbsp;&nbsp;&nbsp;&nbsp; <a href='${pageContext.request.contextPath}/pedidovenda/delete?id=${pedido.id}'
										class="icon-5 info-tooltip" title="ccc"></a></td>
								</tr>
							</c:when>

						</c:choose>
						<!--                 <tr> -->
						<!--                 <td><input  type="checkbox"/></td> -->
						<%--                     <td>${objeto.id}</td> --%>
						<%--                     <td>${objeto.nome}</td> --%>
						<%--                     <td>${objeto.tipo}</td> --%>
						<!--                     <td class="options-width"> -->
						<%--                         <a href="/edit?id=${objeto.id}" class="icon-1 info-tooltip" title="Edit"></a> --%>
						<!--                         &nbsp;&nbsp;&nbsp;&nbsp; -->
						<%--                         <a href="/delete?id=${objeto.id}" class="icon-4 info-tooltip" title="aaa"></a> --%>
						<%--                          <a href="/edit?id=${objeto.id}" class="icon-3 info-tooltip" title="bbb"></a> --%>
						<!--                         &nbsp;&nbsp;&nbsp;&nbsp; -->
						<%--                         <a href="/delete?id=${objeto.id}" class="icon-5 info-tooltip" title="ccc"></a> --%>
						<!--                     </td> -->
						<!--                 </tr> -->
					</c:forEach>
				</table>


				<div id="botoes">

					<button class="button">Criar Pedido</button>


				</div>

			</form>
		</div>




	</div>

</div>
