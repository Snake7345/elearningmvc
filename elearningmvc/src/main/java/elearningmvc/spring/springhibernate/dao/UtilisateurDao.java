package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Utilisateur;

public interface UtilisateurDao 
{
	public void saveUtilisateur(Utilisateur utilisateur);
	
	public void updateUtilisateur(Utilisateur utilisateur);
	
	public List<Utilisateur> getAllUtilisateur();
	
	public Utilisateur getById(int id);
	
	public void deleteUtilisateur(int id);
	
}
