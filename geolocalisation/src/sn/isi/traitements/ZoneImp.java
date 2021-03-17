package sn.isi.traitements;

import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.Scanner;

public class ZoneImp implements IZone{
    @Override
    public ArrayList<Zone> saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("*********** AJOUTER UNE ZONE  *************");
        System.out.println("---------------------------------------------");
        //Zone z = new Zone();
        ArrayList<Zone> ListZone = new ArrayList<Zone>();
        String rep = null;
        do {
            Zone z = new Zone();
            System.out.println("ENTRER L'ID");
            z.setIdZone(Integer.parseInt(scanner.nextLine()));
            System.out.println("ENTRER LE NOM DE LA ZONE");
            z.setNom(scanner.nextLine());
            System.out.println("ENTRER LA LONGITUDE");
            z.setLattitude(Double.parseDouble(scanner.nextLine()));
            System.out.println("ENTRER LA LATTITUDE");
            z.setLattitude(Double.parseDouble(scanner.nextLine()));
            System.out.println("voulez vous continuez? :O/N");
           rep = scanner.nextLine();
        }while  (rep.equalsIgnoreCase("O") );
        return ListZone;
    }

    @Override
    public void affichageZones(ArrayList<Zone> listZone) {
        ArrayList<Zone> Zones = new ArrayList<Zone>();
        for (Zone zone : Zones){
            System.out.println("L'ID du Zone est:"+zone.getIdZone());
            System.out.println("Le nom de la Zone est:"+zone.getNom());
            System.out.println("La longitude de la Zone est:"+zone.getLongitude());
            System.out.println("La lattitude de la Zone est :"+zone.getLattitude());
        }
    }
}
