package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Categoriemodule;
import elearningmvc.spring.springhibernate.model.Localite;
import elearningmvc.spring.springhibernate.model.Module;
import elearningmvc.spring.springhibernate.service.CategoriemoduleService;
import elearningmvc.spring.springhibernate.service.ModuleService;

@Controller
public class ModuleController 
{
	
	ModuleService moduleService;
	CategoriemoduleService categoriemoduleService;
	 
	public CategoriemoduleService getCategoriemoduleService() {
		return categoriemoduleService;
	}

	public ModuleService getModuleService() 
	{
		return moduleService;
	}	

	@Autowired
	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}
	@Autowired
	public void setCategoriemoduleService(CategoriemoduleService categoriemoduleService) {
		this.categoriemoduleService = categoriemoduleService;
	}
	

	@RequestMapping(value = "/module", method = RequestMethod.GET)
	public String getAllModule(Model model) {
		model.addAttribute("module", new Module());
		model.addAttribute("moduleList", this.moduleService.getAllModule());
		model.addAttribute("categoriemodule", new Categoriemodule());
		model.addAttribute("categoriemoduleList", this.categoriemoduleService.getAllCategoriemodule());
		return "module";
	}
 
	@RequestMapping(value = "/module/add", method = RequestMethod.POST)
	public String addModule(@ModelAttribute("module") Module module) {
		module.setCategoriemodule(categoriemoduleService.getById(module.getCategoriemodule().getIdCatModule()));
		this.moduleService.saveModule(module);
		return "redirect:/module";
	}
 
	@RequestMapping(value = "/module/update", method = RequestMethod.POST)
	public String updateModule(@ModelAttribute("module") Module module) {
		this.moduleService.updateModule(module);
		return "redirect:/module";
	}
 
	@RequestMapping(value = "/deleteModule/{id}")
	public String removeModule(@PathVariable("id") int id) {
		this.moduleService.deleteModule(id);
		return "redirect:/module";
	}
 
	@RequestMapping(value = "/editModule/{id}")
	public String editModule(@PathVariable("id") int id, Model model) {
		model.addAttribute("module", this.moduleService.getById(id));
		return "editModule";
	}
	
}
