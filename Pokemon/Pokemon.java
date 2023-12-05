package Pokemon;

public class Pokemon {
	private String nom;
	private double pv;
	private double atk;
	public Pokemon(String nom, double pv, double atk) {
		super();
		this.nom = nom;
		this.pv = pv;
		this.atk = atk;
	}
	public String getNom() {
		return this.nom;
	}
	public double getPv() {
		return this.pv;
	}
	public double getAtk() {
		return this.atk;
	}
	
	public boolean estKO() {
		if(this.pv==0) {
			return true;
		}
		else{
			return false;
		}
	}
	public void attaquer(Pokemon cible) {
		cible.pv=cible.pv-this.atk;
	}
	
}
