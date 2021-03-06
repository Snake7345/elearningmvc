package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Invitation;

public class InvitationDaoImpl implements InvitationDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveInvitation(Invitation invitation) {
		Session session = this.sessionFactory.openSession();
		try
		{
			session.beginTransaction();
			session.save(invitation);
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
 
	public void updateInvitation(Invitation invitation) {
		Session session = this.sessionFactory.openSession();	
		try
		{
			session.beginTransaction();
			session.update(invitation);
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
	public List<Invitation> getAllInvitation() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Invitation");
		List<Invitation> invitationList = query.list();
		return invitationList;
	}
 
	public Invitation getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Invitation invitation = (Invitation) session.load(Invitation.class, new Integer(id));
		session.getTransaction().commit();
		return invitation;
	}
 
	public void deleteInvitation(int id) {
		Session session = this.sessionFactory.openSession();
		Invitation invitation = (Invitation)session.get(Invitation.class, new Integer(id));
		try
		{
			session.beginTransaction();
			session.delete(invitation);
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
