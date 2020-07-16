package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import elearningmvc.spring.springhibernate.dao.LocaliteDao;
import elearningmvc.spring.springhibernate.dao.LocaliteDaoImpl;
import elearningmvc.spring.springhibernate.model.Localite;
import elearningmvc.spring.springhibernate.model.Utilisateur;
import elearningmvc.spring.springhibernate.service.UtilisateurService;
import elearningmvc.spring.springhibernate.service.LocaliteService;

@Controller
public class UtilisateurController 
{
	
	UtilisateurService utilisateurService;
	 
	public UtilisateurService getUtilisateurService() 
	{
		return utilisateurService;
	}	

	@Autowired
	public void setUtilisateurService(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}

	@RequestMapping(value = "/utilisateur", method = RequestMethod.GET)
	public String getAllUtilisateur(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		model.addAttribute("utilisateurList",
		this.utilisateurService.getAllUtilisateur());
		System.out.print(this.utilisateurService.getAllUtilisateur().get(0));
		return "utilisateur";
	}
 
	@RequestMapping(value = "/utilisateur/add", method = RequestMethod.POST)
	public String addUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
		/*Model test1 = new Model();
		String ville = req.getParameter("ville");
		List<Localite> test =  test1.getLocaliteService().getAllLocalite();
		System.out.println("kekette:");
		System.out.println(test.get(0).getVille());*/
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
