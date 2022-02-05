package metier;

import java.io.Serializable;

public class Localisation implements Serializable{
	private static final long serialVersionUID = 1L;
	private String CINprr;
	private String Region;
	private String Ville;
	private String District;
	 
	
	public Localisation() {
		}
	
	
	



	public Localisation(String cINprr, String region, String ville, String district) {
		super();
		CINprr = cINprr;
		Region = region;
		Ville = ville;
		District = district;
	}






	public String getCINprr() {
		return CINprr;
	}






	public void setCINprr(String cINprr) {
		CINprr = cINprr;
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






	@Override
	public String toString() {
		return "Localisation [CINprr=" + CINprr + ", Region=" + Region + ", Ville=" + Ville + ", District=" + District
				+ "]";
	}



	
	

}
