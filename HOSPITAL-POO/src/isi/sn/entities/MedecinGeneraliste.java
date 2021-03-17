package isi.sn.entities;

public class MedecinGeneraliste extends Medecin {
    private String listSpecialite;

    public String getListSpecialite() {
        return listSpecialite;
    }

    public void setListSpecialite(String listSpecialite) {
        this.listSpecialite = listSpecialite;
    }

    public MedecinGeneraliste(String listSpecialite) {
        this.listSpecialite = listSpecialite;
    }

    public MedecinGeneraliste(int id, String nomPers, String prenomPers, Service service, String listSpecialite) {
        super(id, nomPers, prenomPers, service);
        this.listSpecialite = listSpecialite;
    }
    public MedecinGeneraliste(){
        super();
    }
}
