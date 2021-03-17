package sn.isi.entities;

public class Produit {
    private String ref;
    private String lib;
    private int qte;
    private int prix;

    public Produit(String ref, String lib, int qte, int prix) {
        this.ref = ref;
        this.lib = lib;
        this.qte = qte;
        this.prix = prix;
    }

    public Produit() {

    }

    public static void saisie() {
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
