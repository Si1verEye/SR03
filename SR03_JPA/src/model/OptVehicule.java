package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opt_vehicule database table.
 * 
 */
@Entity
@Table(name="opt_vehicule")
@NamedQuery(name="OptVehicule.findAll", query="SELECT o FROM OptVehicule o")
public class OptVehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OptVehiculePK id;

	public OptVehicule() {
	}

	public OptVehiculePK getId() {
		return this.id;
	}

	public void setId(OptVehiculePK id) {
		this.id = id;
	}

}