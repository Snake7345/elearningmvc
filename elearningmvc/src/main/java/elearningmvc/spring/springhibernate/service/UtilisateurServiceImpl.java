package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.UtilisateurDao;
import elearningmvc.spring.springhibernate.model.Utilisateur;

public class UtilisateurServiceImpl implements UtilisateurService
{
	@Autowired
	private UtilisateurDao utilisateurDao;
 
	public UtilisateurDao getUtilisateurDao() 
	{
		return utilisateurDao;
	}
 
	public void setUtilisateurDao(UtilisateurDao utilisateurDao) 
	{
		this.utilisateurDao = utilisateurDao;
	}
 
	public void saveUtilisateur(Utilisateur utilisateur) 
	{
		this.utilisateurDao.saveUtilisateur(utilisateur);
		
	}
 
	public void updateUtilisateur(Utilisateur utilisateur) 
	{
		this.utilisateurDao.updateUtilisateur(utilisateur);
		
	}
 
	public List<Utilisateur> getAllUtilisateur() 
	{
		return this.utilisateurDao.getAllUtilisateur();
	}
 
	public Utilisateur getById(int id) 
	{
		return this.utilisateurDao.getById(id);
	}
 
	public void deleteUtilisateur(int id) 
	{
		this.utilisateurDao.deleteUtilisateur(id);
	}
}
