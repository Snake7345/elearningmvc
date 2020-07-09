package elearningmvc.spring.springhibernate.service;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Invitation;

public interface InvitationService 
{
	public void saveInvitation(Invitation invitation);
	
	public void updateInvitation(Invitation invitation);
	
	public List<Invitation> getAllInvitation();
	
	public Invitation getById(int id);
	
	public void deleteInvitation(int id);
}
