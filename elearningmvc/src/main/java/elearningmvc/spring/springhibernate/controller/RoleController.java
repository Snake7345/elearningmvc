package elearningmvc.spring.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import elearningmvc.spring.springhibernate.model.Role;
import elearningmvc.spring.springhibernate.service.RoleService;

@Controller
public class RoleController 
{
	RoleService roleService;
	 
	public RoleService getRoleService() 
	{
		return roleService;
	}	

	@Autowired
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	

	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public String getAllRole(Model model) {
		model.addAttribute("role", new Role());
		model.addAttribute("roleList",
		this.roleService.getAllRole());
		return "role";
	}
 
	@RequestMapping(value = "/role/add", method = RequestMethod.POST)
	public String addRole(@ModelAttribute("role") Role role) {
		this.roleService.saveRole(role);
		return "redirect:/role";
	}
 
	@RequestMapping(value = "/role/update", method = RequestMethod.POST)
	public String updateRole(@ModelAttribute("role") Role role) {
		this.roleService.updateRole(role);
		return "redirect:/role";
	}
 
	@RequestMapping(value = "/deleteRole/{id}")
	public String removeRole(@PathVariable("id") int id) {
		this.roleService.deleteRole(id);
		return "redirect:/role";
	}
 
	@RequestMapping(value = "/editRole/{id}")
	public String editRole(@PathVariable("id") int id, Model model) {
		model.addAttribute("role", this.roleService.getById(id));
		return "roleedit";
	}
}
