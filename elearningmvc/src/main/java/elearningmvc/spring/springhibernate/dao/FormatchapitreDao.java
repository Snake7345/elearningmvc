package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Formatchapitre;

public interface FormatchapitreDao 
{
	
	public void saveFormatchapitre(Formatchapitre formatchapitre);
	
	public void updateFormatchapitre(Formatchapitre formatchapitre);
	
	public List<Formatchapitre> getAllFormatchapitre();
	
	public Formatchapitre getById(int id);
	
	public void deleteFormatchapitre(int id);
}
