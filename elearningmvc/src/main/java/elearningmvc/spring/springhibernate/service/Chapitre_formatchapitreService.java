package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitre_formatchapitre;

public interface Chapitre_formatchapitreService {
	
	public void saveChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre);
	
	public void updateChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre);
	
	public List<Chapitre_formatchapitre> getAllChapitre_formatchapitre();
	
	public Chapitre_formatchapitre getById(int id);
	
	public void deleteChapitre_formatchapitre(int id);
}
