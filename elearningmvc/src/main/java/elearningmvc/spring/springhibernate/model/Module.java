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
@Table(name="module")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idModule")
	private int idModule;
	@Column(name="actif")
	private boolean actif;
	@Column(name="intitule")
	private String intitule;

	/*//bi-directional many-to-one association to Chapitre
	@OneToMany(mappedBy="module")
	private List<Chapitre> chapitres;

	//bi-directional many-to-one association to Invitation
	@OneToMany(mappedBy="module")
	private List<Invitation> invitations;*/

	//bi-directional many-to-one association to Categoriemodule
	@ManyToOne
	private Categoriemodule categoriemodule;

	@Override
	public String toString() {
		return "Module [idModule=" + idModule + ", actif=" + actif + ", intitule=" + intitule + ", categoriemodule=" + categoriemodule + "]";
	}
	
	/**************************Getter & Setter*******************************************/
	
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public Categoriemodule getCategoriemodule() {
		return this.categoriemodule;
	}

	public void setCategoriemodule(Categoriemodule categoriemodule) {
		this.categoriemodule = categoriemodule;
	}

	/*public List<Chapitre> getChapitres() {
		return this.chapitres;
	}

	public void setChapitres(List<Chapitre> chapitres) {
		this.chapitres = chapitres;
	}

	public Chapitre addChapitre(Chapitre chapitre) {
		getChapitres().add(chapitre);
		chapitre.setModule(this);

		return chapitre;
	}

	public Chapitre removeChapitre(Chapitre chapitre) {
		getChapitres().remove(chapitre);
		chapitre.setModule(null);

		return chapitre;
	}*/

	/*public List<Invitation> getInvitations() {
		return this.invitations;
	}

	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Invitation addInvitation(Invitation invitation) {
		getInvitations().add(invitation);
		invitation.setModule(this);

		return invitation;
	}

	public Invitation removeInvitation(Invitation invitation) {
		getInvitations().remove(invitation);
		invitation.setModule(null);

		return invitation;
	}*/





}
