package elearningmvc.spring.springhibernate.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import elearningmvc.spring.springhibernate.dao.LocaliteDao;
import elearningmvc.spring.springhibernate.model.Localite;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("elearningmvc/spring/springhibernate/test/config.xml");
		LocaliteDao localiteDao = (LocaliteDao) context.getBean("LocaliteDao");
		/*Localite localite = new Localite();
		localite.setIdLocalite(1);
		localite.setCp(6040);
		localite.setVille("Jumet");
		//localiteDao.create(localite);
		//localiteDao.update(localite);
		localiteDao.delete(localite);
		*/
		
		//Localite localite = localiteDao.find(1);
		List<Localite> localite = localiteDao.findAll();
		System.out.println(localite);
		
		
		Configuration config = new Configuration();
	    config.addClass(Localite.class);
	    SessionFactory sessionFactory = config.buildSessionFactory();
	    Session session = sessionFactory.openSession(); 

	    Transaction tx = null; 
	    try { 
	      tx = session.beginTransaction(); 
	      //Localite personne = new Personnes("nom3", "prenom3", new Date());
	      session.update(localite);
	      session.flush() ;
	      tx.commit();
	    } catch (Exception e) {
	      if (tx != null) {
	        tx.rollback();
	      }
	      throw e;
	    } finally { 
	      session.close(); 
	    } 
		
		
		
	}
}
