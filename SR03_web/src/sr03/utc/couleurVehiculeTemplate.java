package sr03.utc;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class couleurVehiculeTemplate {
	private int idCouleurVehicule;
	private double coefficient;
	private String nom;
	private String finition;
	
	public int getIdCouleurVehicule() {
		return idCouleurVehicule;
	}
	public void setIdCouleurVehicule(int idCouleurVehicule) {
		this.idCouleurVehicule = idCouleurVehicule;
	}
	public double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFinition() {
		return finition;
	}
	public void setFinition(String finition) {
		this.finition = finition;
	}
}