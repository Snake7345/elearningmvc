package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Utilisateur;

public interface UtilisateurService 
{
	public void saveUtilisateur(Utilisateur utilisateur);
	
	public void updateUtilisateur(Utilisateur utilisateur);
	
	public List<Utilisateur> getAllUtilisateur();
	
	public Utilisateur getById(int id);
	
	public void deleteUtilisateur(int id);
}
