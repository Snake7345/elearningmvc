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
@Table(name="chapitre_formatchapitre")
public class Chapitre_formatchapitre implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idFormatChapitre_Chapitre")
	private int idFormatChapitre_Chapitre;

	//bi-directional many-to-one association to Chapitre
	@ManyToOne
	private Chapitre chapitre;

	//bi-directional many-to-one association to Formatchapitre
	@ManyToOne
	private Formatchapitre formatchapitre;
	
	
	
	@Override
	public String toString() {
		return "Chapitre_formatchapitre [idFormatChapitre_Chapitre=" + idFormatChapitre_Chapitre + ", chapitre="
				+ chapitre + ", formatchapitre=" + formatchapitre + "]";
	}

	/**************************Getter & Setter*******************************************/
	public int getIdFormatChapitre_Chapitre() {
		return this.idFormatChapitre_Chapitre;
	}

	public void setIdFormatChapitre_Chapitre(int idFormatChapitre_Chapitre) {
		this.idFormatChapitre_Chapitre = idFormatChapitre_Chapitre;
	}

	public Chapitre getChapitre() {
		return this.chapitre;
	}

	public void setChapitre(Chapitre chapitre) {
		this.chapitre = chapitre;
	}

	public Formatchapitre getFormatchapitre() {
		return this.formatchapitre;
	}

	public void setFormatchapitre(Formatchapitre formatchapitre) {
		this.formatchapitre = formatchapitre;
	}
	
	


}
