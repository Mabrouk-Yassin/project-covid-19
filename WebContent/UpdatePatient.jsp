  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page d'accueil</title>
<link rel="stylesheet"  href="css/styles5.css">
</head>
<body>
<s:form method ="post" action="validerUpdatePatient">
<div id="formulaire">
		 
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>
		 
	    <div >
			<ul>	
				<li ><a href="Accueil.action">Accueil</a></li>
				<li><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li class="active"><a href="listerPatient.action">gestion des patient</a></li>
				<li><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul> 
		</div>
		<div><h6 style="color: #5F9EA0;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2> Modify patient :  <s:property value="#session.patient.CINpr" /></h2> </div>
	<hr>
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	  

		<div style="text-align: center;"><h2> MODIFY LES INFORMATIONS CONCERNANT LE PATIEN :</h2> </div>

		
		
		<table   class="center">
		<div>
			<div class="form-input" >
			
		 	<s:textfield  name="CINpr" id="CINpr" label="CIN" labelposition="left" placeholder="CIN"  value="%{#session.patient.CINpr}" readonly="true" > </s:textfield> 
			</div>
			
	     	<div class="form-input" >
			 <s:textfield name="Nom" id="Nom" label="Nom" labelposition="left" placeholder="Nom"  value="%{#session.patient.Nom}" > </s:textfield>	 
			</div>
			
			<div class="form-input" >
		 	<s:textfield name="Prenom" id="Prenom" label="Prenom"  labelposition="left" placeholder="Prenom" value="%{#session.patient.Prenom}"></s:textfield> 
			</div>
			
	     	<div class="form-input" >
			 <s:textfield name="Telephone" id="telephone"  label="Telephone"  labelposition="left" placeholder="Telephone" value="%{#session.patient.Telephone}"></s:textfield>	 
			</div>
			
			<div class="form-input" >
		 	<s:textfield name="Adresse" id="Adresse" label="Adress" labelposition="left" placeholder="Adress" value="%{#session.patient.Adresse}"></s:textfield> 
			</div>
			
	     	<div class="form-input" >
		 	<s:textfield name="DateNaissance" id="DateNaissance" label="Date" labelposition="left" placeholder="Date" value="%{#session.patient.DateNaissance}"></s:textfield> 
			</div>
		
			<div  >
			<s:radio name="Sexe" label="Sexe"	list="{'Masculin','Feminin'}" value="%{#session.patient.Sexe}"/>
			</div>
			
			<div  >
			<s:select name="EtatPatient" label="Etat de patient" list="{'Malade','gueris','Decede'}" style="font-size: 20px; height: 30px; width: 345px; margin-top :8px;"  value="%{#session.patient.EtatPatient}" />
			</div>
			
			<div  >
			<s:radio name="TypeCas" label="Type de cas"	list="{'Locale','Entrant'}"  value="%{#session.patient.TypeCas}" />
			</div>
	
			
			<div >
			<s:submit value = "Valider"  style="font-size: 30px; height: 50px; width: 345px;  margin-top :8px; background-color:green;"> </s:submit>
			</div>
		</div>
		</table>
      
</div> 
  </s:form>    
</body>
</html>
