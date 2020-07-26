package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="formatchapitre")
public class Formatchapitre implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idChapitreAppris")
	private int idFormatChapitre;
	@Column(name="typeFormat")
	private String typeFormat;

	/*//bi-directional many-to-one association to ChapitreFormatchapitre
	@OneToMany(mappedBy="formatchapitre")
	private List<Chapitre_formatchapitre> chapitreFormatchapitres;
	*/

	@Override
	public String toString() {
		return "Formatchapitre [idFormatChapitre=" + idFormatChapitre + ", typeFormat=" + typeFormat
				 + "]";
	}
	
	/**************************Getter & Setter*******************************************/

	public int getIdFormatChapitre() {
		return idFormatChapitre;
	}

	public void setIdFormatChapitre(int idFormatChapitre) {
		this.idFormatChapitre = idFormatChapitre;
	}

	public String getTypeFormat() {
		return typeFormat;
	}

	public void setTypeFormat(String typeFormat) {
		this.typeFormat = typeFormat;
	}

	/*public List<Chapitre_formatchapitre> getChapitreFormatchapitres() {
		return chapitreFormatchapitres;
	}

	public void setChapitreFormatchapitres(List<Chapitre_formatchapitre> chapitreFormatchapitres) {
		this.chapitreFormatchapitres = chapitreFormatchapitres;
	}


	public Chapitre_formatchapitre addChapitreFormatchapitre(Chapitre_formatchapitre chapitreFormatchapitre) {
		getChapitreFormatchapitres().add(chapitreFormatchapitre);
		chapitreFormatchapitre.setFormatchapitre(this);

		return chapitreFormatchapitre;
	}

	public Chapitre_formatchapitre removeChapitreFormatchapitre(Chapitre_formatchapitre chapitreFormatchapitre) {
		getChapitreFormatchapitres().remove(chapitreFormatchapitre);
		chapitreFormatchapitre.setFormatchapitre(null);

		return chapitreFormatchapitre;
	}*/

}
