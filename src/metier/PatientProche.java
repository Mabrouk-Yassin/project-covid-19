package metier;

import java.io.Serializable;

public class PatientProche extends Personne implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//private String CINpr;
	private String CINp;
	private String Relation ;
	private Patient patient;
	
	public PatientProche() {}
	
	

	public PatientProche( String cINp, String relation) {
		this.CINp = cINp;
		this.Relation = relation;
		
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


	@Override
	public String toString() {
		return "PatientProche [CINp=" + CINp + ", Relation=" + Relation + ", pat=" + patient + "]";
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	
	

}
