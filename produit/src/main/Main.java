package main;

import sn.isi.entities.Produit;
import sn.isi.service.IProduit;
import sn.isi.service.ProduitImp;

public class Main {
    public static void main(String[] args) {
        IProduit produit = new ProduitImp();
        Produit p = produit.saisie();
        produit.afficherProduit(p);
    }
}
