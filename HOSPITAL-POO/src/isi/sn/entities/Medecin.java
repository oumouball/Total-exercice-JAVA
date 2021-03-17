package isi.sn.entities;

import isi.sn.traitement.IMedecin;
import isi.sn.traitement.MedecimImp;

import java.util.Scanner;
public abstract class Medecin extends Personne {



    private Service service;

    public Medecin() {
        super();
    }
    public Medecin(int id, String nomPers, String prenomPers,Service service) {
        super(id, nomPers, prenomPers);
         this.service = service;
    }


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }


}



