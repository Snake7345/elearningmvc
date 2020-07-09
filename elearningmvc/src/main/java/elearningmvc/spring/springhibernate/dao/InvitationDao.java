package elearningmvc.spring.springhibernate.dao;

import java.util.List;

import elearningmvc.spring.springhibernate.model.Invitation;

public interface InvitationDao 
{
	
	public void saveInvitation(Invitation invitation);
	
	public void updateInvitation(Invitation invitation);
	
	public List<Invitation> getAllInvitation();
	
	public Invitation getById(int id);
	
	public void deleteInvitation(int id);
}
