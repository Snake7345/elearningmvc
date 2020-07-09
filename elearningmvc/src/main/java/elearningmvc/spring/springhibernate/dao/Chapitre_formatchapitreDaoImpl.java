package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import elearningmvc.spring.springhibernate.model.Chapitre_formatchapitre;

public class Chapitre_formatchapitreDaoImpl implements Chapitre_formatchapitreDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(chapitre_formatchapitre);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(chapitre_formatchapitre);
		session.getTransaction().commit();
		session.close();
		
	}
 
	public List<Chapitre_formatchapitre> getAllChapitre_formatchapitre() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Chapitre_formatchapitre");
		@SuppressWarnings("unchecked")
		List<Chapitre_formatchapitre> chapitre_formatchapitreList = query.list();
		return chapitre_formatchapitreList;
	}
 
	public Chapitre_formatchapitre getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Chapitre_formatchapitre chapitre_formatchapitre = (Chapitre_formatchapitre) session.load(Chapitre_formatchapitre.class, new Integer(id));
		session.getTransaction().commit();
		return chapitre_formatchapitre;
	}
 
	public void deleteChapitre_formatchapitre(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Chapitre_formatchapitre chapitre_formatchapitre = (Chapitre_formatchapitre)session.get(Chapitre_formatchapitre.class, new Integer(id));
		session.delete(chapitre_formatchapitre);
		session.getTransaction().commit();
		session.close();
	}
}
