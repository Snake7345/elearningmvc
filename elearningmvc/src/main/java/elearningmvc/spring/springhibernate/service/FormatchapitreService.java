package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Formatchapitre;

public interface FormatchapitreService {
	
	public void saveFormatchapitre(Formatchapitre formatchapitre);
	
	public void updateFormatchapitre(Formatchapitre formatchapitre);
	
	public List<Formatchapitre> getAllFormatchapitre();
	
	public Formatchapitre getById(int id);
	
	public void deleteFormatchapitre(int id);
}
