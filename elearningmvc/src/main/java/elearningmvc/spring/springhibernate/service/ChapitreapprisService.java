package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Chapitreappris;

public interface ChapitreapprisService 
{
	public void saveChapitreappris(Chapitreappris chapitreappris);
	
	public void updateChapitreappris(Chapitreappris chapitreappris);
	
	public List<Chapitreappris> getAllChapitreappris();
	
	public Chapitreappris getById(int id);
	
	public void deleteChapitreappris(int id);
}
