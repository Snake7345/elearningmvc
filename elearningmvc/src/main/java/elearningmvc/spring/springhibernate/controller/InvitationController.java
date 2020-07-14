package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Invitation;
import elearningmvc.spring.springhibernate.service.InvitationService;

@Controller
public class InvitationController 
{
	InvitationService invitationService;
	 
	public InvitationService getInvitationService() 
	{
		return invitationService;
	}	

	@Autowired
	public void setInvitationService(InvitationService invitationService) {
		this.invitationService = invitationService;
	}
	

	@RequestMapping(value = "/invitation", method = RequestMethod.GET)
	public String getAllInvitation(Model model) {
		model.addAttribute("invitation", new Invitation());
		model.addAttribute("invitationList",
		this.invitationService.getAllInvitation());
		return "invitation";
	}
 
	@RequestMapping(value = "/invitation/add", method = RequestMethod.POST)
	public String addInvitation(@ModelAttribute("invitation") Invitation invitation) {
		this.invitationService.saveInvitation(invitation);
		return "redirect:/invitation";
	}
 
	@RequestMapping(value = "/invitation/update", method = RequestMethod.POST)
	public String updateInvitation(@ModelAttribute("invitation") Invitation invitation) {
		this.invitationService.updateInvitation(invitation);
		return "redirect:/invitation";
	}
 
	@RequestMapping(value = "/deleteInvitation/{id}")
	public String removeInvitation(@PathVariable("id") int id) {
		this.invitationService.deleteInvitation(id);
		return "redirect:/invitation";
	}
 
	@RequestMapping(value = "/editInvitation/{id}")
	public String editInvitation(@PathVariable("id") int id, Model model) {
		model.addAttribute("invitation", this.invitationService.getById(id));
		return "invitationedit";
	}
}
