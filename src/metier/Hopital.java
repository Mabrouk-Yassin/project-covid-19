package metier;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Hopital implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idH ;
	private String NomHopital;
	private Date DateEntrer ;
	private Date DateSortir ;
	private Date DateDeces ;
	private String Tel ;
	private String CINp;
	private String Addresse;
	 
	private Set<Patient> patien= new HashSet<Patient>();
	
	
	private static SimpleDateFormat formatter = 
            new SimpleDateFormat ("dd-MM-yyyy", Locale.FRANCE);
	
	public String getDateEntrerString() {
		return (String) formatter.format (DateEntrer.getTime());
	}
	public String getDateSortirString() {
		return (String) formatter.format (DateSortir.getTime());
	}
	public String getDateDecesString() {
		return (String) formatter.format (DateDeces.getTime());
	}
	
	
	
	
	public Hopital(String nomHopital, Date dateEntrer, Date dateSortir, Date dateDeces, String tel, String cINp,
			 Set<Patient> patien) {
		NomHopital = nomHopital;
		DateEntrer = dateEntrer;
		DateSortir = dateSortir;
		DateDeces = dateDeces;
		Tel = tel;
		CINp = cINp;
		 
		this.patien = patien;
	}
	
	public Hopital(String nomHopital, Date dateEntrer, Date dateSortir, Date dateDeces, String tel, String cINp,
			String addresse, Set<Patient> patien) {
		super();
		NomHopital = nomHopital;
		DateEntrer = dateEntrer;
		DateSortir = dateSortir;
		DateDeces = dateDeces;
		Tel = tel;
		CINp = cINp;
		Addresse = addresse;
		this.patien = patien;
	}
	public Hopital() {
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
	public void setDateEntrer(Date dateEntrer2) {
		DateEntrer = dateEntrer2;
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
	public String getCINp() {
		return CINp;
	}
	public void setCINp(String cINp) {
		CINp = cINp;
	}
	@Override
	public String toString() {
		return "Hopital [idH=" + idH + ", NomHopital=" + NomHopital + ", DateEntrer=" + DateEntrer + ", DateSortir="
				+ DateSortir + ", DateDeces=" + DateDeces + ", Tel=" + Tel + ", CINp=" + CINp + ", Addresse=" + Addresse
				+ ", patien=" + patien + "]";
	}
	
	public Set<Patient> getPatien() {
		return patien;
	}
	public void setPatien(Set<Patient> patien) {
		this.patien = patien;
	}
	public String getAddresse() {
		return Addresse;
	}
	public void setAddresse(String addresse) {
		Addresse = addresse;
	}
	
	

	
}
