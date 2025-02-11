package application;

import java.util.Arrays;

public class ManipulationChaines {
	
	public static void main(String[] args) {
//		charAt(int index)
//		Retourne le caractère à l'indice spécifié.

		char c = "Charlie et la chocolaterie".charAt(15); // renvoie 'h'
		System.out.println("c: " + c);
		
//		lastIndexOf(String str)
//		Renvoie l'indice de la dernière occurrence de la sous-chaîne spécifiée dans la chaîne, ou -1 si elle n'est pas trouvée.

		int lastPos = "The lord of the rings".lastIndexOf("the"); // renvoie 12
		System.out.println("Pos: " + lastPos);
		
//		indexOf(String str)
//		Renvoie l'indice de la première occurrence de la sous-chaîne, ou -1 si non trouvée.

		int indexPos = "Un nouvel espoir".indexOf("espoir"); // renvoie 2
		System.out.println("Pos: " + indexPos);
		
//		substring(int beginIndex, int endIndex)
//		Extrait la sous-chaîne allant de beginIndex (inclus) à endIndex (exclus).

		String sub = "I'll be back!".substring(8, 12); // renvoie "back"
		System.out.println("Sub: " + sub);
		
//		toUpperCase()
//		Retourne une nouvelle chaîne convertie en majuscules.

		String maj = "bob l'eponge".toUpperCase(); // renvoie "BOB L'EPONGE"
		System.out.println("toUpperCase: " + maj);
		
//		toLowerCase()
//		Retourne une nouvelle chaîne convertie en minuscules.

		String min = "UN NOUVEL ESPOIR".toLowerCase(); //renvoie "un nouvel espoir"
		System.out.println("toLowerCase: " + min);
		
//		trim()
//		Description : Supprime les espaces en début et fin de chaîne.

		String net = "  Que la force soit avec toi  ".trim(); // renvoie "Que la force soit avec toi"
		System.out.println("Trim: " + net);
		
//		split(String regex)
//		Divise la chaîne en un tableau de chaînes en se basant sur l'expression régulière donnée.

		String[] sections = "Mourir peut attendre;Daniel Craig;2021".split(";"); // renvoie [Mourir peut attendre, Daniel Craig, 2021]
		System.out.println("Split: " + Arrays.toString(sections));
		
//		replace(char oldChar, char newChar)
//		Remplace toutes les occurrences d'un caractère par un autre.

		String mod = "Bob L'eponge".replace('o', '0').replace('B', '8'); // renvoie "80b L'ep0nge"
		System.out.println("Mod: " + mod);
		
	}

}
