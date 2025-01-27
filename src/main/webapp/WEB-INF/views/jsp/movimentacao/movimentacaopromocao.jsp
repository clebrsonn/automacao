<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div align="">
            <h3>Movimentacao Promocao</h3>
            	<div id="content-table">
	<form id="mainform">

      <table border="0" width="100%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                <th class="table-header-repeat line-left minwidth-1"><a>Numero </a></th>          
                 <th class="table-header-repeat line-left minwidth-1"><a>Nome </a></th> 
                 <th class="table-header-repeat line-left minwidth-1"><a>Data Inicio Promocao</a></th>          
                 <th class="table-header-repeat line-left minwidth-1"><a>Data Fim Promocao</a></th>          
                          
<!--                
 <th class="table-header-repeat line-left minwidth-1"><a>Projeto</a></th>                                -->
                <th class="table-header-repeat line-left"><a>Acao</a></th>
                 
                <c:forEach var="promocao" items="${promocaoList}" varStatus="id">
                
<%-- <c:if test="${objeto.id % 2 == 0}"> --%>
<!--  			 <tr class="alternate-row"> -->
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
<%-- </c:if> --%>




<c:choose>
  <c:when test="${promocao.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${promocao.id}</td>
                     <td>${promocao.numero}</td>    
					 <td>${promocao.nome}</td>
                     <td><fmt:formatDate type="date"  value="${promocao.datainicio}" /></td>
                     <td><fmt:formatDate type="date"  value="${promocao.datafim}" /></td>
                   
                    <td class="options-width">
                        <a href="edicao?id=${promocao.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${promocao.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${promocao.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${promocao.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
                </tr>
  </c:when>
  <c:when test="${promocao.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
                   <td>${promocao.id}</td>
                     <td>${promocao.numero}</td>    
					 <td>${promocao.nome}</td>
                     <td><fmt:formatDate type="date"  value="${promocao.datainicio}" /></td>
                     <td><fmt:formatDate type="date"  value="${promocao.datafim}" /></td>
                    <td class="options-width">
                        <a href="edicao?id=${promocao.id}" class="icon-1 info-tooltip" title="Edit"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${promocao.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${promocao.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=${promocao.id}" class="icon-5 info-tooltip" title="ccc"></a>
                    </td>
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
            
            </form>
</div>




</div>

</div>