
public class Camion extends Voiture {
	private int Poids;
	
	public Camion(int Poids,int vitesse, double prix, String couleur) {
		super(vitesse, prix, couleur);
		this.Poids=Poids;
	}

	

	@Override
	public double CalculerPrixDeVente() {
		return (Poids>2000 ? 0.9:0.8) * CalculerPrixDeVente();
	}
}
