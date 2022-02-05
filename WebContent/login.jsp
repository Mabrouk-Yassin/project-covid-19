  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire d'autentification</title>
<link rel="stylesheet"  a href="css/style1.css">
<link rel="stylesheet" a href="css\font-awesome.min.css">
</head>
<body>
 	<div class="container">

	<div id="formulaire">
		<s:form method ="post" action="validerlogin">
		
		  <h1 style="color: #fff; "> Login  </h1>
		   <div class="form-input">
			<s:textfield name="email" id="email"
				label="Email" labelposition="left" placeholder="email">
			</s:textfield>
			</div>
			
			<div class="form-input" >
			<s:textfield name="motPasse" id="motPasse"
				label="Mot de Passe" labelposition="left" placeholder="password" >
			</s:textfield>	
			</div>
			
			<div   >
			<s:submit value = "Login" style="font-size: 30px; height: 50px; width: 345px;"> </s:submit>
			</div>
		
		
		</s:form>
		
	<br>
	<h3 style="color: gray;">Vous n'avez pas un compte? <a href="inscription.action" style="color: cyan;;">Inscrivez vous maintenant...</a></h3>


		
		
		
	</div>
	</div>

 
</body>
</html>


