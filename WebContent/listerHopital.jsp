<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Afficher Hopital</title>
<link rel="stylesheet"  href="css/styles3.css">
</head>
<body>
<s:form method ="post" action="AjouterHopital"> 
<div id="formulaire">
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
				<li><a href="listerPatient.action">gestion des patient</a></li>
				<li class="active"><a href="listerHopital.action">gestion des hôpital</a></li>
				<li><a href="login.action">Deconnexion</a></li>
			</ul>
		</div>
		<div><h6 style="color: #D0E3FA;">.</h6></div>
	<div style="margin-top :60px; margin-left: 50px;"><h2> Liste des patient dans l'hôpital</h2> </div>
	<hr>
	
	     	     
		    <table  id="center" style="margin-top :30px;"  >
		       <div >
			<div class="form-input" >
		 	<s:textfield name="idH" id="idH" label="Id hôpital" labelposition="left"  placeholder="Saisissez le code" ></s:textfield> 
			</div>
			
			<div >
			<s:submit value = "Delete"  action="Deletehopital" style="font-size: 30px; height: 40px; width: 500px;   "> </s:submit>
			</div>
			<div >
			<s:submit value = "Update" action="pageUpdatehopital" style="font-size: 30px; height: 40px; width: 500px;  margin-top :0px; background-color:green;"> </s:submit>
			</div>
			<div >
			<s:submit value = "Ajouter Hopital"   style="font-size: 30px; height: 40px; width: 500px;  margin-top :0px; background-color:#6495ed;"> </s:submit>
			</div>
			
		  </div> 
		</table>
		  
		 <s:if test="%{allHopital.size()>0}">
		  <TABLE style="margin-top :50px;" class="tableliste">
	<TR>
		<TH >Id hôpital</TH> 
		<TH >Nom hôpital</TH>
		<TH >Date entree</TH>
		<TH >Date sortie</TH>
		<TH >Date décès</TH>
		<TH >Telephone </TH> 
		<TH >CIN patient</TH>
	 
		
	</TR>
	<s:iterator value="allHopital">
	<TR>  
	 	<TD > <s:property value="idH"/>  </TD>
		<TD>  <s:property value="NomHopital"/>  </TD>
		<TD > <s:property value="DateEntrer"/>    </TD>
		<TD > <s:property value="DateSortir"/>     </TD>
		<TD > <s:property value="DateDeces"/>     </TD>
		<TD > <s:property value="Tel"/>   </TD>
		<TD > <s:property value="CINp"/>     </TD>
		 
	</TR>
	</s:iterator>
	    
</TABLE>
</s:if>
<s:else >
		<table> 
	  <th> Aucune Hopital </th>
	   </table>
</s:else>
		
		
	
	
</div>   
</s:form>
</body>
</html>
