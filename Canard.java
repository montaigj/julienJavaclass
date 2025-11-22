public class Canard {
    // Attributs
    public String couleur;
    public int taille; 

    
    public static void main(String[] args) {
        Canard monPremierCanard = new Canard();

        monPremierCanard.couleur = "jaune";
        monPremierCanard.taille = 10;

        System.out.println("Mon premier canard est de couleur " + monPremierCanard.couleur + " et mesure " + monPremierCanard.taille + " cm.");
    }

} 
public class Canard {
    // 1. Attributs
    private String couleur;
    private int taille; 

    // 2. Constructeur
    public Canard(String couleur, int taille) {
        this.couleur = couleur;
        this.taille = taille;
    }
    
    // 3. Getters et Setters
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public int getTaille() { return taille; }      
    public void setTaille(int taille) { this.taille = taille; }
    
    public void cancaner() {
        System.out.println("Coin coin !");
    }

    // Méthode grandir corrigée (pas de "++ 1", juste "++")
    public void grandir() {
        this.taille++; 
    }

    // --- MAIN ---
    public static void main(String[] args) {
        Canard canard1 = new Canard("jaune", 10);

        // 1er affichage (avant de grandir)
        System.out.println("Taille au debut : " + canard1.getTaille() + " cm");

        // Action : Le canard grandit
        canard1.grandir(); 

        // 2ème affichage (C'EST ICI QUE LE 11 S'AFFICHERA)
        System.out.println("Taille apres croissance : " + canard1.getTaille() + " cm");
    }
}