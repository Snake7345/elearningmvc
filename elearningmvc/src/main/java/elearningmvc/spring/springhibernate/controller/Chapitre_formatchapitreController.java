package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Chapitre_formatchapitre;
import elearningmvc.spring.springhibernate.service.Chapitre_formatchapitreService;

/*@Controller*/
public class Chapitre_formatchapitreController 
{
	/*
	Chapitre_formatchapitreService chapitre_formatchapitreService;
	 
	public Chapitre_formatchapitreService getChapitre_formatchapitreService() 
	{
		return chapitre_formatchapitreService;
	}	

	@Autowired
	public void setChapitre_formatchapitreService(Chapitre_formatchapitreService chapitre_formatchapitreService) {
		this.chapitre_formatchapitreService = chapitre_formatchapitreService;
	}
	

	@RequestMapping(value = "/chapitre_formatchapitre", method = RequestMethod.GET)
	public String getAllChapitre_formatchapitre(Model model) {
		model.addAttribute("chapitre_formatchapitre", new Chapitre_formatchapitre());
		model.addAttribute("chapitre_formatchapitreList",
		this.chapitre_formatchapitreService.getAllChapitre_formatchapitre());
		return "chapitre_formatchapitre";
	}
 
	@RequestMapping(value = "/chapitre_formatchapitre/add", method = RequestMethod.POST)
	public String addChapitre_formatchapitre(@ModelAttribute("chapitre_formatchapitre") Chapitre_formatchapitre chapitre_formatchapitre) {
		this.chapitre_formatchapitreService.saveChapitre_formatchapitre(chapitre_formatchapitre);
		return "redirect:/chapitre_formatchapitre";
	}
 
	@RequestMapping(value = "/chapitre_formatchapitre/update", method = RequestMethod.POST)
	public String updateChapitre_formatchapitre(@ModelAttribute("chapitre_formatchapitre") Chapitre_formatchapitre chapitre_formatchapitre) {
		this.chapitre_formatchapitreService.updateChapitre_formatchapitre(chapitre_formatchapitre);
		return "redirect:/chapitre_formatchapitre";
	}
 
	@RequestMapping(value = "/deleteChapitre_formatchapitre/{id}")
	public String removeChapitre_formatchapitre(@PathVariable("id") int id) {
		this.chapitre_formatchapitreService.deleteChapitre_formatchapitre(id);
		return "redirect:/chapitre_formatchapitre";
	}
 
	@RequestMapping(value = "/editChapitre_formatchapitre/{id}")
	public String editChapitre_formatchapitre(@PathVariable("id") int id, Model model) {
		model.addAttribute("chapitre_formatchapitre", this.chapitre_formatchapitreService.getById(id));
		return "chapitre_formatchapitreedit";
	}
	*/
}
