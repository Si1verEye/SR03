package sr03.utc;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class finitionTemplate {
	private int idFinition;
	private double coefficient;
	private String nom;
	
	public int getIdFinition() {
		return idFinition;
	}
	public void setIdFinition(int idFinition) {
		this.idFinition = idFinition;
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
}