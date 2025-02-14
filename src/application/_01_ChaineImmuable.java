package application;

public class _01_ChaineImmuable {
	
    public static void main(String[] args) {
        // Création d'une chaîne de caractères
        String texte = "Bonjour";
        
        // Affichage de l'adresse mémoire initiale
        System.out.println("Avant modification:");
        System.out.println("Texte : " + texte);
        System.out.println("Adresse mémoire : " + System.identityHashCode(texte));

        // Modification du texte (en apparence)
        texte = texte + " tout le monde";

        System.out.println();
        
        // Affichage après modification
        System.out.println("Après modification:");
        System.out.println("Texte : " + texte);
        System.out.println("Adresse mémoire : " + System.identityHashCode(texte));
    }

}
