package elearningmvc.spring.springhibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoriemodule")
public class Categoriemodule implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCatModule")
	private int idCatModule;
	@Column(name="denomination")
	private String denomination;

	/*//bi-directional many-to-one association to Module
	@OneToMany(mappedBy="categoriemodule")
	private List<Module> modules;*/
	
	
	@Override
	public String toString() {
		return "Categoriemodule [idCatModule=" + idCatModule + ", denomination=" + denomination + "]";
	}

	/**************************Getter & Setter*******************************************/
	public int getIdCatModule() {
		return this.idCatModule;
	}

	public void setIdCatModule(int idCatModule) {
		this.idCatModule = idCatModule;
	}

	public String getDenomination() {
		return this.denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	/*public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	public Module addModule(Module module) {
		getModules().add(module);
		module.setCategoriemodule(this);

		return module;
	}

	public Module removeModule(Module module) {
		getModules().remove(module);
		module.setCategoriemodule(null);

		return module;
	}*/

}
