package sr03.utc;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class couleurJanteTemplate {
	private int idCouleurJante;
	private double coefficient;
	private String nom;
	private String finition;
	
	public int getIdCouleurJante() {
		return idCouleurJante;
	}
	public void setIdCouleurJante(int idCouleurJante) {
		this.idCouleurJante = idCouleurJante;
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