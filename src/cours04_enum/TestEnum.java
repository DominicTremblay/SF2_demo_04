package cours04_enum;

public class TestEnum {

	public static void main(String[] args) {

		// Declarer des objets ValeurCarte;
		ValeurCarte premiereCarte = ValeurCarte.AS;
		ValeurCarte deuxièmeCarte = ValeurCarte.ROI;

		System.out.println("Ma premiere carte : " + premiereCarte); // Ma premiere carte : AS
		System.out.println("Ma deuxième carte : " + deuxièmeCarte); // Ma premiere carte : AS

		// Parcourir
		for (ValeurCarte carte : ValeurCarte.values()) {

			System.out.println("Ordre: " + carte.ordinal() + " Valeur: " + carte);

		}

		// comparaison
		if (premiereCarte == ValeurCarte.AS) {
			System.out.println("C'est un As !");
		}

		// switch
		switch (premiereCarte) {
		case AS:
			System.out.println("Un As !");
			break;
		case ROI:
			System.out.println("Un Roi !");
			break;
		default:
			System.out.println("Une autre carte.");
		}
		
		// toString et valueOf
		System.out.println(deuxièmeCarte.toString()); 
		
		System.out.println(ValeurCarte.valueOf("ROI"));
		
		Carte maCarte = new Carte(ValeurCarte.AS, CouleurCarte.CARREAU);
		
		System.out.println(maCarte.toString());

	}

}
