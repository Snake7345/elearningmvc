package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.RoleDao;
import elearningmvc.spring.springhibernate.model.Role;

public class RoleServiceImpl implements RoleService
{
	@Autowired
	private RoleDao roleDao;
 
	public RoleDao getRoleDao() 
	{
		return roleDao;
	}
 
	public void setRoleDao(RoleDao roleDao) 
	{
		this.roleDao = roleDao;
	}
 
	public void saveRole(Role role) 
	{
		this.roleDao.saveRole(role);
		
	}
 
	public void updateRole(Role role) 
	{
		this.roleDao.updateRole(role);
		
	}
 
	public List<Role> getAllRole() 
	{
		return this.roleDao.getAllRole();
	}
 
	public Role getById(int id) 
	{
		return this.roleDao.getById(id);
	}
 
	public void deleteRole(int id) 
	{
		this.roleDao.deleteRole(id);
	}
}
