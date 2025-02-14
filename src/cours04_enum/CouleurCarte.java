package cours04_enum;

public enum CouleurCarte {

	COEUR("rouge"), CARREAU("rouge"), PIQUE("noir"), TREFLE("noir");
	
	private final String couleur;
	
	CouleurCarte(String couleur) {
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		return couleur;
	}
}
