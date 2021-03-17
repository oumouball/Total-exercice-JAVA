package sn.isi.entities;

public class Produit {

    private String ref;
    private String nomP;
    private User user = new User();

    public Produit() {
    }

    public Produit(String ref, String nomP, User user) {

        this.ref = ref;
        this.nomP = nomP;
        this.user = user;
    }


    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
