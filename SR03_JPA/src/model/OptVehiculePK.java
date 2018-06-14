package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the opt_vehicule database table.
 * 
 */
@Embeddable
public class OptVehiculePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idVehicule;

	private int idOption;

	public OptVehiculePK() {
	}
	public int getIdVehicule() {
		return this.idVehicule;
	}
	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}
	public int getIdOption() {
		return this.idOption;
	}
	public void setIdOption(int idOption) {
		this.idOption = idOption;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OptVehiculePK)) {
			return false;
		}
		OptVehiculePK castOther = (OptVehiculePK)other;
		return 
			(this.idVehicule == castOther.idVehicule)
			&& (this.idOption == castOther.idOption);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idVehicule;
		hash = hash * prime + this.idOption;
		
		return hash;
	}
}