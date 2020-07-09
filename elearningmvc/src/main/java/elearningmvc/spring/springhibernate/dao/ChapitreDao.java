package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitre;

public interface ChapitreDao 
{
	int create(Chapitre chapitre);
	
	void update(Chapitre chapitre);
	
	void delete(Chapitre chapitre);
	
	Chapitre find(int id);
	
	List<Chapitre> findAll();
}
