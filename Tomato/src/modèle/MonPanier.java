package modèle;

import java.util.LinkedList;
import java.util.List;

public class MonPanier {

	private List<Tomate> tomatesDuPanier;
	
	public MonPanier() {
		this.tomatesDuPanier = new LinkedList<Tomate>();
	}
	
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