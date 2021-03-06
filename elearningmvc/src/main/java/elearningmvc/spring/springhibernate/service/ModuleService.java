package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Module;

public interface ModuleService 
{
	public void saveModule(Module module);
	
	public void updateModule(Module module);
	
	public List<Module> getAllModule();
	
	public Module getById(int id);
	
	public void deleteModule(int id);
}
