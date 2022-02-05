package metier;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public  class Personne implements Serializable{
	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy", Locale.FRANCE);

	private String CINpr;
	private String Nom;
	private String Prenom;
	private Date DateNaissance;
	private String Adresse;
	private String Sexe;
	private String Telephone;
	private Localisation localisation;
//	private Set<PatientProche> PatientProchess= new HashSet<PatientProche>();
	

	public Personne() { }
	
	
	
	
	public Personne(String cINpr, String nom, String prenom, Date dateNaissance, String adresse, String sexe,
			String telephone) {
		CINpr = cINpr;
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		Adresse = adresse;
		Sexe = sexe;
		Telephone = telephone;
	
	}

	



	 
	
	public Personne(String cINpr, String nom, String prenom, Date dateNaissance, String adresse, String sexe,
			String telephone, Localisation localisation) {
		super();
		CINpr = cINpr;
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		Adresse = adresse;
		Sexe = sexe;
		Telephone = telephone;
		this.localisation = localisation;
	}




	public String getDatePersonneString() {
		return (String) formatter.format (DateNaissance.getTime());
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

	@Override
	public String toString() {
		return "Personne [CINpr=" + CINpr + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNaissance=" + DateNaissance
				+ ", Adresse=" + Adresse + ", Sexe=" + Sexe + ", Telephone=" + Telephone + ", localisation="
				+ localisation + "]";
	}




	public Localisation getLocalisation() {
		return localisation;
	}




	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}



	
}
