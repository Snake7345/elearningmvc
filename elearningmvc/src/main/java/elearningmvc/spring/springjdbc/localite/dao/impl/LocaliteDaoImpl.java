package elearningmvc.spring.springjdbc.localite.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import elearningmvc.spring.springjdbc.localite.dao.LocaliteDao;
import elearningmvc.spring.springjdbc.localite.dto.Localite;
import elearningmvc.spring.springjdbc.localite.rowmappper.LocaliteRowMapper;

public class LocaliteDaoImpl implements LocaliteDao 
{

	private JdbcTemplate jdbcTemplate;
	
	/****************************CRUD*******************************************************/
	@Override
	public int create(Localite localite) 
	{
		String sql = "insert into localite values (?,?,?)";
		int result = jdbcTemplate.update(sql, localite.getIdLocalite(),localite.getVille(),localite.getCp());
		return result;
	}
	
	@Override
	public int update(Localite localite) 
	{
		String sql = "update localite set ville=?, CP=? where idLocalite=?";
		int result = jdbcTemplate.update(sql, localite.getVille(),localite.getCp(),localite.getIdLocalite());
		return result;
	}
	
	@Override
	public int delete(int id) 
	{
		String sql = "delete from localite where idLocalite=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}
	
	@Override
	public Localite read(int id) {
		String sql = "select * from localite where idLocalite=?";
		LocaliteRowMapper rowmapper = new LocaliteRowMapper();
		Localite localite = jdbcTemplate.queryForObject(sql, rowmapper,id);
		return localite;
	}
	
	@Override
	public List<Localite> read() 
	{
		String sql = "select * from localite";
		LocaliteRowMapper rowmapper = new LocaliteRowMapper();
		List<Localite> result = jdbcTemplate.query(sql, rowmapper);
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
