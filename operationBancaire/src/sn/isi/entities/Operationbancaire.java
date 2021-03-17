package sn.isi.entities;

import java.util.Date;

public class Operationbancaire {
    private  int id;
    private String lib;
    private double montant;
    private Date date = null;

    public Operationbancaire(int id, String lib, double montant, Date date) {
        this.id = id;
        this.lib = lib;
        this.montant = montant;
        this.date = date;
    }

    public Operationbancaire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
