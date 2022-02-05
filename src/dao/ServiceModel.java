package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import metier.*;



public class ServiceModel {
	
	static {
		HibernateUtil.getSessionFactory().openSession();
	}
	
	public static User getUser(String email) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from User where email like :mail");
		req.setString("mail", email);
		if (req.list().size()==0) return (null);
		else return (User) req.list().get(0);
	}
	public static User getUser(String email, String motPasse) throws Exception{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		Criterion critere = Restrictions.like("email", email);  
		criteria.add(critere);
		critere = Restrictions.like("motPasse", motPasse);  
		criteria.add(critere);
		if (criteria.list().size()==0) return (null);
		else return (User) criteria.list().get(0);
	}
	
	public static boolean add(Object obj) {
		  Session session=HibernateUtil.getSessionFactory().getCurrentSession();
	      session.beginTransaction();
	      session.save(obj);  
	     // session.saveOrUpdate(obj);
	      session.getTransaction().commit();
	    return true;
	}
	public static boolean addUser(User user) throws Exception  {
	      return add(user);  
    }
	

	public static List<User> getAllUsers() throws Exception{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("from User");
		return  req.list();
	}
	
	public static Patient getPersonne(String cin) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from Personne where CINpr like :cin");
		req.setString("cin", cin);
		if (req.list().size()==0) return (null);
		else return (Patient) req.list().get(0);
	}
  
	public static Patient getPatient(String cin) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from Patient where CINpr like :cin");
		req.setString("cin", cin);
		if (req.list().size()==0) return (null);
		else return (Patient) req.list().get(0);
	}
	
	public static boolean addPatient(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		  return add(patient); 
	}
	public static boolean addPatientProche(PatientProche patientProche) throws Exception {
		// TODO Auto-generated method stub
		  return add(patientProche); 
	}
	
	
	

	public static boolean addLocalisation(Localisation localisation) throws Exception{
		// TODO Auto-generated method stub
		  return add(localisation); 
	}
	public static boolean addPersonne(Personne personne) throws Exception{
		// TODO Auto-generated method stub
		  return add(personne); 
	}

	public static boolean update(Object obj) {
		  Session session=HibernateUtil.getSessionFactory().getCurrentSession();
	      session.beginTransaction();  
	      session.update(obj); 
	      session.getTransaction().commit();
	    return true;
	}
	public static boolean updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return update(patient);
	}
	
	public static PatientProche getPatientProcheByCin(String cin) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from PatientProche where CINp like :cin");
		req.setString("cin", cin);
		if (req.list().size()==0) return (null);
		else return (PatientProche) req.list().get(0);
	}
	
	
	
	
	public static List<Patient> getAllPatient() throws Exception{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("from Patient");
		return req.list() ;
	}
	
	public static boolean delete(Object obj) {
		  Session session=HibernateUtil.getSessionFactory().getCurrentSession();
	      session.beginTransaction();
	      session.delete(obj);
	      session.getTransaction().commit();
	    return true;
	}
	
	public static boolean deletePatient(Patient patient) throws Exception{
		// TODO Auto-generated method stub
		return delete(patient);
	}
	 
	public static Hopital getHopital(int idH) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from Hopital where idH like :idH");
		req.setLong("idH", idH);
		if (req.list().size()==0) return (null);
		else return (Hopital) req.list().get(0);
	}
	public static Hopital getHopitalCINp(String CIN) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery ("from Hopital where CINp like :CIN");
		req.setString("CIN", CIN);
		if (req.list().size()==0) return (null);
		else return (Hopital) req.list().get(0);
	}
	public static boolean addHopital(Hopital hopital)throws Exception{
		return add(hopital); 
	}
 
	public static List<Hopital> getAllHopital() throws Exception{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("from Hopital");
		return req.list() ;
	}
	public static boolean Deletehopital(Hopital hopital)  throws Exception{
		// TODO Auto-generated method stub
		return delete(hopital);
	}
	public static boolean updateHopital(Hopital hopital) {
		return update(hopital); 
	}
	 
}

	
	
	
	


