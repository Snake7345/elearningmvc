package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Formatchapitre;
import elearningmvc.spring.springhibernate.service.FormatchapitreService;

@Controller
public class FormatchapitreController 
{
	FormatchapitreService formatchapitreService;
	 
	public FormatchapitreService getFormatchapitreService() 
	{
		return formatchapitreService;
	}	

	@Autowired
	public void setFormatchapitreService(FormatchapitreService formatchapitreService) {
		this.formatchapitreService = formatchapitreService;
	}
	

	@RequestMapping(value = "/formatchapitre", method = RequestMethod.GET)
	public String getAllFormatchapitre(Model model) {
		model.addAttribute("formatchapitre", new Formatchapitre());
		model.addAttribute("formatchapitreList",
		this.formatchapitreService.getAllFormatchapitre());
		return "formatchapitre";
	}
 
	@RequestMapping(value = "/formatchapitre/add", method = RequestMethod.POST)
	public String addFormatchapitre(@ModelAttribute("formatchapitre") Formatchapitre formatchapitre) {
		this.formatchapitreService.saveFormatchapitre(formatchapitre);
		return "redirect:/formatchapitre";
	}
 
	@RequestMapping(value = "/formatchapitre/update", method = RequestMethod.POST)
	public String updateFormatchapitre(@ModelAttribute("formatchapitre") Formatchapitre formatchapitre) {
		this.formatchapitreService.updateFormatchapitre(formatchapitre);
		return "redirect:/formatchapitre";
	}
 
	@RequestMapping(value = "/deleteFormatchapitre/{id}")
	public String removeChapitre_formatchapitre(@PathVariable("id") int id) {
		this.formatchapitreService.deleteFormatchapitre(id);
		return "redirect:/formatchapitre";
	}
 
	@RequestMapping(value = "/editFormatchapitre/{id}")
	public String editFormatchapitre(@PathVariable("id") int id, Model model) {
		model.addAttribute("formatchapitre", this.formatchapitreService.getById(id));
		return "editFormatchapitre";
	}
}
