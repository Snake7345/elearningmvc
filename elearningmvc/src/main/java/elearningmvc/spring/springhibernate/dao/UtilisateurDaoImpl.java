package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Utilisateur;

public class UtilisateurDaoImpl implements UtilisateurDao
{

	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveUtilisateur(Utilisateur utilisateur) {
		Session session = this.sessionFactory.openSession();	
		try
		{
			session.beginTransaction();
			session.save(utilisateur);
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
 
	public void updateUtilisateur(Utilisateur utilisateur) {
		Session session = this.sessionFactory.openSession();
		try
		{
			session.beginTransaction();
			session.update(utilisateur);
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
	public List<Utilisateur> getAllUtilisateur() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Utilisateur");
		List<Utilisateur> utilisateurList = query.list();
		return utilisateurList;
	}
 
	public Utilisateur getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Utilisateur utilisateur = (Utilisateur) session.load(Utilisateur.class, new Integer(id));
		session.getTransaction().commit();
		return utilisateur;
	}
 
	public void deleteUtilisateur(int id) {
		Session session = this.sessionFactory.openSession();
		Utilisateur utilisateur = (Utilisateur)session.get(Utilisateur.class, new Integer(id));
		try
		{
			session.beginTransaction();
			session.delete(utilisateur);
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
