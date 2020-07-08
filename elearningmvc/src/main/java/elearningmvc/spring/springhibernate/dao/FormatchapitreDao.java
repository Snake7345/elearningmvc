package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.entity.Formatchapitre;

public interface FormatchapitreDao 
{
	int create(Formatchapitre formatchapitre);
	
	void update(Formatchapitre formatchapitre);
	
	void delete(Formatchapitre formatchapitre);
	
	Formatchapitre find(int id);
	
	List<Formatchapitre> findAll();
}
