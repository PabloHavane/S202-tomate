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
	
	public static MonPanier monPanier = new MonPanier();
	
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
		if (nom.isEmpty())
			this.nom="Non renseigné";
		else
			this.nom = nom;
		if (prenom.isEmpty())
			this.prenom="Non renseigné";
		else
			this.prenom = prenom;
		if (adresse1.isEmpty())
			this.adresse1="Non renseigné";
		else
			this.adresse1 = adresse1;
		if (codePostal.isEmpty())
			this.codePostal="Non renseigné";
		else
			this.codePostal = codePostal;
		if (ville.isEmpty())
			this.ville="Non renseigné";
		else
			this.ville = ville;
		if (telephone.isEmpty())
			this.telephone="Non renseigné";
		else
			this.telephone = telephone;
		if (mail.isEmpty())
			this.mail="Non renseigné";
		else
			this.mail = mail;
	}
	
	public String toStringCoordonnées() {
		return "Nom : " + this.nom + "\n" + "Prénom : " + this.prenom + "\n" + "Adresse : " + this.adresse1 + "\n" +
				"Code postal : " + this.codePostal + "\n" + "Ville : " +this.ville + "\n" +
				"Téléphone : "+this.telephone + "\n" + "Mail : "+this.mail+"\n";
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