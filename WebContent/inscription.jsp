<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix ="s" uri="/struts-tags" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire d'inscription</title>
<link rel="stylesheet"  a href="css/style1.css">
<link rel="stylesheet" a href="css\font-awesome.min.css">
</head>
<body>
<div class="container">

	 
		<s:form method ="post" action="validerinscription">
	
            <h1 style="color: #fff; "> inscription  </h1>
            <div class="form-input">
			<s:textfield name="nomPrenom" id="nomPrenom" label="Nom Prenom" labelposition="left" placeholder="Nom Prenom"  style="margin-top: 10px;"></s:textfield>
			</div>
			
			 <div class="form-input">
			<s:textfield name="email" id="email" label="Email" labelposition="left" placeholder="email"></s:textfield>
			</div>
			
			 <div class="form-input">
			<s:textfield name="motPasse" id="motPasse"	label="Mot de Passe" labelposition="left" placeholder="password"></s:textfield>
			</div>
			
			<s:submit value = "OK" style="font-size: 30px; height: 50px; width: 345px;"> </s:submit>
		
		</s:form>
		 <h3 style="color: gray;">Vous avez deja un compte? <a href="login.action" style="color: cyan;;">Login ici</a></h3>
		 
		                                                       
		
		
	</div>

		
</body>
</html>
