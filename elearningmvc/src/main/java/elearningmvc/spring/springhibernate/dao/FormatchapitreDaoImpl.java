package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Formatchapitre;

public class FormatchapitreDaoImpl implements FormatchapitreDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveFormatchapitre(Formatchapitre formatchapitre) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(formatchapitre);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateFormatchapitre(Formatchapitre formatchapitre) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(formatchapitre);
		session.getTransaction().commit();
		session.close();
		
	}
 
	public List<Formatchapitre> getAllFormatchapitre() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Formatchapitre");
		@SuppressWarnings("unchecked")
		List<Formatchapitre> formatchapitreList = query.list();
		return formatchapitreList;
	}
 
	public Formatchapitre getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Formatchapitre formatchapitre = (Formatchapitre) session.load(Formatchapitre.class, new Integer(id));
		session.getTransaction().commit();
		return formatchapitre;
	}
 
	public void deleteFormatchapitre(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Formatchapitre formatchapitre = (Formatchapitre)session.get(Formatchapitre.class, new Integer(id));
		session.delete(formatchapitre);
		session.getTransaction().commit();
		session.close();
	}
}
