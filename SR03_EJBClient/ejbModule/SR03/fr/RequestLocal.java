package SR03.fr;

import java.util.List;

import javax.ejb.Local;

import model.Couleurjante;
import model.Couleurvehicule;
import model.Finition;
import model.Jante;
import model.Modele;
import model.Motorisation;
import model.Optionvehicule;
import model.Vehicule;

@Local
public interface RequestLocal {
	
	public List<Vehicule> getTousVehicules();
	public List<Motorisation> getTousMotorisation();
	public List<Modele> getTousModeles();
	public List<Couleurvehicule> getTousCouleurVehicule();
	public Vehicule getVehicule(int id);
	public List<Couleurjante> getCouleurJante(int id);
	public List<Couleurvehicule> getCouleurVehicule(int id);
	public List<Finition> getFinition(int id);
	public List<Jante> getJante(int id);
	public List<Modele> getModele(int id);
	public List<Motorisation> getMotorisation(int id);
	public Optionvehicule getOptionvehicule(int id);
	public List<Optionvehicule> getToutesOptionvehicule(int id);
	public List<Vehicule> getTousVehiculeoption(int id);
	public List<Vehicule> getTousVehiculeModColor(int idMod, int idColorV);

}
