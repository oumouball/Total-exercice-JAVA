package isi.sn.entities;

public class Service {
    private int id;
    private String nomService;

    public Service(int id, String nomService) {
        this.id = id;
        this.nomService = nomService;
    }

    public Service() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
}
