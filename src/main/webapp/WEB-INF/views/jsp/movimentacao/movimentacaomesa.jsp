<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

		<div id="conteudo" class="conteudo" >
		
				<h1 class="title">Movimentacao de Mesas</h1>
				
				
				
				<c:forEach var="mesa" items="${mesaList}" varStatus="status">
                	
                	<c:choose>
  						
  						<c:when test="${mesa.status == 'Disponivel'}">
								<a href="edicao?id=${mesa.id}" ><div class="mesa"><div class="mesa_disponivel">${mesa.numero}</div><div class="disponivel"></div></div></a>
  						
  						</c:when>
  						
						<c:when test="${mesa.status == 'Indisponivel'}">
								<a href="edicao?id=${mesa.id}" ><div class="mesa"><div class="mesa_indisponivel">${mesa.numero}</div><div class="ocupado"></div></div></a>
  						
  						</c:when>
  						
  					</c:choose>
                
       				

                </c:forEach>             
				
				
				
				
				
				
				
				
				
				
				
					
<!-- 					<div class="mesa"><div class="mesa_disponivel">01</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">02</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">03</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">04</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">05</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">06</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">07</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">08</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">09</div><div class="disponivel"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">10</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">11</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">12</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">13</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">14</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_disponivel">15</div><div class="ocupado"></div></div> -->
<!-- 					<div class="mesa"><div class="mesa_indisponivel">16</div><div class="ocupado"></div></div> -->


				</div>
			

