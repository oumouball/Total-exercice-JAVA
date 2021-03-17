package sn.isi.service;

import sn.isi.entities.Produit;

import java.util.Scanner;

public class ProduitImp implements IProduit {
    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);
        Produit produit = new Produit();
        System.out.println("Entrer le Ref du produit");
        produit.setRef(scanner.nextLine());
        System.out.println("Enter le libelle du produit ");
        produit.setLib(scanner.nextLine());
        System.out.println("Entrer la qte du produit ");
        produit.setQte(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer le prix du produit");
        produit.setPrix(Integer.parseInt(scanner.nextLine()));


        return produit;
    }

    @Override
    public void afficherProduit(Produit p) {
        System.out.println("La ref du produit est : "+p.getRef());
        System.out.println("Le lib du produit est :"+p.getLib());
        System.out.println("la qte du produit est :"+p.getQte());
        System.out.println("Le prix du produit est : "+p.getPrix());
    }
}
