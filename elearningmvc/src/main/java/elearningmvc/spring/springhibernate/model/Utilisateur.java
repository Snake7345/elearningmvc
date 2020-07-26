package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUtilisateur;

	private boolean actif;

	private String adresse;

	private String email;

	private String login;

	private String mobile;

	private String nom;

	private String password;

	private String prenom;

	private String profession;

	//bi-directional many-to-one association to Chapitreappri
	/*@OneToMany(mappedBy="utilisateur")
	private List<Chapitreappris> chapitreappris;

	//bi-directional many-to-one association to Invitation
	@OneToMany(mappedBy="utilisateur")
	private List<Invitation> invitations;*/

	//bi-directional many-to-one association to Localite
	@ManyToOne
	private Localite localite;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", actif=" + actif + ", adresse=" + adresse + ", email="
				+ email + ", login=" + login + ", mobile=" + mobile + ", nom=" + nom + ", password=" + password
				+ ", prenom=" + prenom + ", profession=" + profession + ", chapitreappris=" 
				+ ", invitations="  + ", localite=" + localite + ", role=" + role + "]";
	}
	
	/**************************Getter & Setter*******************************************/

	public Utilisateur() {
	}

	public int getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public boolean getActif() {
		return this.actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public Localite getLocalite() {
		return this.localite;
	}

	public void setLocalite(Localite localite) {
		this.localite = localite;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	/*
	public List<Chapitreappris> getChapitreappris() {
		return this.chapitreappris;
	}

	public void setChapitreappris(List<Chapitreappris> chapitreappris) {
		this.chapitreappris = chapitreappris;
	}

	public Chapitreappris addChapitreappris(Chapitreappris chapitreappris) {
		getChapitreappris().add(chapitreappris);
		chapitreappris.setUtilisateur(this);

		return chapitreappris;
	}

	public Chapitreappris removeChapitreappri(Chapitreappris chapitreappris) {
		getChapitreappris().remove(chapitreappris);
		chapitreappris.setUtilisateur(null);

		return chapitreappris;
	}

	public List<Invitation> getInvitations() {
		return this.invitations;
	}

	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Invitation addInvitation(Invitation invitation) {
		getInvitations().add(invitation);
		invitation.setUtilisateur(this);

		return invitation;
	}

	public Invitation removeInvitation(Invitation invitation) {
		getInvitations().remove(invitation);
		invitation.setUtilisateur(null);

		return invitation;
	}*/




}
