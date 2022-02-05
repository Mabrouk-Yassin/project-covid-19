  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Afficher des Patient</title>
<link rel="stylesheet"  href="css/styles4.css">
</head>
<body>
<div id="formulaire">
  	 <s:form method ="post" > <!--ValidrecherchPatient  -->
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>

		  <div >
			<ul>	
				<li><a href="Accueil.action">Accueil</a></li>
				<li><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				 <li class="active"><a href="RecherchPatient.action">Rechercher un Patient</a></li>
				<li><a href="listerPatient.action">Liste des patient</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #D0E3FA;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2> patient</h2> </div>
	<hr>
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	
	
	
	   
	   <table   class="center">
		<div>
		 
	     	<div class="form-input" >
			 <s:textfield name="CINpr" id="CINpr"  labelposition="left" placeholder="CIN" ></s:textfield>	 
			</div>
			
			
			
			<div >
			<s:submit value = "Delete"  action="DeletePatient" style="font-size: 30px; height: 50px; width: 550px;  margin-top :15px; background-color:green;"> </s:submit>
			</div>
			<div >
			<s:submit value = "Valider update" action="pageUpdate" style="font-size: 30px; height: 50px; width: 550px;  margin-top :15px; background-color:green;"> </s:submit>
			</div>
			
		</div>
		</table>
		
		
		 <s:if test="%{patientDelete!=null}">
		  <TABLE style="margin-top :50px;" class="tableliste">
	<TR>
		<TH >CIN patient</TH> 
		<TH >Nom</TH>
		<TH >Prenom</TH>
		<TH >Telephone</TH>
		<TH >Adresse</TH>
		<TH >Date naissance</TH>
		<TH >Sexe</TH>
		<TH >Etat</TH>
		<TH >Type de cas</TH>
		
	</TR>

	<TR>  
	 	<TD > <s:property value="%{patientDelete.CINpr}"/>  </TD>
		<TD>  <s:property value="%{patientDelete.Nom}"/>  </TD>
		<TD > <s:property value="%{#session.patientDelete.Prenom}"/>    </TD>
		<TD > <s:property value="%{#session.patientDelete.Telephone}"/>     </TD>
		<TD > <s:property value="%{#session.patientDelete.Adresse}"/>     </TD>
		<TD > <s:property value="%{#session.patientDelete.DateNaissance}"/>   </TD>
		<TD > <s:property value="%{#session.patientDelete.Sexe}"/>     </TD>
		<TD > <s:property value="%{#session.patientDelete.EtatPatient}"/>     </TD>
		<TD > <s:property value="%{#session.patientDelete.TypeCas}"/>     </TD>
	</TR>

	
</TABLE>
</s:if>
<s:else >
	   Aucune Patient 
</s:else>
 	 
	 
	
  	                               
</s:form>
</div>   

</body>
</html>
