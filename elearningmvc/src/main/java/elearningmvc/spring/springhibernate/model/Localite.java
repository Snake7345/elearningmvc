package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localite")
public class Localite implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idLocalite")
	private int idLocalite;
	@Column(name="CP")
	private int CP;
	@Column(name="ville")
	private String ville;
	/*//bi-directional many-to-one association to Utilisateur
	@OneToMany(mappedBy="localite")
	private List<Utilisateur> utilisateurs;*/

	@Override
	public String toString() {
		return "Localite [idLocalite=" + idLocalite + ", cp=" + CP + ", ville=" + ville + "]";
	}

	/**************************Getter & Setter*******************************************/
	public int getIdLocalite() {
		return idLocalite;
	}

	public void setIdLocalite(int idLocalite) {
		this.idLocalite = idLocalite;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int CP) {
		this.CP = CP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	/*public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	

	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().add(utilisateur);
		utilisateur.setLocalite(this);

		return utilisateur;
	}

	public Utilisateur removeUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().remove(utilisateur);
		utilisateur.setLocalite(null);

		return utilisateur;
	}*/



}
