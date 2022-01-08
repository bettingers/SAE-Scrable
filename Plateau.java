public class Plateau {
    private Case[][] g; // g pour grille

    public Plateau() {
        int[][] plateau = { { 5, 1, 1, 2, 1, 1, 1, 5, 1, 1, 1, 2, 1, 1, 5 },
                { 1, 4, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 4, 1 },
                { 1, 1, 4, 1, 1, 1, 2, 1, 2, 1, 1, 1, 4, 1, 1 },
                { 2, 1, 1, 4, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2 },
                { 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1 },
                { 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1 },
                { 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1 },
                { 5, 1, 1, 2, 1, 1, 1, 4, 1, 1, 1, 2, 1, 1, 5 },
                { 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1 },
                { 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 3, 1 },
                { 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1 },
                { 2, 1, 1, 4, 1, 1, 1, 2, 1, 1, 1, 4, 1, 1, 2 },
                { 1, 1, 4, 1, 1, 1, 2, 1, 2, 1, 1, 1, 4, 1, 1 },
                { 1, 4, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 1, 4, 1 },
                { 5, 1, 1, 2, 1, 1, 1, 5, 1, 1, 1, 2, 1, 1, 5 } };

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[0].length; j++) {
                this.g[i][j] = new Case(plateau[i][j]);
            }
        }
    }


    public Plateau (Case[][] plateau) {
   this.g = plateau;
   }


    /**
     * résultat : chaîne décrivant ce Plateau
     */

    // public String toString() {
        
    // }

    // permet d'afficher la grille avec les num qui correspond au code couleur
    // des cases et laissa vide sur la casse est grise cad si le code coleur est de
    // 1
    // Indique les indices des lignes mais pas des colonnes.
    // il manque à mettre les indices des colonnes, mettre
    // la lettre majuscule quana la lettre est recouverte
    
    public String toString(){
        String ligne = "  01 02 03 04 05 06 07 08 09 10 11 12 13 14 15";
        String colonne = "\n";
        for(int i=0 ; i<g.length; i++){
            for(int j=0; j<g[0].length; j++){
                if(g[i][j].getCouleur()==1){
                    colonne += "_|";

                }
                else{
                    colonne += g[i][j].getCouleur() + "_|";

                }

            }

        }
        if (i<10){
            colonne = " " + colonne + "0" + i + "\n";
        }
        else{
            colonne = " " + colonne + " " + i + "\n";

        }
        return ligne + colonne;
    }
      

    // Autres méthodes permettant de placer un mot proposé pat un joueur.
    // le mot est un String
    // coordonées de la case contenant la première lettre
    // le sens du mot (vertical v ou hrizontal h )

    /**
     * pré-requis : mot est un mot accepté par CapeloDico,
     * 0 <= numLig <= 14, 0 <= numCol <= 14, sens est un élément
     * de {’h’,’v’} et l’entier maximum prévu pour e est au moins 25
     * résultat : retourne vrai ssi le placement de mot sur this à partir
     * de la case (numLig, numCol) dans le sens donné par sens à l’aide
     * des jetons de e est valide.
     */

    
     public boolean placementValide(String mot, int numLig, int numCol,char sens, MEE e) {
         if(g[7][7].estRecouverte()==true){
             if(sens='h'){
                 if(numCol + mot.length()-1<=14){

                 }
             }
         }

         else{
             if(mot.length()>=2 && mot.length()<=7 && sens='h'){
                 numLig=7 

             }
         }
         

      
      }
      }
    

    // Méthode de comptabilité des points

    /**
     * pré-requis : le placement de mot sur this à partir de la case
     * (numLig, numCol) dans le sens donné par sens est valide
     * résultat : retourne le nombre de points rapportés par ce placement, le
     * nombre de points de chaque jeton étant donné par le tableau nbPointsJet.
     */
    // public int nbPointsPlacement(String mot, int numLig, int numCol,char sens,
    // int[] nbPointsJet) {

    // }

    /**
     * pré-requis : le placement de mot sur this à partir de la case
     * (numLig, numCol) dans le sens donné par sens à l’aide des
     * jetons de e est valide.
     * action/résultat : effectue ce placement et retourne le
     * nombre de jetons retirés de e.
     */
    // public int place(String mot, int numLig, int numCol, char sens, MEE e){}

    public static void main(String[] args) {
        int [][] mat = new Plateau (plateau [15][15]);

        affichage(plateau);

        // prblème avec int[][] plateau;
    }

}
