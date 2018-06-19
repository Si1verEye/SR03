package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the finition database table.
 * 
 */
@Entity
@NamedQuery(name="Finition.findAll", query="SELECT f FROM Finition f")
public class Finition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idFinition;

	private double coefficient;

	private String nom;

//	//bi-directional many-to-one association to Vehicule
//	@OneToMany(mappedBy="finition")
//	private List<Vehicule> vehicules;

	public Finition() {
	}

	public int getIdFinition() {
		return this.idFinition;
	}

	public void setIdFinition(int idFinition) {
		this.idFinition = idFinition;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

//	public List<Vehicule> getVehicules() {
//		return this.vehicules;
//	}
//
//	public void setVehicules(List<Vehicule> vehicules) {
//		this.vehicules = vehicules;
//	}

}