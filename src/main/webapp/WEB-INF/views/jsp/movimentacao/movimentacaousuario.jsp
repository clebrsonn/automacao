<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">


<div align="">
            <h3>Movimentação Usuário</h3>
            	<div id="content-table">

	<form id="mainformn">
	

      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Nome </a></th>          
                <th class="table-header-repeat line-left minwidth-1"><a>Senha</a></th>  
                 <th class="table-header-repeat line-left minwidth-1"><a>Tipo Usuario</a></th>  
                 <th class="table-header-repeat line-left minwidth-1"><a>Email</a></th>                                                         
                <th class="table-header-repeat line-left"><a>Acão</a></th>
                 
  <c:forEach var="usuario" items="${usuarioList}" varStatus="id">

		<c:choose>
		  <c:when test="${usuario.id % 2 == 0}">
		    <tr class="alternate-row">
		                <td><input  type="checkbox"/></td>
		                    <td>${usuario.id}</td>
		                     <td>${usuario.nome}</td>
		                    <td ><input type="password" value="${usuario.senha}"></td>
		                     <td>${usuario.tipo}</td>
		                    <td>${usuario.email}</td>
							
		                   
		                    <td class="options-width">
		                        <a href="edicao?id=${usuario.id}" class="icon-1 info-tooltip" title="Edit"></a>
		                        &nbsp;&nbsp;&nbsp;&nbsp;
		                        <a href="/delete?id=${usuario.id}" class="icon-4 info-tooltip" title="aaa"></a>
		                         <a href="/edit?id=${usuario.id}" class="icon-3 info-tooltip" title="bbb"></a>
		                        &nbsp;&nbsp;&nbsp;&nbsp;
		                        <a href="delete?id=${usuario.id}" class="icon-5 info-tooltip" title="ccc"></a>
		                    </td>
		                </tr>
		  </c:when>
		  <c:when test="${usuario.id % 2 != 0}">
		           <tr>
		                <td><input  type="checkbox"/></td>
		      				<td>${usuario.id}</td>
		                     <td>${usuario.nome}</td>
		                    <td><input type="password" value="${usuario.senha}"></td>
		                     <td>${usuario.tipo}</td>
		                    <td>${usuario.email}</td>
		
		                    <td class="options-width">
		                        <a href="edicao?id=${usuario.id}" class="icon-1 info-tooltip" title="Edit"></a>
		                        &nbsp;&nbsp;&nbsp;&nbsp;
		                        <a href="/delete?id=${usuario.id}" class="icon-4 info-tooltip" title="aaa"></a>
		                         <a href="/edit?id=${usuario.id}" class="icon-3 info-tooltip" title="bbb"></a>
		                        &nbsp;&nbsp;&nbsp;&nbsp;
		                        <a href="delete?id=${usuario.id}" class="icon-5 info-tooltip" title="ccc"></a>
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