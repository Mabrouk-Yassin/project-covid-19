<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page d'accueil</title>
<link rel="stylesheet"  href="css/style2.css">
</head>
<body>
	<header>
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>
		<div >
			<ul>	
				<li class="active"><a href="Accueil.action">Accueil</a></li>
				<li><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li><a href="listerPatient.action">gestion des patient</a></li>
				<li><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: green;">.</h6></div>
	<div style="margin-top :60px;margin-left: 50px;"><h2> Accueil</h2> </div>
	<hr>
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	
	
		
	<!--   
	<DIV >
	<IMG SRC="image/0101.jpg" width="1000" height="500" style="margin-top :50px;"/>
   </DIV>-->
   </header>
</body>
</html>









































































