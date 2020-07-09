package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="invitation")
public class Invitation implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idInvitation")
	private int idInvitation;
	@Column(name="invite")
	private boolean invite;

	//bi-directional many-to-one association to Module
	@ManyToOne
	private Module module;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	private Utilisateur utilisateur;
	
	
	
	@Override
	public String toString() {
		return "Invitation [idInvitation=" + idInvitation + ", invite=" + invite + ", module=" + module
				+ ", utilisateur=" + utilisateur + "]";
	}

	/**************************Getter & Setter*******************************************/
	
	public int getIdInvitation() {
		return this.idInvitation;
	}

	public void setIdInvitation(int idInvitation) {
		this.idInvitation = idInvitation;
	}

	public boolean getInvite() {
		return this.invite;
	}

	public void setInvite(boolean invite) {
		this.invite = invite;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
