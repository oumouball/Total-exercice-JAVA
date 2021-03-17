package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.util.List;

public interface IProduit {
    public int add(Produit produit) throws Exception;
    public int delete(String id) throws Exception;
    public int update(Produit produit) throws Exception;
    public List<Produit> getAll() throws Exception;

}
