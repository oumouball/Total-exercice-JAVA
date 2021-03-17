package isi.sn.entities;

public class MedecinChef extends Medecin{
    private String bureau;

    public MedecinChef(int id, String nomPers, String prenomPers, Service service,String bureau) {
        super(id, nomPers, prenomPers,service);
        this.bureau = bureau;
    }
    public MedecinChef (){
        super();
    }


    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }




}
