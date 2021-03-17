package sn.isi.traitements;

import sn.isi.entities.Zone;

import java.util.ArrayList;

public interface IZone {
    ArrayList<Zone> saisie();
    //void afficherZone(Zone z);

   // void affichageZone(Zone z);

    void affichageZones(ArrayList<Zone> listZones);
}
