package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Chapitre;

public class ChapitreDaoImpl implements ChapitreDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveChapitre(Chapitre chapitre) {
		Session session = this.sessionFactory.openSession();		
		try
		{
			session.beginTransaction();
			session.save(chapitre);
			session.getTransaction().commit();
		}
		finally
		{
			if(session.getTransaction().isActive())
				session.getTransaction().rollback();
			session.clear();
			session.close();
		}
	}
 
	public void updateChapitre(Chapitre chapitre) {
		Session session = this.sessionFactory.openSession();	
		try
		{
			session.beginTransaction();
			session.update(chapitre);
			session.getTransaction().commit();
		}
		finally
		{
			if(session.getTransaction().isActive())
				session.getTransaction().rollback();
			session.clear();
			session.close();
		}
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Chapitre> getAllChapitre() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Chapitre");
		List<Chapitre> chapitreList = query.list();
		return chapitreList;
	}
 
	public Chapitre getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Chapitre chapitre = (Chapitre) session.load(Chapitre.class, new Integer(id));
		session.getTransaction().commit();
		return chapitre;
	}
 
	public void deleteChapitre(int id) {
		Session session = this.sessionFactory.openSession();
		Chapitre chapitre = (Chapitre)session.get(Chapitre.class, new Integer(id));
		try
		{
			session.beginTransaction();
			session.delete(chapitre);
			session.getTransaction().commit();
		}
		finally
		{
			if(session.getTransaction().isActive())
				session.getTransaction().rollback();
			session.clear();
			session.close();
		}
	}
}
