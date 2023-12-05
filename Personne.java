
public abstract class  Personne {
	private String nom;

	public Personne(String nom) {
		super();
		this.nom = nom;
	}
	public void afficher() {
		System.out.println(this.nom);
	}
}
