package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chapitre")
public class Chapitre implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idChapitre")
	private int idChapitre;
	@Column(name="cotation")
	private int cotation;
	@Column(name="emplacement")
	private String emplacement;
	@Column(name="intitule")
	private String intitule;
	@Column(name="quizz")
	private boolean quizz;

	//bi-directional many-to-one association to Module
	@ManyToOne
	private Module module;

	/*//bi-directional many-to-one association to ChapitreFormatchapitre
	@OneToMany(mappedBy="chapitre")
	private List<Chapitre_formatchapitre> chapitreFormatchapitres;

	//bi-directional many-to-one association to Chapitreappri
	@OneToMany(mappedBy="chapitre")
	private List<Chapitreappris> chapitreappris;*/

	
	
	@Override
	public String toString() {
		return "Chapitre [idChapitre=" + idChapitre + ", cotation=" + cotation + ", emplacement=" + emplacement
				+ ", intitule=" + intitule + ", quizz=" + quizz + ", module=" + module + "]";
	}

	/**************************Getter & Setter*******************************************/
	

	public int getIdChapitre() {
		return idChapitre;
	}

	public void setIdChapitre(int idChapitre) {
		this.idChapitre = idChapitre;
	}

	public int getCotation() {
		return cotation;
	}

	public void setCotation(int cotation) {
		this.cotation = cotation;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public boolean isQuizz() {
		return quizz;
	}

	public void setQuizz(boolean quizz) {
		this.quizz = quizz;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	/*public List<Chapitre_formatchapitre> getChapitreFormatchapitres() {
		return chapitreFormatchapitres;
	}

	public void setChapitreFormatchapitres(List<Chapitre_formatchapitre> chapitreFormatchapitres) {
		this.chapitreFormatchapitres = chapitreFormatchapitres;
	}

	public List<Chapitreappris> getChapitreappris() {
		return chapitreappris;
	}

	public void setChapitreappris(List<Chapitreappris> chapitreappris) {
		this.chapitreappris = chapitreappris;
	}


	public Chapitreappris addChapitreappris(Chapitreappris chapitreappris) {
		getChapitreappris().add(chapitreappris);
		chapitreappris.setChapitre(this);

		return chapitreappris;
	}

	public Chapitreappris removeChapitreappri(Chapitreappris chapitreappris) {
		getChapitreappris().remove(chapitreappris);
		chapitreappris.setChapitre(null);

		return chapitreappris;
	}*/


}
