package sn.isi.traitements;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

public interface IRn {
    Rn saisie();
    void afficherRn(Rn r);
    void affichageRn(Zone r);
}
