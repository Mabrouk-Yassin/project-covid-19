package web;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


import metier.*;


public class ServiceAction extends ActionSupport {


	private static final long serialVersionUID = 1L;
	
	//paramettre de login et d'inscription
	private  String email;
	private String nomPrenom;
	private  String motPasse;
	private User user;

    
	//paramettre d'ajout de personne
	private String CINpr;
	private String Nom;
	private String Prenom;
	private Date DateNaissance;
	private String Adresse;
	private String Sexe;
	private String Telephone;
	private Localisation localisation;
	
	//paramettre d'ajout de patient Proche

	private String Region;
	private String Ville;
	private String District;
	
	 
	//paramettre d'ajout de patient
	private String EtatPatient;
	private String TypeCas;
	
	//paramettre d'ajout de patient Proche
	private String CINp;
	private String Relation ;
	 
	private List<Patient>  allPatientt;
	private Patient patientDelete;
	/////////////?????
	private String CINmodi;
	private String cin;
	 
	//paramettre d'ajouter hopital	
	private int idH ;
	private String NomHopital;
	private Date DateEntrer ;
	private Date DateSortir ;
	private Date DateDeces ;
	private String Tel ;
	private String CINpp;
	private String Addresse;
	 
	private List<Hopital>  allHopital;
	
	
	 private Date today;
	 private static SimpleDateFormat formatter = 
	            new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss", Locale.FRANCE);

   /////////////////////////////////////////////
	 
 
	

	
	
	// Methodes d'actions 
	
	public String inscription()  {
		
		if(nomPrenom.equals("")) {
			addFieldError("nomPrenom", "le nomPrenom ne doit pas être vide");
			return "input";
		}
		try {
			
			if(ServiceMetier.getUserByEmail(email)!=null) {
				addFieldError("email", "Cet email existe deja");
				return "input";
			}
			
			User user= new User();
	    	user.setEmail(email);
	    	user.setNomPrenom(nomPrenom);
	    	user.setMotPasse(motPasse);
			
			ServiceMetier.addUser(user);
			
			email=null;
			nomPrenom=null;
			motPasse=null;
			
			return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
 

	public String login()  {
		
		try {
			 user= ServiceMetier.getUser(email, motPasse);
			 System.out.println(user.getNomPrenom());
			
			if (user!=null) {		
				ServletActionContext.getRequest().getSession().setAttribute("user", user);	
				return "success";
			}
			
		} catch (Exception e) {
			addFieldError("erreur", e.getMessage());
		}
		addFieldError("email", "Cet email n'existe pas");
		return "error";
	}
	
	public String AjouterPatient1()  {
			
			if(CINpr.equals("")) {
				addFieldError("CINpr", "le cin ne doit pas être vide");
				return "input";
			}
			try {
				
				if(ServiceMetier.getPatientByCin(CINpr)!=null) {
					addFieldError("CINpr", "Cet CIN existe deja");
					return "input";
					
				}
				Patient patient=new Patient();	
				Hopital hopitat=new Hopital();
				hopitat=ServiceMetier.getHopitaleByCIN(CINpr);
				System.out.println(hopitat+"------------------"+CINpr);
				patient.setCINpr(CINpr);
				patient.setNom(Nom);
				patient.setPrenom(Prenom);
				patient.setTelephone(Telephone);
				patient.setAdresse(Adresse);
				patient.setDateNaissance(DateNaissance);
				patient.setSexe(Sexe);
				patient.setEtatPatient(EtatPatient);
				patient.setTypeCas(TypeCas);
				patient.setHopital(hopitat);
				
				ServiceMetier.addPatient(patient);
				
				
				 Nom=null;
				 Prenom=null;
				 DateNaissance=null;
				 Adresse=null;
				 Sexe=null;
				 Telephone=null;
				 EtatPatient=null;
				 TypeCas=null;
				allPatientt=ServiceMetier.getAllPatient();
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "error";
		}
		
	
	public String AjouterPatient2() {
			
			try {
				if(ServiceMetier.getPatientByCin(CINpr)==null) {
					addFieldError("CINpr", "Cet CIN existe pas");
					return "input";
				}
				Patient patient=new Patient();
				Localisation loc=new Localisation();
				
				patient=ServiceMetier.getPatientByCin(CINpr);
			//	System.out.println("------------------/////"+ CINpr +"//////////////------------------"+patient);
			//	loc.setCINpr(CINpr);
				loc.setDistrict(District);
				loc.setVille(Ville);
				loc.setRegion(Region);
				patient.setLocalisation(loc);
				ServiceMetier.addPatient(patient);
				
				District=null;
				Ville=null;
				Region=null;
				
				return "success";
  	    			
	    	} catch (Exception e) {
	    		e.printStackTrace();;
	
			}
	    		return "error";
	
		}
	
	public String AjouterPatient3() throws Exception {
		
			if(ServiceMetier.getPatientByCin(CINpr)==null) {
				addFieldError("CINpr", "le  CIN existe pas ");
				return "input";
			}		
			else if(ServiceMetier.getPatientProcheByCin(CINp)!=null) {
			addFieldError("CINp", "Cet CIN existe deja");
			return "input";			
	     	}
			try {	
						Patient patient=new Patient();
						patient=ServiceMetier.getPatientByCin(CINpr);
						
						PatientProche patientProche=new PatientProche();
						
						patientProche.setCINp(CINp); 
						patientProche.setRelation(Relation);
						patientProche.setPatient(patient);
						ServiceMetier.addPatientProche(patientProche);
					    CINp=null;
					    Relation =null;							
					    return "success";	
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "error";
		}


	
	public String getPatient()  {
		
		try {

		  //   List<Patient>  allPatient;
			allPatientt=ServiceMetier.getAllPatient();
		//	ServletActionContext.getRequest().getSession().setAttribute("allPatient", allPatient);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}


	public String pageupdatePatient() throws Exception {


		if(ServiceMetier.getPatientByCin(CINpr)==null) {
			addFieldError("CINpr", "le  CIN existe pas ");

			return "input";		
     	}
		try {
					Patient patient=new Patient();
					patient=ServiceMetier.getPatientByCin(CINpr);
					ServletActionContext.getRequest().getSession().setAttribute("patient", patient);	
				    CINpr=null;
				    						
				    return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String UpdatePatient()  {
		
		try {
			Patient patient=new Patient();				
			patient.setCINpr(CINpr);
			patient.setNom(Nom);
			patient.setPrenom(Prenom);
			patient.setTelephone(Telephone);
			patient.setAdresse(Adresse);
			patient.setDateNaissance(DateNaissance);
			patient.setSexe(Sexe);
			patient.setEtatPatient(EtatPatient);
			patient.setTypeCas(TypeCas);
			
			ServiceMetier.updatePatient(patient);
			
			
			 Nom=null;
			 Prenom=null;
			 DateNaissance=null;
			 Adresse=null;
			 Sexe=null;
			 Telephone=null;
			 EtatPatient=null;
			 TypeCas=null;
			allPatientt=ServiceMetier.getAllPatient();
			addFieldError("CINpr", "patient que porte CIN bien modifier");
			return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String DeletePatient() throws Exception {
		if(ServiceMetier.getPatientByCin(CINpr)==null) {
			addFieldError("CINpr", "le  CIN existe pas ");

			return "input";		
     	}
		try {

					Patient patient=new Patient();
					patient=ServiceMetier.getPatientByCin(CINpr);
					ServiceMetier.deletePatient(patient);
				    CINpr=null;
				    allPatientt=ServiceMetier.getAllPatient();	
				    addFieldError("CINpr", "patient que porte CIN bien supprimer");
				    return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	 
	public String Deletehopital() throws Exception {
		
		if(ServiceMetier.getHopitaleById(idH)==null) {
			addFieldError("idH", "l'id de hôpital existe pas ");
			return "input";		
     	}
		try {

					Hopital hopital=new Hopital();
					hopital=ServiceMetier.getHopitaleById(idH);		
					ServiceMetier.Deletehopital(hopital);	
					allHopital=ServiceMetier.getAllHopital();
					addFieldError("idH", "l'id de hôpital bien supprimer");
				    return "success";	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String AjouterHopital()  {
		
		try {
			
			if(ServiceMetier.getHopitaleById(idH)!=null) {
				addFieldError("idH", "Cet idH existe deja");
				return "input";
				
			}
			
			Hopital hopital=new Hopital();				
			hopital.setIdH(idH);
			hopital.setNomHopital(NomHopital);
			hopital.setTel(Tel);
			hopital.setCINp(CINpp);
			hopital.setDateEntrer(DateEntrer); 
			hopital.setAddresse(Addresse);
			
		
		//	ServiceMetier.updatePatient(patient);
			ServiceMetier.addHopital(hopital);
			
			
			 
			 NomHopital=null;
			 DateEntrer=null;
			 Tel=null;
			 CINp=null;
			 Addresse=null;
			 allHopital=ServiceMetier.getAllHopital();
			return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	 
	public String pageAjouterHopital() {
		        	 Date d=new Date();		
		        	ServletActionContext.getRequest().getSession().setAttribute("d", formatter.format (d));						
				    return "success";
	}

	public String getHopital()  {
			
			try {
	
			  //   List<Patient>  allPatient;
				allHopital=ServiceMetier.getAllHopital();
			//	ServletActionContext.getRequest().getSession().setAttribute("allPatient", allPatient);	
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "success";
		}

	 
	public String pageUpdatehopital() throws Exception {
		allHopital=ServiceMetier.getAllHopital();
		if(ServiceMetier.getHopitaleById(idH)==null) {
			addFieldError("idH", "le  idH existe pas ");
			return "input";		
     	}
		try {
			 Date d=new Date();
		        	Hopital hopital=new Hopital();
		        	hopital=ServiceMetier.getHopitaleById(idH);	
		        	ServletActionContext.getRequest().getSession().setAttribute("d", formatter.format (d));	
					ServletActionContext.getRequest().getSession().setAttribute("hopital", hopital);							
				    return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		return "error";
	}
	 
	public String UpdateHopital()  {
			
			try {

				Hopital hopital=new Hopital();				
				hopital.setIdH(idH);
				hopital.setNomHopital(NomHopital);
				hopital.setTel(Tel);
				hopital.setCINp(CINpp);
				hopital.setDateEntrer(DateEntrer); 
				hopital.setDateSortir(DateSortir);
				hopital.setDateDeces(DateDeces);
				hopital.setAddresse(Addresse);
				
			
			//	ServiceMetier.updatePatient(patient);
				ServiceMetier.updateHopital(hopital);
		
				 NomHopital=null;
				 DateEntrer=null;
				 DateSortir=null;
				 DateDeces=null;
				 Tel=null;
				 CINp=null;
				 Addresse=null;
				 allHopital=ServiceMetier.getAllHopital();
				return "success";
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "error";
		}
    // getter et setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotPasse() {
		return motPasse;
	}
	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}
	public String getNomPrenom() {
		return nomPrenom;
	}
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public String getCINpr() {
		return CINpr;
	}

	public void setCINpr(String cINpr) {
		CINpr = cINpr;
	}

	public String getNom() {
		return Nom;
	} 

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public Date getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getSexe() {
		return Sexe;
	}

	public void setSexe(String sexe) {
		Sexe = sexe;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public Localisation getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}

	public String getEtatPatient() {
		return EtatPatient;
	}

	public void setEtatPatient(String etatPatient) {
		EtatPatient = etatPatient;
	}

	public String getTypeCas() {
		return TypeCas;
	}

	public void setTypeCas(String typeCas) {
		TypeCas = typeCas;
	}

	public String getCINp() {
		return CINp;
	}

	public void setCINp(String cINp) {
		CINp = cINp;
	}

	public String getRelation() {
		return Relation;
	}

	public void setRelation(String relation) {
		Relation = relation;
	}
	

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	

	public String getCINmodi() {
		return CINmodi;
	}

	public void setCINmodi(String cINmodi) {
		CINmodi = cINmodi;
	}



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public List<Patient> getAllPatientt() {
		return allPatientt;
	}



	public void setAllPatientt(List<Patient> allPatientt) {
		this.allPatientt = allPatientt;
	}



	public int getIdH() {
		return idH;
	}



	public void setIdH(int idH) {
		this.idH = idH;
	}



	public String getNomHopital() {
		return NomHopital;
	}



	public void setNomHopital(String nomHopital) {
		NomHopital = nomHopital;
	}



	public Date getDateEntrer() {
		return DateEntrer;
	}



	public void setDateEntrer(Date dateEntrer) {
		DateEntrer = dateEntrer;
	}



	public Date getDateSortir() {
		return DateSortir;
	}



	public void setDateSortir(Date dateSortir) {
		DateSortir = dateSortir;
	}



	public Date getDateDeces() {
		return DateDeces;
	}



	public void setDateDeces(Date dateDeces) {
		DateDeces = dateDeces;
	}



	public String getTel() {
		return Tel;
	}



	public void setTel(String tel) {
		Tel = tel;
	}



	public String getCINpp() {
		return CINpp;
	}



	public void setCINpp(String cINpp) {
		CINpp = cINpp;
	}



	public String getAddresse() {
		return Addresse;
	}



	public void setAddresse(String addresse) {
		Addresse = addresse;
	}



	public List<Hopital> getAllHopital() {
		return allHopital;
	}



	public void setAllHopital(List<Hopital> allHopital) {
		this.allHopital = allHopital;
	}



	


	 
	
	
	
	
	
	
}