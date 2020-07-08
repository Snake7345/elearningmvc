package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.entity.Role;

public interface RoleDao 
{
	int create(Role role);
	
	void update(Role role);
	
	void delete(Role role);
	
	Role find(int id);
	
	List<Role> findAll();
}
