package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vehicule database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicule.findAll", query="SELECT v FROM Vehicule v")
public class Vehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idVehicule;

	@Temporal(TemporalType.DATE)
	private Date dateProd;

	private int idCouleurVehicule;

	private int idFinition;

	private int idJante;

	private int idModele;

	private int idMotorisation;

	private int kilometrage;

	private byte occasion;

	public Vehicule() {
	}

	public int getIdVehicule() {
		return this.idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	public Date getDateProd() {
		return this.dateProd;
	}

	public void setDateProd(Date dateProd) {
		this.dateProd = dateProd;
	}

	public int getIdCouleurVehicule() {
		return this.idCouleurVehicule;
	}

	public void setIdCouleurVehicule(int idCouleurVehicule) {
		this.idCouleurVehicule = idCouleurVehicule;
	}

	public int getIdFinition() {
		return this.idFinition;
	}

	public void setIdFinition(int idFinition) {
		this.idFinition = idFinition;
	}

	public int getIdJante() {
		return this.idJante;
	}

	public void setIdJante(int idJante) {
		this.idJante = idJante;
	}

	public int getIdModele() {
		return this.idModele;
	}

	public void setIdModele(int idModele) {
		this.idModele = idModele;
	}

	public int getIdMotorisation() {
		return this.idMotorisation;
	}

	public void setIdMotorisation(int idMotorisation) {
		this.idMotorisation = idMotorisation;
	}

	public int getKilometrage() {
		return this.kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public byte getOccasion() {
		return this.occasion;
	}

	public void setOccasion(byte occasion) {
		this.occasion = occasion;
	}

}