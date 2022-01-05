public class Case {
    private int couleur;
    private char lettre;
    

    /**
     * pré-requis : uneCouleur est un entier entre 1 et 5
     * action : constructeur de Case
     */
    public Case(int uneCouleur) {
        this.couleur = uneCouleur;
        this.lettre='0';
        
    }

    /**
     * résultat : la couleur de this, un nombre entre 1 et 5
     */
    public int getCouleur() {
        // if (1 >= this.couleur <=5) // pré-requis
        return this.couleur; // ou juste uneCouleur
    }

    /**
     * pré-requis : cette case est recouverte
     */
    public char getLettre() {
        return lettre; // this.lettre est pas définit donc pour le moment je mets juste lettre
    }

    /**
     * pré-requis : let est une lettre majuscule
     */
    public void setLettre(char let) {
        this.lettre = let;
    }

    /**
     * résultat : vrai ssi la case est recouverte par une lettre
     */
    public boolean estRecouverte() {
        boolean res = false;
        if(this.lettre!='0'){
            res = true;
        }
        return res;
        

    }

    // pas de précision
    public String toString() {
        String a = "hjk";
        // le a c'est pour pas qu'il y est d'erreurs
        return a;
    }

}
