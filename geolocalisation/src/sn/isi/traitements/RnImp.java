package sn.isi.traitements;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp implements IRn{
    @Override
    public Rn saisie() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("*********** AJOUTER UNE RN  *************");
        System.out.println("---------------------------------------------");
        Rn rn = new Rn();
        ArrayList<Zone> Zone= new ArrayList<Zone>();

        String rep = null;
        do {
            System.out.println("ENTRER L'ID");
            rn.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("ENTRER LE NOM DE LA Route Nationale");
           // rn.setZone(List<Zone> zone);
            System.out.println("ENTRER LA LONGITUDE");
            rn.setLattitude(Double.parseDouble(scanner.nextLine()));
            System.out.println("ENTRER LA LATTITUDE");
            rn.setLattitude(Double.parseDouble(scanner.nextLine()));
            System.out.println("voulez vous continuez? :O/N");
            rep = scanner.nextLine();

        }while  (rep.equalsIgnoreCase("O") );
        return rn;

    }

    @Override
    public void afficherRn(Rn r) {

    }

    @Override
    public void affichageRn(Zone r) {

    }

}
