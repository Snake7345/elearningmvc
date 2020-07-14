package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import elearningmvc.spring.springhibernate.model.Categoriemodule;
import elearningmvc.spring.springhibernate.service.CategoriemoduleService;

//@Controller
public class CategoriemoduleController 
{
	/*
	CategoriemoduleService categoriemoduleService;
	 
	public CategoriemoduleService getCategoriemoduleService() 
	{
		return categoriemoduleService;
	}
	

	@Autowired
	public void setCategoriemoduleService(CategoriemoduleService categoriemoduleService) {
		this.categoriemoduleService = categoriemoduleService;
	}
	

	@RequestMapping(value = "/categoriemodule", method = RequestMethod.GET)
	public String getAllCategoriemodule(Model model) {
		model.addAttribute("categoriemodule", new Categoriemodule());
		model.addAttribute("categoriemoduleList",
		this.categoriemoduleService.getAllCategoriemodule());
		return "categoriemodule";
	}
 
	@RequestMapping(value = "/categoriemodule/add", method = RequestMethod.POST)
	public String addCategoriemodule(@ModelAttribute("categoriemodule") Categoriemodule categoriemodule) {
		this.categoriemoduleService.saveCategoriemodule(categoriemodule);
		return "redirect:/categoriemodule";
	}
 
	@RequestMapping(value = "/categoriemodule/update", method = RequestMethod.POST)
	public String updateCategoriemodule(@ModelAttribute("categoriemodule") Categoriemodule categoriemodule) {
		this.categoriemoduleService.updateCategoriemodule(categoriemodule);
		return "redirect:/categoriemodule";
	}
 
	@RequestMapping(value = "/deleteCategoriemodule/{id}")
	public String removeCategoriemodule(@PathVariable("id") int id) {
		this.categoriemoduleService.deleteCategoriemodule(id);
		return "redirect:/categoriemodule";
	}
 
	@RequestMapping(value = "/editCategoriemodule/{id}")
	public String editCategoriemodule(@PathVariable("id") int id, Model model) {
		model.addAttribute("categoriemodule", this.categoriemoduleService.getById(id));
		return "categoriemoduleedit";
	}
	*/
}
