package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Categoriemodule;

public interface CategoriemoduleDao 
{
	int create(Categoriemodule categoriemodule);
	
	void update(Categoriemodule categoriemodule);
	
	void delete(Categoriemodule categoriemodule);
	
	Categoriemodule find(int id);
	
	List<Categoriemodule> findAll();
}
