package elearningmvc.spring.springjdbc.localite.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import elearningmvc.spring.springjdbc.localite.dao.LocaliteDao;
import elearningmvc.spring.springjdbc.localite.dto.Localite;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("elearningmvc/spring/springjdbc/localite/test/config.xml");
		LocaliteDao dao= (LocaliteDao) context.getBean("localiteDao");
		/*Localite localite = new Localite();
		localite.setIdLocalite(2);
		localite.setVille("Jumet");
		localite.setCp(6040);*/
		//int result = dao.create(localite);
		//int result = dao.update(localite);
		//int result = dao.delete(1);
		//Localite localite = dao.read(2);
		List<Localite> result = dao.read();
		System.out.println("localite record:" + result);
	}
}
