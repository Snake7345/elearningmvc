package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Localite;
import elearningmvc.spring.springhibernate.model.Role;
import elearningmvc.spring.springhibernate.model.Utilisateur;
import elearningmvc.spring.springhibernate.service.UtilisateurService;
import elearningmvc.spring.springhibernate.service.LocaliteService;
import elearningmvc.spring.springhibernate.service.RoleService;

@Controller
public class UtilisateurController 
{
	
	UtilisateurService utilisateurService;
	LocaliteService localiteService;
	RoleService roleService;

	public UtilisateurService getUtilisateurService() 
	{
		return utilisateurService;
	}	
	
	public LocaliteService getLocaliteService() 
	{
		return localiteService;
	}
	
	public RoleService getRoleService() {
		return roleService;
	}

	@Autowired
	public void setUtilisateurService(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	@Autowired
	public void setLocaliteService(LocaliteService localiteService) {
		this.localiteService = localiteService;
	}
	@Autowired
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	

	@RequestMapping(value = "/utilisateur", method = RequestMethod.GET)
	public String getAllUtilisateur(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		model.addAttribute("utilisateurList", this.utilisateurService.getAllUtilisateur());
		model.addAttribute("localite", new Localite());
		model.addAttribute("localiteList", this.localiteService.getAllLocalite());
		model.addAttribute("role", new Role());
		model.addAttribute("roleList", this.roleService.getAllRole());
		return "utilisateur";
	}
 
	@RequestMapping(value = "/utilisateur/add", method = RequestMethod.POST)
	public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
		utilisateur.setLocalite(localiteService.getById(utilisateur.getLocalite().getIdLocalite()));
		utilisateur.setRole(roleService.getById(utilisateur.getRole().getIdRole()));
		System.out.println("affiche : ");
		System.out.println(utilisateur);
		this.utilisateurService.saveUtilisateur(utilisateur);
		return "redirect:/utilisateur";
	}
 
	@RequestMapping(value = "/utilisateur/update", method = RequestMethod.POST)
	public String updateUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
		this.utilisateurService.updateUtilisateur(utilisateur);
		return "redirect:/utilisateur";
	}
 
	@RequestMapping(value = "/deleteUtilisateur/{id}")
	public String removeUtilisateur(@PathVariable("id") int id) {
		this.utilisateurService.deleteUtilisateur(id);
		return "redirect:/utilisateur";
	}
 
	@RequestMapping(value = "/editUtilisateur/{id}")
	public String editUtilisateur(@PathVariable("id") int id, Model model) {
		model.addAttribute("utilisateur", this.utilisateurService.getById(id));

		
		return "editUtilisateur";
	}
	
}
