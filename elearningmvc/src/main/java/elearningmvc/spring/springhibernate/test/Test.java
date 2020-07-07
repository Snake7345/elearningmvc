package elearningmvc.spring.springhibernate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import elearningmvc.spring.springhibernate.dao.LocaliteDao;
import elearningmvc.spring.springhibernate.entity.Localite;

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
	}
}
