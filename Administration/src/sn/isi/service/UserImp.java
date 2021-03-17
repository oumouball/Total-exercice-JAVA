package sn.isi.service;

import sn.isi.entities.User;


import java.util.Scanner;

public class UserImp implements IUser{
    Scanner scanner = new Scanner(System.in);
    @Override
    public User saisie() {
        User user = new User();
      //  User u = new User();
        System.out.println("Entrer votre id");
        user.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entrer votre nom");
        user.setNom(scanner.nextLine());
        System.out.println("Entrer votre prenom");
        user.setPrenom(scanner.nextLine());
        System.out.println("entrer votre mail");
        user.setEmail(scanner.nextLine());
        System.out.println("Entre votre password");
        user.setPassword(scanner.nextLine());
        System.out.println("Entre l'etat");
        user.setEtat(Integer.parseInt(scanner.nextLine()));

        return user;


    }

    @Override
    public void afficherUser(User u) {
        System.out.println("l'identifiant est : "+u.getId());
        System.out.println("le nom est : "+u.getNom());
        System.out.println("le prenom est : "+u.getPrenom());
        System.out.println("l' email est : "+u.getEmail());
        System.out.println("le password  est : "+u.getPassword());
        System.out.println("l'etat est : "+u.getEtat());
    }


}
