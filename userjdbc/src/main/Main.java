package main;

import sn.isi.dao.*;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        DB db = new DB();
        db.open();
        String sql = "INSERT INTO user VALUES(NULL,?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1,"BALL");
        db.getPstm().setString(2,"Mary");
        db.getPstm().setString(3,"ballmary@gmail.com");
        db.getPstm().setString(4,"passer");
        int ok  = db.executeUpdate();
        System.out.println(ok);
       /* IUser userdao = new UserImp();
        User user = new User();
        user.setNom("NDIAYE");
        user.setPrenom("Mamadou");
        user.setEmail("mamndiaye@gmail.com");
        user.setPassword("passer123");

        user.setNom("NDIAYE_FAYE");
        user.setPrenom("Mamadou_faye");
        user.setEmail("mamndiaye@gmail.com");
        user.setPassword("passer123");
        int ok = userdao.add(user);
        //System.out.println(ok+ "succefuly");
        List<User> users = userdao.getAll();
        for (User u : users)
        {
            System.out.println("id : " +u.getId() + "Nom :" +u.getNom() + "Prenom : " +u.getPrenom() + "Email : " +u.getEmail());
        }*/

        IProduit produitdao = new ProduitImpl();
        Produit produit = new Produit();
        produit.setRef("hjk");
        produit.setNomP("lait");
        User user = new User();
        user.setId(1);
        produit.setUser(user);
        int yes = produitdao.add(produit);
        List<Produit> produits = new ArrayList<Produit>();
        for (Produit p : produits){
            System.out.println(" Ref : "+p.getRef() +"Nom : " +p.getNomP());
        }



    }
}
