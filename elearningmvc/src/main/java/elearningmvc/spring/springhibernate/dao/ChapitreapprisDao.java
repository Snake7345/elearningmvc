package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitreappris;

public interface ChapitreapprisDao 
{
	int create(Chapitreappris chapitreappris);
	
	void update(Chapitreappris chapitreappris);
	
	void delete(Chapitreappris chapitreappris);
	
	Chapitreappris find(int id);
	
	List<Chapitreappris> findAll();
}
