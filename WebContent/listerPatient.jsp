  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Afficher des Patient</title>
<link rel="stylesheet"  href="css/styles3.css">
</head>
<body>
<s:form method ="post" action="AjouterPatient1"> 
<div id="formulaire">
 	
		<div class="main">
			<div class="logo">
				<img src="image/1515.jpeg">
			</div>
		</div>

		  <div >
			<ul>	
				<li ><a href="Accueil.action">Accueil</a></li>
				<li  ><a href="AjouterPatient1.action">Ajouter patient</a> 
			    <li><a href="AjouterPatient3.action">Ajouter patient proche</a></li>
				<li class="active"><a href="listerPatient.action">gestion des patient</a></li>
				<li><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #D0E3FA;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2>Liste des patient</h2> </div>
	<hr>
    
	<div style="margin-left: 50px;"><h3> Bonjour ! <s:property value="#session.user.nomPrenom" /></h3> </div>	
	
	<table  id="center" style="margin-top :30px;"  >
		       <div >
			<div class="form-input" >
			 <s:textfield name="CINpr" id="CINpr" label="CIN Patient" labelposition="left" placeholder="CIN" ></s:textfield>	 
			</div>
	
			<div >
			<s:submit value = "Delete"  action="DeletePatient" style="font-size: 30px; height: 40px; width: 500px; "> </s:submit>
			</div>
			<div >
			<s:submit value = "Update" action="pageUpdate" style="font-size: 30px; height: 40px; width: 500px;  margin-top :0px; background-color:green;"> </s:submit>
			</div>
			
			<s:submit value = "Ajouter Patient"   style="font-size: 30px; height: 40px; width: 500px;  margin-top :0px; background-color:#6495ed;"> </s:submit>
			</div>
			
		  </div> 
		</table>
	
	
	
		 <s:if test="%{allPatientt.size()>0}">
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
	<s:iterator value="allPatientt">
	<TR>  
	 	<TD > <s:property value="CINpr"/>  </TD>
		<TD>  <s:property value="Nom"/>  </TD>
		<TD > <s:property value="Prenom"/>    </TD>
		<TD > <s:property value="Telephone"/>     </TD>
		<TD > <s:property value="Adresse"/>     </TD>
		<TD > <s:property value="DateNaissance"/>   </TD>
		<TD > <s:property value="Sexe"/>     </TD>
		<TD > <s:property value="EtatPatient"/>     </TD>
		<TD > <s:property value="TypeCas"/>     </TD>
	</TR>
	</s:iterator>
	
</TABLE>
</s:if>
<s:else >
     <table> 
	   Aucune Patient 
	   </table>
</s:else>
 	 
	
</div>   
</s:form>
</body>
</html>
