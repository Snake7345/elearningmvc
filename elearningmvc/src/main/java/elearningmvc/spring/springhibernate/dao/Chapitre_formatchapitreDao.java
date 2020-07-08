package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.entity.Chapitre_formatchapitre;

public interface Chapitre_formatchapitreDao 
{
	int create(Chapitre_formatchapitre chapitre_formatchapitre);
	
	void update(Chapitre_formatchapitre chapitre_formatchapitre);
	
	void delete(Chapitre_formatchapitre chapitre_formatchapitre);
	
	Chapitre_formatchapitre find(int id);
	
	List<Chapitre_formatchapitre> findAll();

}
