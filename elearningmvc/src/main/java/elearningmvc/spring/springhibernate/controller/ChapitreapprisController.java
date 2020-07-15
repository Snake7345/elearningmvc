package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Chapitreappris;
import elearningmvc.spring.springhibernate.service.ChapitreapprisService;

//@Controller
public class ChapitreapprisController 
{
	/*
	ChapitreapprisService chapitreapprisService;
	 
	public ChapitreapprisService getChapitreapprisService() 
	{
		return chapitreapprisService;
	}	

	@Autowired
	public void setChapitreapprisService(ChapitreapprisService chapitreapprisService) {
		this.chapitreapprisService = chapitreapprisService;
	}
	

	@RequestMapping(value = "/chapitreappris", method = RequestMethod.GET)
	public String getAllChapitreappris(Model model) {
		model.addAttribute("chapitreappris", new Chapitreappris());
		model.addAttribute("chapitreapprisList",
		this.chapitreapprisService.getAllChapitreappris());
		return "chapitreappris";
	}
 
	@RequestMapping(value = "/chapitreappris/add", method = RequestMethod.POST)
	public String addChapitreappris(@ModelAttribute("chapitreappris") Chapitreappris chapitreappris) {
		this.chapitreapprisService.saveChapitreappris(chapitreappris);
		return "redirect:/chapitreappris";
	}
 
	@RequestMapping(value = "/chapitreappris/update", method = RequestMethod.POST)
	public String updateChapitreappris(@ModelAttribute("chapitreappris") Chapitreappris chapitreappris) {
		this.chapitreapprisService.updateChapitreappris(chapitreappris);
		return "redirect:/chapitreappris";
	}
 
	@RequestMapping(value = "/deleteChapitreappris/{id}")
	public String removeChapitreappris(@PathVariable("id") int id) {
		this.chapitreapprisService.deleteChapitreappris(id);
		return "redirect:/chapitreappris";
	}
 
	@RequestMapping(value = "/editChapitreappris/{id}")
	public String editChapitreappris(@PathVariable("id") int id, Model model) {
		model.addAttribute("chapitreappris", this.chapitreapprisService.getById(id));
		return "editChapitreappris";
	}
	*/
}
