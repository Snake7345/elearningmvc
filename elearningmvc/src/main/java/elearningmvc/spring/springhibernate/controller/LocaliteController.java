package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import elearningmvc.spring.springhibernate.model.Localite;
import elearningmvc.spring.springhibernate.service.LocaliteService;

@Controller
public class LocaliteController 
{
	LocaliteService localiteService;
	 
	public LocaliteService getLocaliteService() {
		return localiteService;
	}
 
	@Autowired
	public void setLocaliteService(LocaliteService localiteService) {
		this.localiteService = localiteService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllLocalite(Model model) {
		model.addAttribute("localite", new Localite());
		model.addAttribute("localiteList",
				this.localiteService.getAllLocalite());
		return "localite";
	}
 
	@RequestMapping(value = "/localite", method = RequestMethod.GET)
	public String getAllLocalite1(Model model) {
		model.addAttribute("localite", new Localite());
		model.addAttribute("localiteList",
		this.localiteService.getAllLocalite());
		return "localite";
	}
 
	@RequestMapping(value = "/localite/add", method = RequestMethod.POST)
	public String addLocalite(@ModelAttribute("localite") Localite localite) {
		this.localiteService.saveLocalite(localite);
		return "redirect:/localite";
	}
 
	@RequestMapping(value = "/localite/update", method = RequestMethod.POST)
	public String updateLocalite(@ModelAttribute("localite") Localite localite) {
		this.localiteService.updateLocalite(localite);
		return "redirect:/localite";
	}
 
	@RequestMapping(value = "/deleteLocalite/{id}")
	public String removeLocalite(@PathVariable("id") int id) {
		this.localiteService.deleteLocalite(id);
		return "redirect:/localite";
	}
 
	@RequestMapping(value = "/editLocalite/{id}")
	public String editLocalite(@PathVariable("id") int id, Model model) {
		model.addAttribute("localite", this.localiteService.getById(id));
		return "edit";
	}
}
