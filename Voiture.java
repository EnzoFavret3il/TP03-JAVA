
public class Voiture {
	private int vitesse;
	private double prix;
	private String couleur;
	
	public double CalculerPrixDeVente() {
		return this.prix;
	}

	public Voiture(int vitesse, double prix, String couleur) {
		
		this.vitesse = vitesse;
		this.prix = prix;
		this.couleur = couleur;
	}
	
}
