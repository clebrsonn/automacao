<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

    <div align="">
        <h3>Movimentação Fornecedor</h3>
        <div id="content-table">
            <form id="mainform">

                <table border="0" width="100%" cellpadding="0" cellspacing="0" class="product-table">
                    <th class="table-header-check"><a id="toggle-all"></a></th>
                    <th class="table-header-repeat line-left "><a>Id</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Nome Fantasia</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Razao Social</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Inscricao Estadual</a></th>
                    <th class="table-header-repeat line-left minwidth-1"><a>Cnpj</a></th>

                    <th class="table-header-repeat line-left"><a>Acão</a></th>

                    <c:forEach var="fornecedor" items="${fornecedorList}" varStatus="id">

                        <%-- <c:if test="${objeto.id % 2 == 0}"> --%>
                        <!-- <tr class="alternate-row"> -->
                        <!-- <td><input type="checkbox"/></td> -->
                        <%--                     <td>${objeto.id}</td> --%>
                        <%--                     <td>${objeto.nome}</td> --%>
                        <%--                     <td>${objeto.tipo}</td> --%>
                        <!-- <td class="options-width"> -->
                        <%--                         <a href="/edit?id=${objeto.id}" class="icon-1 info-tooltip" title="Edit"></a> --%>
                        <!-- &nbsp;&nbsp;&nbsp;&nbsp; -->
                        <%--                         <a href="/delete?id=${objeto.id}" class="icon-4 info-tooltip" title="aaa"></a> --%>
                        <%--                          <a href="/edit?id=${objeto.id}" class="icon-3 info-tooltip" title="bbb"></a> --%>
                        <!-- &nbsp;&nbsp;&nbsp;&nbsp; -->
                        <%--                         <a href="/delete?id=${objeto.id}" class="icon-5 info-tooltip" title="ccc"></a> --%>
                        <!-- </td> -->
                        <!-- </tr> -->
                        <%-- </c:if> --%>


                        <c:choose>
                            <c:when test="${fornecedor.id % 2 == 0}">
                                <tr class="alternate-row">
                                    <td><input type="checkbox"/></td>
                                    <td>${fornecedor.id}</td>
                                    <td>${fornecedor.nomefantasia}</td>
                                    <td>${fornecedor.razaoSocial}</td>
                                    <td>${fornecedor.inscricaoestadual}</td>
                                    <td>${fornecedor.cnpj}</td>

                                    <td class="options-width">
                                        <a href="edicao?id=${fornecedor.id}" class="icon-1 info-tooltip"
                                           title="Editar Objeto"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${fornecedor.id}" class="icon-4 info-tooltip"
                                           title="aaa"></a>
                                        <a href="edicao?id=${fornecedor.id}" class="icon-3 info-tooltip"
                                           title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${fornecedor.id}"
                                           class="icon-5 info-tooltip" title="Delete Objeto"></a>
                                    </td>
                                </tr>
                            </c:when>
                            <c:when test="${fornecedor.id % 2 != 0}">
                                <tr>
                                    <td><input type="checkbox"/></td>
                                    <td>${fornecedor.id}</td>
                                    <td>${fornecedor.nomefantasia}</td>
                                    <td>${fornecedor.razaoSocial}</td>
                                    <td>${fornecedor.inscricaoestadual}</td>
                                    <td>${fornecedor.cnpj}</td>
                                    <td class="options-width">
                                        <a href="edicao?id=${fornecedor.id}" class="icon-1 info-tooltip"
                                           title="Editar Objeto"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${fornecedor.id}" class="icon-4 info-tooltip"
                                           title="aaa"></a>
                                        <a href="edicao?id=${fornecedor.id}" class="icon-3 info-tooltip" title="bbb"></a>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <a href="delete?id=${fornecedor.id}"
                                           class="icon-5 info-tooltip" title="Delete Objeto"></a>
                                    </td>
                                </tr>
                            </c:when>

                        </c:choose>
                        <!-- <tr> -->
                        <!-- <td><input type="checkbox"/></td> -->
                        <%--                     <td>${objeto.id}</td> --%>
                        <%--                     <td>${objeto.nome}</td> --%>
                        <%--                     <td>${objeto.tipo}</td> --%>
                        <!-- <td class="options-width"> -->
                        <%--                         <a href="/edit?id=${objeto.id}" class="icon-1 info-tooltip" title="Edit"></a> --%>
                        <!-- &nbsp;&nbsp;&nbsp;&nbsp; -->
                        <%--                         <a href="/delete?id=${objeto.id}" class="icon-4 info-tooltip" title="aaa"></a> --%>
                        <%--                          <a href="/edit?id=${objeto.id}" class="icon-3 info-tooltip" title="bbb"></a> --%>
                        <!-- &nbsp;&nbsp;&nbsp;&nbsp; -->
                        <%--                         <a href="/delete?id=${objeto.id}" class="icon-5 info-tooltip" title="ccc"></a> --%>
                        <!-- </td> -->
                        <!-- </tr> -->
                    </c:forEach>
                </table>

            </form>
        </div>


    </div>

</div>
