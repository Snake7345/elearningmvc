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
@Table(name="chapitreappris")
public class Chapitreappris implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idChapitreAppris")
	private int idChapitreAppris;
	@Column(name="chapitreappris")
	private boolean chapitreAppris;

	//bi-directional many-to-one association to Chapitre
	@ManyToOne
	private Chapitre chapitre;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	private Utilisateur utilisateur;

	@Override
	public String toString() {
		return "Chapitreappris [idChapitreAppris=" + idChapitreAppris + ", chapitreAppris=" + chapitreAppris
				+ ", chapitre=" + chapitre + ", utilisateur=" + utilisateur + "]";
	}

	
	/**************************Getter & Setter*******************************************/
	

	public int getIdChapitreAppris() {
		return idChapitreAppris;
	}

	public void setIdChapitreAppris(int idChapitreAppris) {
		this.idChapitreAppris = idChapitreAppris;
	}

	public boolean isChapitreAppris() {
		return chapitreAppris;
	}

	public void setChapitreAppris(boolean chapitreAppris) {
		this.chapitreAppris = chapitreAppris;
	}

	public Chapitre getChapitre() {
		return chapitre;
	}

	public void setChapitre(Chapitre chapitre) {
		this.chapitre = chapitre;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
