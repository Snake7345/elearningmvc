package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.LocaliteDao;
import elearningmvc.spring.springhibernate.model.Localite;

public class LocaliteServiceImpl implements LocaliteService
{
	@Autowired
	private LocaliteDao localiteDao;
 
	public LocaliteDao getLocaliteDao() 
	{
		return localiteDao;
	}
 
	public void setLocaliteDao(LocaliteDao localiteDao) 
	{
		this.localiteDao = localiteDao;
	}
 
	public void saveLocalite(Localite localite) 
	{
		this.localiteDao.saveLocalite(localite);
		
	}
 
	public void updateLocalite(Localite localite) 
	{
		this.localiteDao.updateLocalite(localite);
		
	}
 
	public List<Localite> getAllLocalite() 
	{
		return this.localiteDao.getAllLocalite();
	}
 
	public Localite getById(int id) 
	{
		return this.localiteDao.getById(id);
	}
 
	public void deleteLocalite(int id) 
	{
		this.localiteDao.deleteLocalite(id);
	}
}
