package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the couleurvehicule database table.
 * 
 */
@Entity
@NamedQuery(name="Couleurvehicule.findAll", query="SELECT c FROM Couleurvehicule c")
public class Couleurvehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCouleurVehicule;

	private double coefficient;

	private String finition;

	private String nom;

	public Couleurvehicule() {
	}

	public int getIdCouleurVehicule() {
		return this.idCouleurVehicule;
	}

	public void setIdCouleurVehicule(int idCouleurVehicule) {
		this.idCouleurVehicule = idCouleurVehicule;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getFinition() {
		return this.finition;
	}

	public void setFinition(String finition) {
		this.finition = finition;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}