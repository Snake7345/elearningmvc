package elearningmvc.spring.springjdbc.localite.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("elearningmvc/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate= (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into localite values (?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(1), "Charleroi", "6000");
		System.out.println("Number of records inserted are:" + result);
	}
}
