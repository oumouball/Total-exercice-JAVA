package isi.sn.traitement;

import isi.sn.entities.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MedecimImp implements IMedecin {
    @Override
    public Medecin saisie() {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("*************$$$$$$$$$ AJOUTER UN MEDECIN  $$$$$$$$$  **************");
        System.out.println("--------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        Medecin m = null;

        System.out.println("**************  VEUILEEZ CHOISIR UN MEDECIN A AJOUTER **************");
        System.out.println("                     1 : MEDECIN GENERALISTE                        ");
        System.out.println("                        2 :MEDECIN SPECIALISTE                      ");
        System.out.println("                            3 :MEDECIN CHEF                         ");
        System.out.println("********************************************************************");

        int menuAcceuil = Integer.parseInt(scanner.nextLine());

        switch (menuAcceuil){
            case 1 :
               m = new MedecinGeneraliste();
                saisirMedecin(scanner, m);
                System.out.println("Entre les specialités du medecin");
                ((MedecinGeneraliste)m).setListSpecialite(scanner.nextLine());
                break;
            case 2 :
                m = new MedecinSpecialiste();
                saisirMedecin(scanner, m);
                System.out.println("Entre le specialité du medecin");
                ((MedecinSpecialiste)m).setSpecialite(scanner.nextLine());
                break;
            case 3 :
                m = new MedecinChef();
                saisirMedecin(scanner, m);
                System.out.println("Entre le bureau du medecin chef");
                ((MedecinChef)m).setBureau(scanner.nextLine());
                break;
            default:
                System.out.println("choix non disponible veuillez recommancé SVP");
        }
        return m;
    }

    private void saisirMedecin(Scanner scanner, Medecin m) {
        System.out.println("entrer l'id du medecin");
        m.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entre le nom du medecin");
        m.setNomPers(scanner.nextLine());
        System.out.println("Entre le prenom du medecin");
        m.setPrenomPers(scanner.nextLine());
        Service service = new Service();
        System.out.println("Entre l'id du service du medecin");
        service.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Entre le nom du service du medecin");
        service.setNomService(scanner.nextLine());
        m.setService(service);
    }
    @Override
    public void affichage(Medecin m) {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("*********** $$$$$$$$$ AFFICHAGE D'UN MEDECIN  $$$$$$$$  ************");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("l'id du medecin est : " + m.getId());
        System.out.println("le nom du medecin : " + m.getNomPers());
        System.out.println("le prenom du medecin : " + m.getPrenomPers());
        System.out.println("l'id du service : " + m.getService().getId());
        System.out.println("le nom du service est : "+m.getService().getNomService());
        if (m instanceof MedecinGeneraliste)
        {
            System.out.println("la liste des specialité du medecin est : "+((MedecinGeneraliste)m).getListSpecialite());
        }
        if (m instanceof MedecinSpecialiste)
        {
            System.out.println("l' specialité  du medecin est : "+((MedecinSpecialiste)m).getSpecialite());
        }
        if (m instanceof MedecinChef)
        {
            System.out.println("le bureau  du medecin chef est : "+((MedecinChef)m).getBureau());
        }
    }
}



