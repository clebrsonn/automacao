<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <h2>Cadastro de Venda</h2>


    <div id="form">
        <form id="formVenda" action="add" method="GET">

            <div id="dadospedido" class="dadospedido">

                Tipo:
                <input name="tipo" type="text" class="tipo" value="${pedido.tipo }"/>

                Total:
                <input id="totalpedido" name="total" type="text" class="totalpedido" value="${pedido.total }"/>

            </div>


            <div id="item" class="item">
                Cod

                <input id="codigoitem" name="codigo" type="text" list="id" class="codigoitem"/>

                <datalist id="id">

                    <c:forEach var="produto" items="${listProduto}" varStatus="id">
                        <option value="${produto.codebar}"/>
                    </c:forEach>


                </datalist>


                Descricao

                <input id="descricaoitem" name="descricao" type="text" list="produtos" class="descricaoitem"/>


                <datalist id="produtos">

                    <c:forEach var="produto" items="${listProduto}" varStatus="id">

                        <option value="${produto.descricao}"/>

                    </c:forEach>


                </datalist>

            </div>

            <div id="detalheitem" class="detalheitem">
                Qtd

                <input id="quantidadeitem" name="quantidade" type="text" class="quantidadeitem"/>


                Valor Item

                <input id="valoritem" name="valor" type="text" class="valoritem"/>


                Total Item

                <input id="valortotal" name="valor" type="text" class="valortotal"/>


                SubTotal

                <input id="subtotal" name="subtotal" type="text" class="subtotal"/>


            </div>


            <div id="botoes">
                <button class="button">AdicionarItemVenda</button>
                <button class="button">Apagar</button>
                <button class="button" formaction="addformapagamento?id=${pedido.id }">AddFormaPagamento</button>


                <table border="0" width="100%" cellpadding="0" cellspacing="0" class="product-table2">
                    <th class="table-header-check"><a id="toggle-all"></a></th>
                    <th class="table-header-repeat line-left "><a>Id</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Pedido </a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Código de Barras</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Descricao </a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Preço Unitario</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Quantidade</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>TotalItem</a></th>
                    <th class="table-header-repeat line-left"><a>Acão</a></th>

                    <c:forEach var="item" items="${itemList}" varStatus="id">


                        <c:choose>
                            <c:when test="${item.id % 2 == 0}">
                                <tr class="alternate-row">
                                    <td><input type="checkbox"/></td>
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
                                        <a href="cadastrovenda2?id=${item.id}" class="icon-3 info-tooltip"
                                           title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="movimentacaovenda/delete?id=${item.id}" class="icon-5 info-tooltip"
                                           title="ccc"></a>
                                    </td>
                                </tr>
                            </c:when>
                            <c:when test="${item.id % 2 != 0}">
                                <tr>
                                    <td><input type="checkbox"/></td>

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
                                        <a href="/edit?id=${item.id}" class="icon-3 info-tooltip" title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="movimentacaovenda/delete?id=${item.id}" class="icon-5 info-tooltip"
                                           title="ccc"></a>
                                    </td>
                                </tr>
                            </c:when>

                        </c:choose>

                    </c:forEach>
                </table>


        </form>
    </div>


</div>
<!-- end content-table-inner -->






