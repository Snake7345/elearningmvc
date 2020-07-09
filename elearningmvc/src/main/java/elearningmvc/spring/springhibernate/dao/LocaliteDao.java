package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Localite;

public interface LocaliteDao 
{
	int create(Localite localite);
	
	void update(Localite localite);
	
	void delete(Localite localite);
	
	Localite find(int id);
	
	List<Localite> findAll();
}
