package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import elearningmvc.spring.springhibernate.model.Module;

public class ModuleImpl implements ModuleDao
{
	private SessionFactory sessionFactory;
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
 
	public void saveModule (Module module) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(module);
		session.getTransaction().commit();
		session.close();	
	}
 
	public void updateModule (Module module) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.update(module);
		session.getTransaction().commit();
		session.close();
		
	}
 
	public List<Module> getAllModule() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("From Module");
		@SuppressWarnings("unchecked")
		List<Module> moduleList = query.list();
		return moduleList;
	}
 
	public Module getById(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Module module = (Module) session.load(Module.class, new Integer(id));
		session.getTransaction().commit();
		return module;
	}
 
	public void deleteModule(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Module module = (Module)session.get(Module.class, new Integer(id));
		session.delete(module);
		session.getTransaction().commit();
		session.close();
	}
}
