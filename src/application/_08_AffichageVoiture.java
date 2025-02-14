package application;

class _08_AffichageVoiture {
    private String marque;
    private String modele;

    public _08_AffichageVoiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    // Redefinir la methode toString (Override => surcharge)
    
    @Override
    public String toString() {
    	StringBuilder voiture = new StringBuilder();
    	voiture.append("Ma voiture :").append("\n");
    	voiture.append("Marque: ").append(marque).append("\n");
    	voiture.append("Modele: ").append(modele).append("\n");
    	
    	return voiture.toString();
    	
    }
    

    public static void main(String[] args) {
        _08_AffichageVoiture v = new _08_AffichageVoiture("Toyota", "Corolla");
        // Affiche la reference par defaut Voiture@327471b5
        System.out.println(v.toString());
    }
}

