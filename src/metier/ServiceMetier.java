package metier;

import dao.*;
import java.util.List;


public class ServiceMetier {
   
	public ServiceMetier ()  {}
	// Methodes metiers login et inscription User
	public static User getUserByEmail(String email) throws Exception {
		return ServiceModel.getUser(email);
	}
	public static User getUser(String email, String motPasse) throws Exception {
		return ServiceModel.getUser(email, motPasse);
	}
	public static boolean addUser(User user) throws Exception {
		return ServiceModel.addUser(user);
	}
	
	public static Patient getPersonneByCin(String cin) throws Exception {
		return ServiceModel.getPersonne(cin);
	}
	public static Patient getPatientByCin(String cin) throws Exception {
		return ServiceModel.getPatient(cin);
	}
	public static PatientProche getPatientProcheByCin(String cin) throws Exception {
		return ServiceModel.getPatientProcheByCin(cin);
	}
	
	public static boolean addPatient(Patient patient) throws Exception {
		return ServiceModel.addPatient(patient);
	}
	public static boolean addPersonne(Personne personne) throws Exception {
		return ServiceModel.addPersonne(personne);
	}
	public static boolean addPatientProche(PatientProche patientProche) throws Exception {
		return ServiceModel.addPatientProche(patientProche);
	}
	
	
	public static boolean addLocalisation(Localisation localisation) throws Exception {
		return ServiceModel.addLocalisation(localisation);
	}
	public static List<Patient> getAllPatient() throws Exception{
		// TODO Auto-generated method stub
		return (ServiceModel.getAllPatient()) ;
	}
	public static boolean deletePatient(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		return ServiceModel.deletePatient(patient);		
	}
	public static boolean updatePatient(Patient patient)throws Exception {
		// TODO Auto-generated method stub
		return ServiceModel.updatePatient(patient);
	}
	public static Hopital getHopitaleById(int idH) {
		return ServiceModel.getHopital(idH);
	}
	 
	public static Hopital getHopitaleByCIN(String CINp) {
		return ServiceModel.getHopitalCINp(CINp);
	}
	public static boolean addHopital(Hopital hopital) throws Exception {
		return ServiceModel.addHopital(hopital);
	}
	public static List<Hopital> getAllHopital() throws Exception{
		// TODO Auto-generated method stub
		return (ServiceModel.getAllHopital()) ;
	}
	public static boolean Deletehopital(Hopital hopital) throws Exception {
		return ServiceModel.Deletehopital(hopital);	 
	}
	public static boolean updateHopital(Hopital hopital)throws Exception {
		return ServiceModel.updateHopital(hopital);
		
	}

	
	
	
	
}
