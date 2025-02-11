package application;

public class StrBuilder {

	public static void main(String[] args) {
		// Création du texte déroulant avec StringBuilder
		StringBuilder texteStarWars = new StringBuilder();

		// Ajout du texte (append)
		texteStarWars.append("Il y a bien longtemps, dans une galaxie lointaine, très lointaine...\n\n");
		texteStarWars.append("⭐ STAR WARS ⭐\n");
		texteStarWars.append("ÉPISODE IV\n");
		texteStarWars.append("UN NOUVEL ESPOIR\n\n");

		texteStarWars.append("C'est une période de guerre civile.\n");
		texteStarWars.append("Des vaisseaux rebelles, attaquant depuis une base secrète,\n");
		texteStarWars.append("ont remporté leur première victoire contre l'Empire Galactique maléfique.\n\n");

        // Insertion d'un texte au début (insert)
        texteStarWars.insert(0, "\n🔵 Lucasfilm Ltd. présente ");

        // Remplacement de texte (replace)
        int index = texteStarWars.indexOf("UN NOUVEL ESPOIR");
        if (index != -1) {
            texteStarWars.replace(index, index + 16, "LA MONTÉE DE JAVA");
        }

        // Suppression d'une phrase inutile (delete)
        index = texteStarWars.indexOf("Des vaisseaux rebelles");
        if (index != -1) {
            texteStarWars.delete(index, index + 22);
        }

		// Affichage final du texte
		System.out.println(texteStarWars.toString());
	}

}
