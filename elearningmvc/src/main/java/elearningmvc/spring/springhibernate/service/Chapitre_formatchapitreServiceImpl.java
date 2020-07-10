package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.Chapitre_formatchapitreDao;
import elearningmvc.spring.springhibernate.model.Chapitre_formatchapitre;

public class Chapitre_formatchapitreServiceImpl implements Chapitre_formatchapitreService
{
	@Autowired
	private Chapitre_formatchapitreDao chapitre_formatchapitreDao;
 
	public Chapitre_formatchapitreDao getChapitre_formatchapitreDao() 
	{
		return chapitre_formatchapitreDao;
	}
 
	public void setChapitre_formatchapitreDao(Chapitre_formatchapitreDao chapitre_formatchapitreDao) 
	{
		this.chapitre_formatchapitreDao = chapitre_formatchapitreDao;
	}
 
	public void saveChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre) 
	{
		this.chapitre_formatchapitreDao.saveChapitre_formatchapitre(chapitre_formatchapitre);
		
	}
 
	public void updateChapitre_formatchapitre(Chapitre_formatchapitre chapitre_formatchapitre) 
	{
		this.chapitre_formatchapitreDao.updateChapitre_formatchapitre(chapitre_formatchapitre);
		
	}
 
	public List<Chapitre_formatchapitre> getAllChapitre_formatchapitre() 
	{
		return this.chapitre_formatchapitreDao.getAllChapitre_formatchapitre();
	}
 
	public Chapitre_formatchapitre getById(int id) 
	{
		return this.chapitre_formatchapitreDao.getById(id);
	}
 
	public void deleteChapitre_formatchapitre(int id) 
	{
		this.chapitre_formatchapitreDao.deleteChapitre_formatchapitre(id);
	}
}
