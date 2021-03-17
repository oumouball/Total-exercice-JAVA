package main;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;
import sn.isi.traitements.IRn;
import sn.isi.traitements.IZone;
import sn.isi.traitements.RnImp;
import sn.isi.traitements.ZoneImp;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IZone iz = new ZoneImp();
        ArrayList<Zone> ListZone =iz.saisie();
        iz.affichageZones(ListZone);
        //Zone z =iz.saisie();
       // iz.affichageZone(z);
        //IRn ir = new RnImp();
       // Rn r =ir.saisie();

    }
}
