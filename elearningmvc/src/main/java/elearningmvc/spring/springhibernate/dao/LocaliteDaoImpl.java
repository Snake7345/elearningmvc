package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import elearningmvc.spring.springhibernate.model.Localite;


public class LocaliteDaoImpl implements LocaliteDao 
{
	
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveLocalite(Localite localite) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(localite);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateLocalite(Localite localite) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(localite);
		session.getTransaction().commit();
		session.close();
		
	}
 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Localite> getAllLocalite() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Localite");
		List<Localite> localiteList = query.list();
		return localiteList;
	}
 
	public Localite getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Localite localite = (Localite) session.load(Localite.class, new Integer(id));
		session.getTransaction().commit();
		return localite;
	}
 
	public void deleteLocalite(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Localite localite = (Localite)session.get(Localite.class, new Integer(id));
		session.delete(localite);
		session.getTransaction().commit();
		session.close();
	}
	
}
