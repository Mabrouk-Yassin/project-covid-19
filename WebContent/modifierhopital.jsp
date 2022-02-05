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
<div id="formulaire">
		<s:form method ="post" action="validerUpdateHopital">
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>
		
		 <div >
			<ul>	
				<li ><a href="Accueil.action">Accueil</a></li>
				<li ><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li><a href="listerPatient.action">gestion des patient</a></li>
				<li class="active"><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #5F9EA0;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2> Modifier hôpital : <s:property value="#session.hopital.idH" /></h2> </div>
	<hr>
	 
		<table  class="center" style="margin-top :30px;">
		<div>
			<div class="form-input" >
		 	<s:textfield name="idH" id="idH" label="Id hôpital" labelposition="left"  placeholder="Saisissez le code"  value="%{#session.hopital.idH}" readonly="true"></s:textfield> 
			</div>
			   
	     	<div class="form-input" >
			 <s:textfield name="NomHopital" id="NomHopital" label="Nom hôpital" labelposition="left" placeholder="Saisissez le nom l'hopital" value="%{#session.hopital.NomHopital}"></s:textfield>	 
			</div>
			<div class="form-input" >
			 <s:textfield name="DateEntrer" id="DateEntrer" label="Date entree le patient" labelposition="left" value="%{#session.hopital.DateEntrer}" ></s:textfield>	 
			</div>
			<div class="form-input" >
			 <s:textfield name="DateSortir" id="DateSortir" label="Date sortir le patient" labelposition="left" value="%{#session.d}"></s:textfield>	 
			</div>
			<div class="form-input" >
			 <s:textfield name="DateDeces" id="DateDeces" label="Date deces le patient" labelposition="left" value="%{#session.d}" ></s:textfield>	 
			</div>
			<div class="form-input" >
			 <s:textfield name="Tel" id="Tel" label="Telephone" labelposition="left" placeholder="Saisissez le Telephone" value="%{#session.hopital.Tel}" ></s:textfield>	 
			</div>
			<div class="form-input" >
			 <s:textfield name="CINpp" id="CINpp" label="CIN patient" labelposition="left" placeholder="Saisissez le CIN patient" value="%{#session.hopital.CINp}"></s:textfield>	 
			</div>
			<div class="form-input" >
		 	<s:textfield name="Addresse" id="Addresse" label="Addresse" labelposition="left" placeholder="Addresse" value="%{#session.hopital.Addresse}"></s:textfield> 
			</div>
	
			<div >
			<s:submit value = "Modifier" style="font-size: 30px; height: 50px; width: 345px;  margin-top :8px; background-color:green;"> </s:submit>
			</div>
		</div>
		</table>
       </s:form>
</div>     
</body>
</html>
