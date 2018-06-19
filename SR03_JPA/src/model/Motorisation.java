package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the motorisation database table.
 * 
 */
@Entity
@NamedQuery(name="Motorisation.findAll", query="SELECT m FROM Motorisation m")
public class Motorisation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMotorisation;

	private double coefficient;

	private int conso100;

	private int cylindree;

	private int puissance;

	private int typeConso;
//	
//	//bi-directional many-to-one association to Vehicule
//	@OneToMany(mappedBy="motorisation")
//	private List<Vehicule> vehicules;

	public Motorisation() {
	}

	public int getIdMotorisation() {
		return this.idMotorisation;
	}

	public void setIdMotorisation(int idMotorisation) {
		this.idMotorisation = idMotorisation;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public int getConso100() {
		return this.conso100;
	}

	public void setConso100(int conso100) {
		this.conso100 = conso100;
	}

	public int getCylindree() {
		return this.cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}

	public int getPuissance() {
		return this.puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getTypeConso() {
		return this.typeConso;
	}

	public void setTypeConso(int typeConso) {
		this.typeConso = typeConso;
	}

}