package metier;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Patient implements Serializable { 
	private static final long serialVersionUID = 1L;
	private String CINpr;
	private String Nom;
	private String Prenom;
	private Date DateNaissance;
	private String Adresse;
	private String Sexe;
	private String Telephone;
	private Localisation localisation;
	private String EtatPatient;
	private String TypeCas;
	private Hopital hopital;
	

	private Set<PatientProche> PatientProche= new HashSet<PatientProche>();
	
	
	private static SimpleDateFormat formatter = 
            new SimpleDateFormat ("dd-MM-yyyy", Locale.FRANCE);
	
	public String getDatePatientString() {
		return (String) formatter.format (DateNaissance.getTime());
	}

	
	public Patient() {

	}




	public Patient(String cINpr, String nom, String prenom, Date dateNaissance, String adresse, String sexe,
			String telephone, Localisation localisation, String etatPatient, String typeCas,
			Set<metier.PatientProche> patientProche) {
		super();
		CINpr = cINpr;
		Nom = nom;
		Prenom = prenom;
		DateNaissance = dateNaissance;
		Adresse = adresse;
		Sexe = sexe;
		Telephone = telephone;
		this.localisation = localisation;
		EtatPatient = etatPatient;
		TypeCas = typeCas;
		PatientProche = patientProche;
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




	public Set<PatientProche> getPatientProche() {
		return PatientProche;
	}




	public void setPatientProche(Set<PatientProche> patientProche) {
		PatientProche = patientProche;
	}




	@Override
	public String toString() {
		return "Patient [CINpr=" + CINpr + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNaissance=" + DateNaissance
				+ ", Adresse=" + Adresse + ", Sexe=" + Sexe + ", Telephone=" + Telephone + ", localisation="
				+ localisation + ", EtatPatient=" + EtatPatient + ", TypeCas=" + TypeCas + ", hopital=" + hopital
				+ ", PatientProche=" + PatientProche + "]";
	}


	public Hopital getHopital() {
		return hopital;
	}


	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}
	















}
