package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitre;

public interface ChapitreService {
	
	public void saveChapitre(Chapitre chapitre);
	
	public void updateChapitre(Chapitre chapitre);
	
	public List<Chapitre> getAllChapitre();
	
	public Chapitre getById(int id);
	
	public void deleteChapitre(int id);
}
