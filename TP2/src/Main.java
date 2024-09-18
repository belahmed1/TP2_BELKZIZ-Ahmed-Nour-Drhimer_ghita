public class Main {
    public static void main(String[] args) {

        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();
        Vehicule bateau = new Bateau();

        double distance = 150;

        System.out.println("Une Voiture devrait mettre " + voiture.calculerTempsTrajet(distance) + " heures");
        System.out.println("Un Vélo devrait mettre " + velo.calculerTempsTrajet(distance) + " heures");
        System.out.println("Un Bateau devrait mettre " + bateau.calculerTempsTrajet(distance) + " heures");
    }
}