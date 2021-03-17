package sn.isi.dao;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduitImpl implements IProduit{
    DB db = new DB();
    @Override
    public int add(Produit produit) throws Exception {
        db.open();
        String sql = "INSERT INTO produit VALUES(?,?,?)";
        db.init(sql);
        db.getPstm().setString(1, produit.getRef());
        db.getPstm().setString(2, produit.getNomP());
        db.getPstm().setInt(3,produit.getUser().getId());
        int ok  = db.executeUpdate();
        return ok;
    }

    @Override
    public int delete(String ref) throws Exception {
        db.open();
        String sql = "Delete from produit where ref = ?";
        db.init(sql);
        db.getPstm().setString(1,ref);
        return 0;
    }

    @Override
    public int update(Produit produit) throws Exception {
        db.open();
        String sql = "UPDATE produit set nomP = ? where ref = ?";
        db.init(sql);
        db.getPstm().setString(1,produit.getNomP());
        db.getPstm().setString(2, produit.getRef());

        int ok  = db.executeUpdate();
        return ok;
    }

    @Override
    public List<Produit> getAll() throws Exception {
        List<Produit> produits = new ArrayList<Produit>();
        db.open();
        String sql = "SELECT * from produit";
        db.init(sql);
        ResultSet res = db.executeSelect();
        while (res.next())
        {
            Produit produit = new Produit();
            produit.setRef(res.getString(1));
            produit.setNomP(res.getString(2));
            produit.setUser(new UserImp().get(res.getInt(3)));
            produits.add(produit);
        }
        return produits;
    }
}
