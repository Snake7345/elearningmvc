package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.CategoriemoduleDao;
import elearningmvc.spring.springhibernate.model.Categoriemodule;

public class CategoriemoduleServiceImpl implements CategoriemoduleService
{
	@Autowired
	private CategoriemoduleDao categoriemoduleDao;
 
	public CategoriemoduleDao getCategoriemoduleDao() 
	{
		return categoriemoduleDao;
	}
 
	public void setCategoriemoduleDao(CategoriemoduleDao categoriemoduleDao) 
	{
		this.categoriemoduleDao = categoriemoduleDao;
	}
 
	public void saveCategoriemodule(Categoriemodule categoriemodule) 
	{
		this.categoriemoduleDao.saveCategoriemodule(categoriemodule);
		
	}
 
	public void updateCategoriemodule(Categoriemodule categoriemodule) 
	{
		this.categoriemoduleDao.updateCategoriemodule(categoriemodule);
		
	}
 
	public List<Categoriemodule> getAllCategoriemodule() 
	{
		return this.categoriemoduleDao.getAllCategoriemodule();
	}
 
	public Categoriemodule getById(int id) 
	{
		return this.categoriemoduleDao.getById(id);
	}
 
	public void deleteCategoriemodule(int id) 
	{
		this.categoriemoduleDao.deleteCategoriemodule(id);
	}
	
}
