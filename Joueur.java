public class Joueur {
    private String nom;
    private MEE chevalet;
    private int score;

    // Un constructeur
    public Joueur(String unNom) {
        this.nom = unNom;
        // this.chevalet ?
        this.score = 0; // ?
    }

    // méthode permettant l'affichage
    public String toString() {
    }

    // un accesseur en lecteur de l'attribut score ?
    public int getscore() {
        return score;
    }

    // méthode permettant d'augmenter le score de nb points
    public void ajouteScore(int nb) { // A verifier
        this.score += nb;
    }

    /**
     * pré-requis : nbPointsJet indique le nombre de points rapportés par
     * chaque jeton/lettre
     * résultat : le nombre de points total sur le chevalet de ce joueur
     * suggestion : bien relire la classe MEE !
     */
    public int nbPointsChevalet(int[] nbPointsJet) {
    }

    /**
     * pré-requis : les éléments de s sont inférieurs à 26
     * action : simule la prise de nbJetons jetons par this dans le sac s,
     * dans la limite de son contenu.
     */
    public void prendJetons(MEE s, int nbJetons) {
    }

}
