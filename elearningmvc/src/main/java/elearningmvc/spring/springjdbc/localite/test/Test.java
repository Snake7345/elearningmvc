package elearningmvc.spring.springjdbc.localite.test;

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
		Localite localite = new Localite();
		localite.setIdLocalite(2);
		localite.setVille("Bruxelles");
		localite.setCp(1000);
		int result = dao.create(localite);
		System.out.println("Number of records inserted are:" + result);
	}
}
