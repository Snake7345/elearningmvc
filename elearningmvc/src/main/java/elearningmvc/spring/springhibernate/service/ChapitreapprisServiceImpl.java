package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.ChapitreapprisDao;
import elearningmvc.spring.springhibernate.model.Chapitreappris;

public class ChapitreapprisServiceImpl implements ChapitreapprisService
{
	@Autowired
	private ChapitreapprisDao chapitreapprisDao;
 
	public ChapitreapprisDao getChapitreapprisDao() 
	{
		return chapitreapprisDao;
	}
 
	public void setChapitreapprisDao(ChapitreapprisDao chapitreapprisDao) 
	{
		this.chapitreapprisDao = chapitreapprisDao;
	}
 
	public void saveChapitreappris(Chapitreappris chapitreappris) 
	{
		this.chapitreapprisDao.saveChapitreappris(chapitreappris);
		
	}
 
	public void updateChapitreappris(Chapitreappris chapitreappris) 
	{
		this.chapitreapprisDao.updateChapitreappris(chapitreappris);
		
	}
 
	public List<Chapitreappris> getAllChapitreappris() 
	{
		return this.chapitreapprisDao.getAllChapitreappris();
	}
 
	public Chapitreappris getById(int id) 
	{
		return this.chapitreapprisDao.getById(id);
	}
 
	public void deleteChapitreappris(int id) 
	{
		this.chapitreapprisDao.deleteChapitreappris(id);
	}
}
