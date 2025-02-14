package application;

public class _03_Concatenation {

	public static void main(String[] args) {
		
		int retard= 0;
		
		String titre = "Vous etres cordialement " + "invite! a " + (3 + retard) + " heures";
		
		String titre2 = "Vous etres cordialement ".concat("invite!");
		
		System.out.println(titre);

	}

}
