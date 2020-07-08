package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.entity.Module;

public interface ModuleDao 
{
	int create(Module module);
	
	void update(Module module);
	
	void delete(Module module);
	
	Module find(int id);
	
	List<Module> findAll();
}
