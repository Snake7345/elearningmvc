package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Chapitre;
import elearningmvc.spring.springhibernate.model.Module;
import elearningmvc.spring.springhibernate.service.ChapitreService;
import elearningmvc.spring.springhibernate.service.ModuleService;


@Controller
public class ChapitreController 
{
	
	ChapitreService chapitreService;
	ModuleService moduleService;
	 
	public ModuleService getModuleService() {
		return moduleService;
	}

	public ChapitreService getChapitreService() 
	{
		return chapitreService;
	}	

	@Autowired
	public void setChapitreService(ChapitreService chapitreService) {
		this.chapitreService = chapitreService;
	}
	
	@Autowired
	public void setModuleService(ModuleService moduleService) {
		this.moduleService = moduleService;
	}
	

	@RequestMapping(value = "/chapitre", method = RequestMethod.GET)
	public String getAllChapitre(Model model) {
		model.addAttribute("chapitre", new Chapitre());
		model.addAttribute("chapitreList",this.chapitreService.getAllChapitre());
		model.addAttribute("module", new Module());
		model.addAttribute("moduleList", this.moduleService.getAllModule());
		return "chapitre";
	}
 
	@RequestMapping(value = "/chapitre/add", method = RequestMethod.POST)
	public String addChapitre(@ModelAttribute("chapitre") Chapitre chapitre) 
	{
		chapitre.setModule(moduleService.getById(chapitre.getModule().getIdModule()));
		this.chapitreService.saveChapitre(chapitre);
		return "redirect:/chapitre";
	}
 
	@RequestMapping(value = "/chapitre/update", method = RequestMethod.POST)
	public String updateChapitre(@ModelAttribute("chapitre") Chapitre chapitre) {
		this.chapitreService.updateChapitre(chapitre);
		return "redirect:/chapitre";
	}
 
	@RequestMapping(value = "/deleteChapitre_formatchapitre/{id}")
	public String removeChapitre_formatchapitre(@PathVariable("id") int id) {
		this.chapitreService.deleteChapitre(id);
		return "redirect:/chapitre";
	}
 
	@RequestMapping(value = "/editChapitre/{id}")
	public String editChapitre(@PathVariable("id") int id, Model model) {
		model.addAttribute("chapitre", this.chapitreService.getById(id));
		return "editChapitre";
	}
	
}
