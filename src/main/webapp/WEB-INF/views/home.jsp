<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<div id="conteudo">

    <div id="msg">
        <div id="imagem_user" class="imagem_user">
            <img src="${pageContext.request.contextPath}/resources/images/imagem_user.png" width="100px" height="100px"
                 alt=""/>
        </div>

        <div id="user_msg" class="user_msg">
            <h1>Seja Bem-Vindo ${usuario.nome}</h1>
            <h2>último Acesso em ${usuario.dataultimoacesso}</h2>

        </div>

    </div>


</div>
