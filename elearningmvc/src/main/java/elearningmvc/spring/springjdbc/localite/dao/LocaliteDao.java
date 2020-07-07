package elearningmvc.spring.springjdbc.localite.dao;

import elearningmvc.spring.springjdbc.localite.dto.Localite;

public interface LocaliteDao 
{
	int create(Localite localite);
	int update(Localite localite);
	int delete(int id);
	
}
