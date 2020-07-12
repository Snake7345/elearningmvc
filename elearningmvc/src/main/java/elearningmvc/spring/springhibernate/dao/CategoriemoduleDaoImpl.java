package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import elearningmvc.spring.springhibernate.model.Categoriemodule;


public class CategoriemoduleDaoImpl implements CategoriemoduleDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveCategoriemodule(Categoriemodule categoriemodule) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(categoriemodule);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateCategoriemodule(Categoriemodule categoriemodule) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(categoriemodule);
		session.getTransaction().commit();
		session.close();
		
	}
 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Categoriemodule> getAllCategoriemodule() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Categoriemodule");	
		List<Categoriemodule> categoriemoduleList = query.list();
		return categoriemoduleList;
	}
 
	public Categoriemodule getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Categoriemodule categoriemodule = (Categoriemodule) session.load(Categoriemodule.class, new Integer(id));
		session.getTransaction().commit();
		return categoriemodule;
	}
 
	public void deleteCategoriemodule(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Categoriemodule categoriemodule = (Categoriemodule)session.get(Categoriemodule.class, new Integer(id));
		session.delete(categoriemodule);
		session.getTransaction().commit();
		session.close();
	}
}
