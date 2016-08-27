<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
    <div align="">
        <h3>Movimentacao Despesa</h3>
        <div id="content-table">
            <form id="mainform">

                <table border="0" width="100%" cellpadding="0" cellspacing="0" class="product-table">
                    <th class="table-header-check"><a id="toggle-all"></a></th>
                    <th class="table-header-repeat line-left "><a>Id</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Nome Despesa</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Valor Despesa</a></th>
                    <th class="table-header-repeat line-left"><a>Acão</a></th>

                    <c:forEach var="despesa" items="${despesaList}" varStatus="id">

                        <c:choose>
                            <c:when test="${despesa.id % 2 == 0}">
                                <tr class="alternate-row">
                                    <td><input type="checkbox"/></td>
                                    <td>${despesa.id}</td>
                                    <td>${despesa.nome}</td>
                                    <td>${despesa.valor}</td>


                                    <td class="options-width">
                                        <a href="edicao?id=${despesa.id}" class="icon-1 info-tooltip"
                                           title="Editar  Desenvolvedor"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="/delete?id=${despesa.id}" class="icon-4 info-tooltip" title="aaa"></a>
                                        <a href="/edit?id=${despesa.id}" class="icon-3 info-tooltip" title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${despesa.id}"
                                           class="icon-5 info-tooltip" title="Delete Desenvolvedor"></a>
                                    </td>
                                </tr>
                            </c:when>
                            <c:when test="${despesa.id % 2 != 0}">
                                <tr>
                                    <td><input type="checkbox"/></td>
                                    <td>${despesa.id}</td>
                                    <td>${despesa.nome}</td>
                                    <td>${despesa.valor}</td>


                                    <td class="options-width">
                                        <a href="edicao?id=${despesa.id}" class="icon-1 info-tooltip"
                                           title="Editar  Desenvolvedor"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="/delete?id=${despesa.id}" class="icon-4 info-tooltip" title="aaa"></a>
                                        <a href="/edit?id=${despesa.id}" class="icon-3 info-tooltip" title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${despesa.id}"
                                           class="icon-5 info-tooltip" title="Delete Desenvolvedor"></a>
                                    </td>
                                </tr>
                            </c:when>

                        </c:choose>

                    </c:forEach>
                </table>

            </form>
        </div>


    </div>

</div>

