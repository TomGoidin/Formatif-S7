package formatifS7;

/**
 * Cours 243- formatifS7
 *
 * @author Julien.Brunet
 * @since 2022-11-16
 */
public class GroupeClasse {
    public static final int MAXIMUM_ETU = 26;

    private Etudiant[] etudiants = new Etudiant[MAXIMUM_ETU];

    private String nom;

    //cette variable maintien le nombre d'etudiants reels pour eviter de parcourir la liste inutilement
    //Elle doit rester invisible de l'exterieur!!
    private int nbrEtu;

    public GroupeClasse(String nom) {
        this.nom = nom;
    }
    /**

     * @param etudiant
     */
    public void addEtudiant(Etudiant etudiant){
        if(nbrEtu < MAXIMUM_ETU) {
            //on peut insérer
            etudiants[nbrEtu] = etudiant;
            nbrEtu++;
        }
        else {
            System.out.println("Impossible d'insérer " + etudiant.getNom() + " a la " + this);
        }

    }

    /**
     * ma javadoc parfaite
     * @param etudiant
     */
    public void enleverEtudiant(Etudiant etudiant) {
       //Challenge implémenter ceci!!
    }



    public String[] listeNomsEtudiants(){
        String[] nonNulls = new String[nbrEtu];
        for (int i = 0; i < nbrEtu; i++) {
            nonNulls[i] = etudiants[i].getNom();
        }
        return nonNulls;
    }

    public int nombreEtudiants() {
        return nbrEtu;
    }

    @Override
    public String toString() {
        return "GroupeClasse{" +
                "nom='" + nom + '\'' + " avec "
                + nombreEtudiants() + " etudiants." +
                '}';
    }

}
