package methodes;

import java.util.ArrayList;

public class appartement {
	int ida;
	double prix;
	String ville;
	String superficie;
	String adresse;
	int nbrechambres;
	int numeetage;
	int nbrecuisines;
	int nbrebains;
	int nbretoilettes;
	public appartement(int ida,double prix, String ville, String superficie,String adresse, int nbrechambres, int numeetage, int nbrecuisines,
			int nbrebains, int nbretoilettes) {
		super();
		this.ida=ida;
		this.prix = prix;
		this.ville = ville;
		this.superficie = superficie;
		this.adresse=adresse;
		this.nbrechambres = nbrechambres;
		this.numeetage = numeetage;
		this.nbrecuisines = nbrecuisines;
		this.nbrebains = nbrebains;
		this.nbretoilettes = nbretoilettes;
	}
	public int getIda() {
		return ida;
	}
	public void setIda(int ida) {
		this.ida = ida;
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
	public int getNumeetage() {
		return numeetage;
	}
	public void setNumeetage(int numeetage) {
		this.numeetage = numeetage;
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
