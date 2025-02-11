package application;

class Voiture {
    private String marque;
    private String modele;

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "Voiture : " + marque + " " + modele;
    }

    public static void main(String[] args) {
        Voiture v = new Voiture("Toyota", "Corolla");
        System.out.println(v); // Affichera : Voiture : Toyota Corolla
    }
}

