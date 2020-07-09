package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Localite;

public interface LocaliteService 
{
	public void saveLocalite(Localite localite);
	
	public void updateLocalite(Localite localite);
	
	public List<Localite> getAllLocalite();
	
	public Localite getById(int id);
	
	public void deleteLocalite(int id);
}
