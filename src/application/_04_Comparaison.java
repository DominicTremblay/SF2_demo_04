package application;

public class _04_Comparaison {
	
	public static void main(String[] args) {
		String personnage1 = "Patrick L'etoile";
		String personnage2 = "Patrick L'etoile";
		
		// true en raison du String pool
		System.out.println(personnage1 == personnage2);
		System.out.println(System.identityHashCode(personnage1));
		System.out.println(System.identityHashCode(personnage2));
		
		String personnage3 = new String("Sandy L'ecureuil");
		String personnage4 = new String("Sandy L'ecureuil");
		
		System.out.println(System.identityHashCode(personnage3));
		System.out.println(System.identityHashCode(personnage4));
		
		System.out.println(personnage3 == personnage4);
		
		System.out.println(personnage3.equals(personnage4));
		
		String personnage5 = "Bob L'eponge";
		String personnage6 = "bob l'eponge";
				// equalsIgnoreCase
		System.out.println(personnage5.equals(personnage6));
		System.out.println(personnage5.equalsIgnoreCase(personnage6));
		
		System.out.println(personnage5.compareToIgnoreCase(personnage6));
		
		System.out.println(personnage1.startsWith("Pat"));
		
		System.out.println(personnage4.endsWith("euil"));
		
	}

}
