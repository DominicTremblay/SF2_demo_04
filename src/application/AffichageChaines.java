package application;

public class AffichageChaines {

	public static void main(String[] args) {

		//		La méthode statique String.valueOf est une méthode utilitaire de la classe String qui convertit 
		//		divers types (primitifs ou objets) en leur représentation sous forme de chaîne de caractères.
	
		int nombres = 12345;
		boolean victoire = true;
		System.out.println(String.valueOf(nombres));
		System.out.println(String.valueOf(victoire).getClass());
		
	}

}
