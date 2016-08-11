  <!DOCTYPE HTML>
<%-- <%@ include file="/WEB-INF/views/home.jsp" %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<head>


<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-1.4.1.min.js"
	type="text/javascript"></script>




<script src="${pageContext.request.contextPath}/resources/js/default.js" type="text/javascript"></script>



<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/screen.css" type="text/css" />


<script type="text/javascript">
	
	//funfa para o cadastro
	$(document).ready(function () {

		
// 		alert('');
		
		
		$("#valoritem").focusout(function(){
			
			var valor = $("#valoritem").val();
		  	var qtd =$("#quantidadeitem").val();
		  	
			$("#valortotal").val(valor*qtd);
			
			var totali = $("#valortotal").val();

			
			var totalp = $("#totalpedido").val();
			var total =parseFloat(totalp+totali);

			$("#subtotal").val(total);


			
		});
		
		$("#valoritem").focusout(function(){
			
			var valor = $("#valoritem").val();
		  	var qtd =$("#quantidadeitem").val();
		  	
			$("#valortotal").val(valor*qtd);
			
			var totali = $("#valortotal").val();

			
			var totalp = $("#totalpedido").val();
			var total =parseFloat(totalp+totali);

			$("#subtotal").val(total);


			
		});
		
		$("#blink").css("opacity","0.4");//define opacidade inicial
		setInterval(function() {
		       if($("#blink").css("opacity") == 0){
		  $("#blink").css("opacity","1");
		 }else{
		  $("#blink").css("opacity","0");
		 }  }, 200);
		
	});
  
 </script> 
 	
 
</head>
<body>

	<div id="all">




		<tiles:insertAttribute name="topo" />


		<%-- 		<tiles:insertAttribute name="barra_usuario_topo" /> --%>


		<tiles:insertAttribute name="menu" />



		<tiles:insertAttribute name="conteudo" />


		<tiles:insertAttribute name="footer" />

	</div>

</body>
</html>