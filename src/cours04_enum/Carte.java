package cours04_enum;

public class Carte {

	private final ValeurCarte valeurCarte;
	private final CouleurCarte couleurCarte;

	public Carte(ValeurCarte valeurCarte, CouleurCarte couleurCarte) {
		this.valeurCarte = valeurCarte;
		this.couleurCarte = couleurCarte;
	}

	@Override
	public String toString() {
		return "Carte : " + valeurCarte + " de " + couleurCarte + " (Valeur : " + valeurCarte.getPoints() + " points)";
	}

}
