package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitre;

public interface ChapitreDao 
{
	
	public void saveChapitre(Chapitre chapitre);
	
	public void updateChapitre(Chapitre chapitre);
	
	public List<Chapitre> getAllChapitre();
	
	public Chapitre getById(int id);
	
	public void deleteChapitre(int id);
}
