package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.ChapitreDao;
import elearningmvc.spring.springhibernate.model.Chapitre;

public class ChapitreServiceImpl implements ChapitreService
{
	@Autowired
	private ChapitreDao chapitreDao;
 
	public ChapitreDao getChapitreDao() 
	{
		return chapitreDao;
	}
 
	public void setChapitreDao(ChapitreDao chapitreDao) 
	{
		this.chapitreDao = chapitreDao;
	}
 
	public void saveChapitre(Chapitre chapitre) 
	{
		this.chapitreDao.saveChapitre(chapitre);
		
	}
 
	public void updateChapitre(Chapitre chapitre) 
	{
		this.chapitreDao.updateChapitre(chapitre);
		
	}
 
	public List<Chapitre> getAllChapitre() 
	{
		return this.chapitreDao.getAllChapitre();
	}
 
	public Chapitre getById(int id) 
	{
		return this.chapitreDao.getById(id);
	}
 
	public void deleteChapitre(int id) 
	{
		this.chapitreDao.deleteChapitre(id);
	}
}
