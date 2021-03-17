package sn.isi.entities;

import java.util.Scanner;

public class Professeur extends Personne{
    protected String matiere;
    Scanner sc = new Scanner(System.in);

    public Professeur() {
        super();
    }

    public Professeur(String matiere) {
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    /**
     * redefination des methodes abstrait de personne
     */
    @Override
    public void saisir() {
        System.out.println("Entre le nom de du professeur\n");
        nom= sc.nextLine();
        System.out.printf("Entre le prenom de du professeur\n");
        prenom= sc.nextLine();
        System.out.printf("Entre la matiere enseigner par le professeur\n");
        matiere = sc.nextLine();
    }

    @Override
    public void afficher() {
        System.out.println("Nom :"+nom);
        System.out.printf("Prenom :"+prenom+"\n");
        System.out.printf("Matiere :"+matiere);
    }

}
