package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Chapitreappris;

public class ChapitreapprisDaoImpl 
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveChapitreappris(Chapitreappris chapitreappris) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(chapitreappris);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateChapitreappris(Chapitreappris chapitreappris) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(chapitreappris);
		session.getTransaction().commit();
		session.close();
		
	}
 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Chapitreappris> getAllChapitreappris() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Chapitreappris");
		List<Chapitreappris> chapitreapprisList = query.list();
		return chapitreapprisList;
	}
 
	public Chapitreappris getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Chapitreappris chapitreappris = (Chapitreappris) session.load(Chapitreappris.class, new Integer(id));
		session.getTransaction().commit();
		return chapitreappris;
	}
 
	public void deleteChapitreappris(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Chapitreappris chapitreappris = (Chapitreappris)session.get(Chapitreappris.class, new Integer(id));
		session.delete(chapitreappris);
		session.getTransaction().commit();
		session.close();
	}
}
