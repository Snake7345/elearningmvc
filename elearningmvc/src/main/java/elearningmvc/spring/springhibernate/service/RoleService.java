package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Role;

public interface RoleService 
{
	public void saveRole(Role role);
	
	public void updateRole(Role role);
	
	public List<Role> getAllRole();
	
	public Role getById(int id);
	
	public void deleteRole(int id);
}
