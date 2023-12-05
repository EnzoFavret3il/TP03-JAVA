import static org.junit.jupiter.api.Assertions.*;

public class Test {

	@org.junit.jupiter.api.Test
	public static void test() {
		Personne[] personnes= new Personne[3];
		personnes[0]= new IngenieurLogiciel("Phillipe");
		personnes[1]= new IngenieurReseau("Paul");
		personnes[2]= new IngenieurReseau("Pierre");
		for(int i =0; i<personnes.length;i++) {
			personnes[i].afficher();
		}
	}

}
