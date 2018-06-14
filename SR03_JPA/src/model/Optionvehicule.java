package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the optionvehicule database table.
 * 
 */
@Entity
@NamedQuery(name="Optionvehicule.findAll", query="SELECT o FROM Optionvehicule o")
public class Optionvehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOption;

	private double coefficient;

	private String description;

	public Optionvehicule() {
	}

	public int getIdOption() {
		return this.idOption;
	}

	public void setIdOption(int idOption) {
		this.idOption = idOption;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}