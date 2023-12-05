
public class Renault extends Voiture  {
	
	private int annee;
	private int reduc;
	
	public Renault(int annee,int reduc,int vitesse, double prix, String couleur) {
		super(vitesse, prix, couleur);
		this.annee=annee;
		this.reduc=reduc;
	}
	public int getAnnee() {
		return this.annee;
	}
	public int getReduc() {
		return this.reduc;
	}
	
}
