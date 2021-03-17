package sn.isi.entities;

public abstract class Personne {

    /** une class abstrait est une class qu'on ne peut pas instancier
     * elle peut contenir à la fois des methodes abstrait comme des methodes concretes
     * mais toute class qui est implementé par une autre class abstrait qui est herité pas une autre class
     * si cette class n'implemente pas toute les methodes abstrait cette class doit etre definie en proteger
     *
     * declaration des attributs
     */

    protected String nom;
    protected String prenom;

    /**
     * constructeur sans argument et avec argument
     *
     */

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getters and setters
     * @return
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * methodes
     */

    public abstract void saisir();
    public abstract void afficher();
}
