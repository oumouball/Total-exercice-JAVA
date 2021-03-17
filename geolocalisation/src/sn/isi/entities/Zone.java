package sn.isi.entities;

public class Zone {
    private int idZone;
    private String nom;
    private double longitude;
    private double lattitude;

    public Zone(int idZone, String nom, double longitude, double lattitude) {
        this.idZone = idZone;
        this.nom = nom;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    public Zone() {

    }

    public int getIdZone() {
        return idZone;
    }
    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLattitude() {
        return lattitude;
    }
    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }
}
