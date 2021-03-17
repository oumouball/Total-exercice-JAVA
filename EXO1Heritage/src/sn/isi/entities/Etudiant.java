package sn.isi.entities;

import java.util.Scanner;

public class Etudiant extends Personne{
    protected String mat;
    Scanner sc = new Scanner(System.in);
    public Etudiant() {
        super();
    }


    public Etudiant(String nom, String prenom, String mat) {
        super(nom, prenom);
        this.mat = mat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    @Override
    public void saisir() {
        System.out.println("Entre le nom de l'etudiant");
        nom= sc.nextLine();
        System.out.printf("Entre le prenom de l'etudiant\n");
        prenom= sc.nextLine();
        System.out.println("Entre le matricule de l'etudiant");
        mat = sc.nextLine();
    }

    @Override
    public void afficher() {
        System.out.println("Nom :"+nom);
        System.out.printf("Prenom :"+prenom+"\n");
        System.out.println("Matricule :"+mat);
    }
}
