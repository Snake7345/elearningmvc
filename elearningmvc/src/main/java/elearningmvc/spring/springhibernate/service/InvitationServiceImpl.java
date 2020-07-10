package elearningmvc.spring.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import elearningmvc.spring.springhibernate.dao.InvitationDao;
import elearningmvc.spring.springhibernate.model.Invitation;

public class InvitationServiceImpl implements InvitationService
{
	@Autowired
	private InvitationDao invitationDao;
 
	public InvitationDao getInvitationDao() 
	{
		return invitationDao;
	}
 
	public void setInvitationDao(InvitationDao invitationDao) 
	{
		this.invitationDao = invitationDao;
	}
 
	public void saveInvitation(Invitation invitation) 
	{
		this.invitationDao.saveInvitation(invitation);
		
	}
 
	public void updateInvitation(Invitation invitation) 
	{
		this.invitationDao.updateInvitation(invitation);
		
	}
 
	public List<Invitation> getAllInvitation() 
	{
		return this.invitationDao.getAllInvitation();
	}
 
	public Invitation getById(int id) 
	{
		return this.invitationDao.getById(id);
	}
 
	public void deleteInvitation(int id) 
	{
		this.invitationDao.deleteInvitation(id);
	}
}
