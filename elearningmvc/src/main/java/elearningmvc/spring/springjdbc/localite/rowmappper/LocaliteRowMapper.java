package elearningmvc.spring.springjdbc.localite.rowmappper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import elearningmvc.spring.springjdbc.localite.dto.Localite;

public class LocaliteRowMapper implements RowMapper<Localite> 
{

	@Override
	public Localite mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Localite loca = new Localite();
		loca.setIdLocalite(rs.getInt(1));
		loca.setVille(rs.getString(2));
		loca.setCp(rs.getInt(3));
		return loca;
	}

}
