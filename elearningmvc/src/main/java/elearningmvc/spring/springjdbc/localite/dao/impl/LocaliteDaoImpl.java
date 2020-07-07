package elearningmvc.spring.springjdbc.localite.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import elearningmvc.spring.springjdbc.localite.dao.LocaliteDao;
import elearningmvc.spring.springjdbc.localite.dto.Localite;

public class LocaliteDaoImpl implements LocaliteDao 
{

	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Localite localite) 
	{
		String sql = "insert into localite values (?,?,?)";
		int result = jdbcTemplate.update(sql, localite.getIdLocalite(),localite.getVille(),localite.getCp());
		return result;
	}
	
	/*****************************Getter & Setter********************************************/
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
