package isi.sn.entities;

public class MedecinSpecialiste extends Medecin{
    private String specialite;


    public MedecinSpecialiste(int id, String nomPers, String prenomPers, Service service, String specialite) {
        super(id, nomPers, prenomPers, service);
        this.specialite = specialite;
    }

    public MedecinSpecialiste() {
      super();
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
