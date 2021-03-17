package presentation;

import sn.isi.entities.Etudiant;
import sn.isi.entities.Personne;
import sn.isi.entities.Professeur;

public class Main {
    public static void main(String[] args) {
       //instanciation de l'objet (etudiant)
        Etudiant E = new Etudiant();
        E.saisir();
        E.afficher();
        //instanciation de professeur
        Professeur P = new Professeur();
        P.saisir();
        P.afficher();

    }
}
