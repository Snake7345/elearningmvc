package elearningmvc.spring.springjdbc.localite.dao;

import java.util.List;

import elearningmvc.spring.springjdbc.localite.dto.Localite;

public interface LocaliteDao 
{
	int create(Localite localite);
	int update(Localite localite);
	int delete(int id);
	
	Localite read(int id);
	
	List<Localite> read();
	
}
