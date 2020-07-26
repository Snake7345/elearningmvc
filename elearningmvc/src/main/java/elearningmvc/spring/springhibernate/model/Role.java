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
@Table(name="Role")
public class Role implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idRole")
	private int idRole;
	@Column(name="denomination")
	private String denomination;

	//bi-directional many-to-one association to Utilisateur
	/*@OneToMany(mappedBy="role")
	private List<Utilisateur> utilisateurs;*/

	
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", denomination=" + denomination + "]";
	}

	/**************************Getter & Setter*******************************************/

	public Role() {
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getDenomination() {
		return this.denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	/*public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().add(utilisateur);
		utilisateur.setRole(this);

		return utilisateur;
	}

	public Utilisateur removeUtilisateur(Utilisateur utilisateur) {
		getUtilisateurs().remove(utilisateur);
		utilisateur.setRole(null);

		return utilisateur;
	}*/


}
