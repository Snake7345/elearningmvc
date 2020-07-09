package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Utilisateur;

public interface UtilisateurDao 
{
	int create(Utilisateur utilisateur);
	
	void update(Utilisateur utilisateur);
	
	void delete(Utilisateur utilisateur);
	
	Utilisateur find(int id);
	
	List<Utilisateur> findAll();
}
