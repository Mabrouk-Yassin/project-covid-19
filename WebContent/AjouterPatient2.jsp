 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page d'accueil</title>
<link rel="stylesheet"  href="css/styles.css">
</head>
<body>
<div id="formulaire">
			<s:form method ="post" action="validerAjouterPatient2">
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>
		
			 <div >
			<ul>	
				<li ><a href="Accueil.action">Accueil</a></li>
				<li class="active"><a href="AjouterPatient2.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li><a href="listerPatient.action">gestion des patient</a></li>
				<li><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #5F9EA0;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2> Ajouter patient</h2> </div>
	<hr>
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	
	
		 
	
		<table class="NVPatient">
		<tr>
		<td  >
		<h1 style="margin-left: 400px;"> Nouveau patient  </h1><br>
		<h2 style="margin-left: 200px;"> INFORMATIONS AU PROPOS DE LA LOCALISATION :</h2><br>
		<h5 style="margin-left: 200px;"> Etape N 2 : </h5>
		</td>
		</tr>
		</table>
		
       
		
		<table   class="center">
		<div>
		<div class="form-input" >
			 <s:textfield name="CINpr" id="CINpr" label="CINPaloc" labelposition="left" placeholder="CINPaloc" ></s:textfield>	 
			</div>
			<div class="form-input" >
			
		 	<s:textfield name="Region" id="Region" label="Region" labelposition="left" placeholder="Region" ></s:textfield> 
			</div>
			
	     	<div class="form-input" >
			 <s:textfield name="Ville" id="Ville" label="ville" labelposition="left" placeholder="ville" ></s:textfield>	 
			</div>
			
			<div class="form-input" >
		 	<s:textfield name="District" id="District" label="District" labelposition="left" placeholder="District" ></s:textfield> 
			</div>
			
	
			<div >
			<s:submit value = "Valider" style="font-size: 30px; height: 50px; width: 345px;  margin-top :8px; background-color:green;"> </s:submit>
			</div>
		</div>
		</table>
       </s:form>
</div>     
</body>
</html>
