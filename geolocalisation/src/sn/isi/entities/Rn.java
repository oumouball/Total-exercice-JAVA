package sn.isi.entities;

import java.util.List;

public class Rn {
    private int id;
    List<Zone>Zone;
    private double longitude;
    private double lattitude;

    public Rn(int id, List<sn.isi.entities.Zone> zone, double longitude, double lattitude) {
        this.id = id;
        Zone = zone;
        this.longitude = longitude;
        this.lattitude = lattitude;
    }

    public Rn() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<sn.isi.entities.Zone> getZone() {
        return Zone;
    }
    public void setZone(List<sn.isi.entities.Zone> zone) {
        Zone = zone;
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
