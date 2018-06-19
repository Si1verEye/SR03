package sr03.utc;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class janteTemplate {
	private int idJante;
	private double coefficient;
	private int taille;
	private int idCouleurJante;
	
	public int getIdJante() {
		return idJante;
	}
	public void setIdJante(int idJante) {
		this.idJante = idJante;
	}
	public double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getIdCouleurJante() {
		return idCouleurJante;
	}
	public void setIdCouleurJante(int idCouleurJante) {
		this.idCouleurJante = idCouleurJante;
	}
}