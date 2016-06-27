<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<div id="conteudo" class="conteudo">
<div>
            <h3>Movimentação Composição</h3>
            	<div id="content-table">
	<form id="mainform">

      <table border="0" width="140%"cellpadding="0" cellspacing="0"  class="product-table">
    			<th class="table-header-check"><a id="toggle-all" ></a> </th>
                <th class="table-header-repeat line-left "><a>Id</a></th>
                 <th class="table-header-repeat line-left minwidth-1"><a>Nome Composição</a></th> 
                 <th class="table-header-repeat line-left minwidth-1"><a>Número Composição</a></th>
                    
                <th class="table-header-repeat line-left"><a>Acão</a></th>
         
                <c:forEach var="composicao" items="${composicaoList}" varStatus="id">
                





<c:choose>
  <c:when test="${composicao.id % 2 == 0}">
    <tr class="alternate-row">
                <td><input  type="checkbox"/></td>
                    <td>${composicao.id}</td>
                     <td>${composicao.nome}</td>
                    <td>${composicao.numero}</td>
                    
                   
                    <td class="options-width">
                        <a href="edicaocomposicao?id=${composicao.id}" class="icon-1 info-tooltip" title="Edidar Estoria"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${composicao.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${composicao.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaocomposicao/delete?id=${composicao.id}" class="icon-5 info-tooltip" title="Excluir Estória"></a>
                    </td>
                
                </tr>
  </c:when>
  <c:when test="${composicao.id % 2 != 0}">
           <tr>
                <td><input  type="checkbox"/></td>
                <td>${composicao.id}</td>
                     <td>${composicao.nome}</td>
                    <td>${composicao.numero}</td>
                    
                    <td class="options-width">
                        <a href="edicaocomposicao?id=${composicao.id}" class="icon-1 info-tooltip" title="Editar Estoria"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/delete?id=${composicao.id}" class="icon-4 info-tooltip" title="aaa"></a>
                         <a href="/edit?id=${composicao.id}" class="icon-3 info-tooltip" title="bbb"></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="movimentacaocomposicao/delete?id=${composicao.id}" class="icon-5 info-tooltip" title="Excluir Estória"></a>
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
