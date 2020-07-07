package elearningmvc.spring.springjdbc.localite.dto;

public class Localite 
{
	private int idLocalite;

	private int cp;

	private String ville;

	
	
	@Override
	public String toString() {
		return "Localite [idLocalite=" + idLocalite + ", cp=" + cp + ", ville=" + ville + "]";
	}

	/*****************************Getter & Setter**************************************************/
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
