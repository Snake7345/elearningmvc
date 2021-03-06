package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Role;

public class RoleDaoImpl implements RoleDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveRole(Role role) {
		Session session = this.sessionFactory.openSession();
		try
		{
			session.beginTransaction();
			session.save(role);
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
 
	public void updateRole(Role role) {
		Session session = this.sessionFactory.openSession();	
		try
		{
			session.beginTransaction();
			session.update(role);
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
	public List<Role> getAllRole() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Role");
		List<Role> roleList = query.list();
		return roleList;
	}
 
	public Role getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Role role = (Role) session.load(Role.class, new Integer(id));
		session.getTransaction().commit();
		return role;
	}
 
	public void deleteRole(int id) {
		Session session = this.sessionFactory.openSession();
		
		
		try
		{
			session.beginTransaction();
			Role role = (Role)session.get(Role.class, new Integer(id));
			session.delete(role);
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
