package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Chapitre;
import elearningmvc.spring.springhibernate.model.Chapitreappris;
import elearningmvc.spring.springhibernate.model.Module;
import elearningmvc.spring.springhibernate.model.Utilisateur;
import elearningmvc.spring.springhibernate.service.ChapitreService;
import elearningmvc.spring.springhibernate.service.ChapitreapprisService;
import elearningmvc.spring.springhibernate.service.UtilisateurService;

//@Controller
public class ChapitreapprisController 
{
	/*
	ChapitreapprisService chapitreapprisService;
	UtilisateurService utilisateurService;
	ChapitreService chapitreService;
	 
	public ChapitreService getChapitreService() {
		return chapitreService;
	}

	public UtilisateurService getUtilisateurService() {
		return utilisateurService;
	}

	public ChapitreapprisService getChapitreapprisService() 
	{
		return chapitreapprisService;
	}	
	@Autowired
	public void setChapitreService(ChapitreService chapitreService) {
		this.chapitreService = chapitreService;
	}

	@Autowired
	public void setChapitreapprisService(ChapitreapprisService chapitreapprisService) {
		this.chapitreapprisService = chapitreapprisService;
	}
	@Autowired
	public void setUtilisateurService(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	

	@RequestMapping(value = "/chapitreappris", method = RequestMethod.GET)
	public String getAllChapitreappris(Model model) {
		model.addAttribute("chapitreappris", new Chapitreappris());
		model.addAttribute("chapitreapprisList",this.chapitreapprisService.getAllChapitreappris());
		model.addAttribute("utilisateur", new Utilisateur());
		model.addAttribute("utilisateurList", this.utilisateurService.getAllUtilisateur());
		model.addAttribute("chapitre", new Chapitre());
		model.addAttribute("chapitreList", this.chapitreService.getAllChapitre());
		return "chapitreappris";
	}
 
	@RequestMapping(value = "/chapitreappris/add", method = RequestMethod.POST)
	public String addChapitreappris(@ModelAttribute("chapitreappris") Chapitreappris chapitreappris) {
		chapitreappris.setUtilisateur(utilisateurService.getById(chapitreappris.getUtilisateur().getIdUtilisateur()));
		chapitreappris.setChapitre(chapitreService.getById(chapitreappris.getChapitre().getIdChapitre()));
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
