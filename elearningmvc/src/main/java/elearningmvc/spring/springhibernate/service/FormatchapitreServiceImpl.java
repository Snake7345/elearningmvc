package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.FormatchapitreDao;
import elearningmvc.spring.springhibernate.model.Formatchapitre;

public class FormatchapitreServiceImpl implements FormatchapitreService
{
	@Autowired
	private FormatchapitreDao formatchapitreDao;
 
	public FormatchapitreDao getFormatchapitreDao() 
	{
		return formatchapitreDao;
	}
 
	public void setFormatchapitreDao(FormatchapitreDao formatchapitreDao) 
	{
		this.formatchapitreDao = formatchapitreDao;
	}
 
	public void saveFormatchapitre(Formatchapitre formatchapitre) 
	{
		this.formatchapitreDao.saveFormatchapitre(formatchapitre);
		
	}
 
	public void updateFormatchapitre(Formatchapitre formatchapitre) 
	{
		this.formatchapitreDao.updateFormatchapitre(formatchapitre);
		
	}
 
	public List<Formatchapitre> getAllFormatchapitre() 
	{
		return this.formatchapitreDao.getAllFormatchapitre();
	}
 
	public Formatchapitre getById(int id) 
	{
		return this.formatchapitreDao.getById(id);
	}
 
	public void deleteFormatchapitre(int id) 
	{
		this.formatchapitreDao.deleteFormatchapitre(id);
	}
}
