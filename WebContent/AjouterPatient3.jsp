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
			<s:form method ="post" action="validerAjouterPatient3">
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>
		  <div >
			<ul>	
				<li ><a href="Accueil.action">Accueil</a></li>
				<li  ><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li class="active"><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li><a href="listerPatient.action">gestion des patient</a></li>
				<li><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #5F9EA0;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2>Ajouter patient proche</h2> </div>
	<hr>
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	
	
	
		<table class="NVPatient">
		<tr>
		<td  >
		<h1 style="margin-left: 400px;"> Nouveau patient  </h1><br>
		<h2 style="margin-left: 200px;">REMPLIR LES INFORMATIONS DU PATIEN PROCHE :</h2><br>
		<h5 style="margin-left: 200px;"> Etape N 3 : </h5>
		</td>
		</tr>
		</table>
		
       
		
		<table   class="center">
		<div>
		 
	     	<div class="form-input" >
			 <s:textfield name="CINpr" id="CINpr" label="CIN Patient" labelposition="left" placeholder="CIN" ></s:textfield>	 
			</div>
			
			<div class="form-input" >
		 	<s:textfield name="CINp" id="CINp" label="CIN patient proche" labelposition="left" placeholder="CIN" ></s:textfield> 
			</div>
			
	 
			
			<div  >
			<s:radio name="Relation" label="Relation"	list="{'Famille','Ami(e)','Voisin(e)','Collegue de travail'}"  />
			</div>
	
			
			
			<div >
			<s:submit value = "Valider" style="font-size: 30px; height: 50px; width: 380px;  margin-top :15px; background-color:green;"> </s:submit>
			</div>
			
		</div>
		</table>
       </s:form>
</div>     
</body>
</html>
