package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Categoriemodule;

public interface CategoriemoduleService 
{
	public void saveCategoriemodule(Categoriemodule categoriemodule);
	
	public void updateCategoriemodule(Categoriemodule categoriemodule);
	
	public List<Categoriemodule> getAllCategoriemodule();
	
	public Categoriemodule getById(int id);
	
	public void deleteCategoriemodule(int id);
}
