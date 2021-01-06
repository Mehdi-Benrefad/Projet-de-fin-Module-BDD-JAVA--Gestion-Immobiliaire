package methodes;

import java.util.ArrayList;

public class villa {
	int idv;
	double prix;
	String ville;
	String superficie;
	String adresse;
	int nbrechambres;
	int nbreetages;
	int nbrecuisines;
	int nbrebains;
	int nbretoilettes;
	
	public villa(int idv,double prix, String ville, String superficie,String adresse, int nbrechambres, int nbreetages, int nbrecuisines,
			int nbrebains, int nbretoilettes) {
		super();
		this.idv=idv;
		this.prix = prix;
		this.ville = ville;
		this.superficie = superficie;
		this.adresse=adresse;
		this.nbrechambres = nbrechambres;
		this.nbreetages = nbreetages;
		this.nbrecuisines = nbrecuisines;
		this.nbrebains = nbrebains;
		this.nbretoilettes = nbretoilettes;
	}
	public int getIdv() {
		return idv;
	}
	public void setIdv(int idv) {
		this.idv = idv;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public int getNbrechambres() {
		return nbrechambres;
	}
	public void setNbrechambres(int nbrechambres) {
		this.nbrechambres = nbrechambres;
	}
	public int getNbreetages() {
		return nbreetages;
	}
	public void setNbreetages(int nbreetages) {
		this.nbreetages = nbreetages;
	}
	public int getNbrecuisines() {
		return nbrecuisines;
	}
	public void setNbrecuisines(int nbrecuisines) {
		this.nbrecuisines = nbrecuisines;
	}
	public int getNbrebains() {
		return nbrebains;
	}
	public void setNbrebains(int nbrebains) {
		this.nbrebains = nbrebains;
	}
	public int getNbretoilettes() {
		return nbretoilettes;
	}
	public void setNbretoilettes(int nbretoilettes) {
		this.nbretoilettes = nbretoilettes;
	}
	
	
	
	

}
