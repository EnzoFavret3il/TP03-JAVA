
public class PointNom extends Point{
	private int x;
	private int y;
	private String Nom;
	
	public PointNom(int x, int y, String nom) {
		super();
		this.x = x;
		this.y = y;
		this.Nom = nom;
	}
	public void setPointNom(int x, int y, String nom) {
	this.x = x;
	this.y = y;
	this.Nom = nom;
	}
	public void setNom(String nom) {
		this.Nom=nom;
	}
	public void affCoordNom() {
		System.out.print("coordonnées: "+this.x +" "+this.y+ " Voici le nom: "+ this.Nom);
	}
}
