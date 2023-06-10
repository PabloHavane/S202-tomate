package modèle;

import java.util.LinkedList;
import java.util.List;

public class MonPanier {

	private List<Tomate> tomatesDuPanier;
	private String nom;
	private String prenom;
	private String adresse1;
	private String adresse2;
	private String codePostal;
	private String ville;
	private String telephone;
	private String mail;
	
	public MonPanier() {
		this.tomatesDuPanier = new LinkedList<Tomate>();
		this.nom = null;
		this.prenom = null;
		this.adresse1 = null;
		this.adresse2 = null;
		this.codePostal = null;
		this.ville = null;
		this.telephone = null;
		this.mail = null;
		
	}
	
	/**
	 * Actions avec les coordonnees
	 */
	
	public void setAllCoordonne(String nom,String prenom, String adresse1, String codePostal,
			String ville, String telephone, String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse1 = adresse1;
		this.adresse2 = adresse2;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.mail = mail;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getAdresse1() {
		return this.adresse1;
	}
	
	public String getAdresse2() {
		return this.adresse2;
	}
	
	public String getCP() {
		return this.codePostal;
	}
	
	public String getVille() {
		return this.ville;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	/**
	 * Actions avec le panier
	 */
	public List<Tomate> getMesTomates() {
		return this.tomatesDuPanier;
	}
	
	public void addMesTomate(Tomate tomate,int quantite) {
		for (int i=0;i<quantite;i++)
			this.tomatesDuPanier.add(tomate);
	}
	
	public void clearMesTomates() {
		this.tomatesDuPanier.clear();
	}
	
	public int sizeMesTomates() {
		return this.tomatesDuPanier.size();
	}
	
	public float prixMonPanier() {
		float prix = 0F;
		for (Tomate tomate: this.getMesTomates()) {
			prix+=tomate.getPrixTTC();
		}
		return prix;
	}
	
	public Tomate getMaTomate(String designation) {
		for (Tomate graine : this.getMesTomates()) {
			if (graine.getDésignation().equals(designation))
				return graine;
		}
		return null;
	}
}