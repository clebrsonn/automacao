<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<div id="login-bg"> 
 
<!-- Start: login-holder -->
<div id="login-holder">

	<!-- start logo -->
	<div id="logo-login">
		<img src="resources/images/shared/ACENTURE.png" width="200" height="100" alt="" />
	</div>
	<!-- end logo -->
	

	
	
	
	<div class="clear"></div>
	
	<!--  start loginbox ................................................................................. -->
	<div id="loginbox">
	
	<!--  start login-inner -->
	<div id="login-inner">
	<form action="home">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Username</th>
			<td><input name="nome" id="nome" type="text" value="" class="login-inp" /></td>
		</tr>
		<tr>
			<th>Password</th>
			<td><input type="password"  name="password" id="password" class="login-inp" value=""/></td>
		</tr>
		<tr>
			<th></th>
			<td valign="top"><input type="checkbox" class="checkbox-size" id="login-check" /><label for="login-check">Remember me</label></td>
		</tr>
		<tr>
			<th></th>
			<td><input type="submit" class="submit-login"  /></td>
		</tr>
		</table>
		</form>
	</div>
 	<!--  end login-inner -->
	<div class="clear"></div>
	<a href="" class="forgot-pwd">Forgot Password?</a>
 </div>
 <!--  end loginbox -->
 
	<!--  start forgotbox ................................................................................... -->
	<div id="forgotbox">
		<div id="forgotbox-text">Please send us your email and we'll reset your password.</div>
		<!--  start forgot-inner -->
		<div id="forgot-inner">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Email address:</th>
			<td><input type="text" value=""   class="login-inp" /></td>
		</tr>
		<tr>
			<th> </th>
			<td><input type="button" class="submit-login"  /></td>
		</tr>
		</table>
		</div>
		<!--  end forgot-inner -->
		<div class="clear"></div>
		<a href="" class="back-login">Back to login</a>
	</div>
	<!--  end forgotbox -->

</div>

		<div id="message-green" name="message-green" class="message-green"  >
				<table border="0"  cellpadding="0" cellspacing="0">
<!-- 				<tr> -->
<%-- 					<td class="green-left">${mens}</td> --%>
<!-- 					<td class="green-right"><a class="close-green"><img src="resources/images/table/icon_close_green.gif"   alt="" /></a></td> -->
<!-- 				</tr> -->
					<tr>
					<td class="green-left"><div id="tentativas" name="tentativas"class="tentativas" value="$(tentativas)"></div>$(mens)</td>
					<td class="green-right"><a class="close-green"><img src="resources/images/table/icon_close_green.gif"   alt="" /></a></td>
				</tr>
				</table>
				</div>


</div>
