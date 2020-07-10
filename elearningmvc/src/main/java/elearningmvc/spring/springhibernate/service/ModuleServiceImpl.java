package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.ModuleDao;
import elearningmvc.spring.springhibernate.model.Module;

public class ModuleServiceImpl implements ModuleService
{
	@Autowired
	private ModuleDao moduleDao;
 
	public ModuleDao getModuleDao() 
	{
		return moduleDao;
	}
 
	public void setModuleDao(ModuleDao moduleDao) 
	{
		this.moduleDao = moduleDao;
	}
 
	public void saveModule(Module module) 
	{
		this.moduleDao.saveModule(module);
		
	}
 
	public void updateModule(Module module) 
	{
		this.moduleDao.updateModule(module);
		
	}
 
	public List<Module> getAllModule() 
	{
		return this.moduleDao.getAllModule();
	}
 
	public Module getById(int id) 
	{
		return this.moduleDao.getById(id);
	}
 
	public void deleteModule(int id) 
	{
		this.moduleDao.deleteModule(id);
	}
}
