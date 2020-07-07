package elearningmvc.spring.springhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localite")
public class Localite 
{
	@Id
	@Column(name="idLocalite")
	private int idLocalite;
	@Column(name="cp")
	private int cp;
	@Column(name="ville")
	private String ville;
	
	@Override
	public String toString() {
		return "Localite [idLocalite=" + idLocalite + ", cp=" + cp + ", ville=" + ville + "]";
	}

	/**************************Getter & Setter*******************************************/
	public int getIdLocalite() {
		return idLocalite;
	}

	public void setIdLocalite(int idLocalite) {
		this.idLocalite = idLocalite;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
