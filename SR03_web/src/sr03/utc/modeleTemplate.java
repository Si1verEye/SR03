package sr03.utc;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class modeleTemplate {
	private int idModele;
	private double coefficient;
	private String nom;
	private String marque;
	private int prixInitial;
	private Date anneeModele;
	
	
	public int getIdModele() {
		return idModele;
	}
	public void setIdModele(int idModele) {
		this.idModele = idModele;
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
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPrixInitial() {
		return prixInitial;
	}
	public void setPrixInitial(int prixInitial) {
		this.prixInitial = prixInitial;
	}
	public Date getAnneeModele() {
		return anneeModele;
	}
	public void setAnneeModele(Date anneeModele) {
		this.anneeModele = anneeModele;
	}

}