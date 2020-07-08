package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.entity.Invitation;

public interface InvitationDao 
{
	int create(Invitation invitation);
	
	void update(Invitation invitation);
	
	void delete(Invitation invitation);
	
	Invitation find(int id);
	
	List<Invitation> findAll();
}
