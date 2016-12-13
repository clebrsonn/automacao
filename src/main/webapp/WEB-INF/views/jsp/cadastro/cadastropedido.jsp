<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">

        <h2 class="title">Cadastros de Pedido</h2>


        <button onclick="window.location.href='${pageContext.request.contextPath}/pedidovenda/movimentacao'"><p><img
                alt="kkk" src="${pageContext.request.contextPath}/resources/images/categoria.png">Venda</p></button>
        <button onclick="window.location.href='${pageContext.request.contextPath}/pedidocompra/movimentacaopedidocompralista'">
            <p><img alt="kkk"
                    src="${pageContext.request.contextPath}/resources/images/produto.png">Compra
            </p></button>
        <%-- 		<button onclick="window.location.href='categoria/cadastro'"><p><img alt="kkk" src="${pageContext.request.contextPath}/resources/images/mesa_disp.png">Mesas</p></button> --%>


    </div>

<!-- end content-table-inner -->






