package methodes;

import java.util.ArrayList;

public class terrain {
	int idt;
	float prix;
	String adresse;
	String  Ville ;
	String superficie;
	String type;
	public terrain(int idt,float prix, String adresse, String ville, String superficie, String type) {
		super();
		this.idt=idt;
		this.prix = prix;
		this.adresse = adresse;
		Ville = ville;
		this.superficie = superficie;
		this.type = type;
	}
	public int getIdt() {
		return idt;
	}
	public void setIdt(int idt) {
		this.idt = idt;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
