package sn.isi.entities;

public class User {
    private int id;
    private String nom;
    private String prenom;
    private String password;
    private String email;
    public int etat;

    public User() {

    }
    /**
     * constructeur avec argument
     * @param idU
     *
     * @param password
     * @param nom
     * @param email
     * @param prenom
     * @param etat
     */

    public User (int id, int etat, String nom, String prenom, String password, String email) {
        this.id = id;
        this.etat = etat;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.email = email;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
