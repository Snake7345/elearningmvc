package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Role;

public interface RoleDao 
{
	public void saveRole(Role role);
	
	public void updateRole(Role role);
	
	public List<Role> getAllRole();
	
	public Role getById(int id);
	
	public void deleteRole(int id);
}
