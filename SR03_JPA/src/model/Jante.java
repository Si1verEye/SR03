package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the jante database table.
 * 
 */
@Entity
@NamedQuery(name="Jante.findAll", query="SELECT j FROM Jante j")
public class Jante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idJante;

	private double coefficient;

	//bi-directional many-to-one association to CouleurJante
	@ManyToOne
	@JoinColumn(name="idCouleurJante")
	private Couleurjante couleurjante;

//	private int idCouleurJante;

	private int taille;
	
	//bi-directional many-to-one association to Vehicule
	@OneToMany(mappedBy="jante")
	private List<Vehicule> vehicules;

	public Jante() {
	}

	public int getIdJante() {
		return this.idJante;
	}

	public void setIdJante(int idJante) {
		this.idJante = idJante;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

//	public int getIdCouleurJante() {
//		return this.idCouleurJante;
//	}
//
//	public void setIdCouleurJante(int idCouleurJante) {
//		this.idCouleurJante = idCouleurJante;
//	}

	public int getTaille() {
		return this.taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

}