package sn.isi.dao;

import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class  UserImp implements IUser{
    DB db = new DB();

    @Override
    public int add(User user) throws Exception {
        db.open();
        String sql = "INSERT INTO user VALUES(NULL,?,?,?,?)";
        db.init(sql);
        db.getPstm().setString(1, user.getNom());
        db.getPstm().setString(2, user.getPrenom());
        db.getPstm().setString(3, user.getEmail());
        db.getPstm().setString(4, user.getPassword());
        int ok  = db.executeUpdate();
        return ok;
    }

    @Override
    public int delete(int id) throws Exception {
        db.open();
        String sql = "Delete from user where id = ?";
        db.init(sql);
        db.getPstm().setInt(1,id);
        return 0;
    }


    @Override
    public int update(User user) throws Exception {
        db.open();
        String sql = "UPDATE user set nom = ?,prenom = ?,email = ?,password = ? where id = ?";
        db.init(sql);
        db.getPstm().setString(1,user.getNom());
        db.getPstm().setString(2, user.getPrenom());
        db.getPstm().setString(3, user.getEmail());
        db.getPstm().setString(4, user.getPassword());
        db.getPstm().setInt(4, user.getId());
        int ok  = db.executeUpdate();
        return ok;
    }

    @Override
    public List<User> getAll() throws Exception {
        List<User> users = new ArrayList<User>();
        db.open();
        String sql = "SELECT * from user";
        db.init(sql);
        ResultSet res = db.executeSelect();
        while (res.next())
        {
            User user = new User();
            user.setId(res.getInt(1));
            user.setNom(res.getString(2));
            user.setPrenom(res.getString(3));
            user.setEmail(res.getString(4));
            user.setPassword(res.getString(5));
            users.add(user);
        }
        return users;
    }

    @Override
    public User get(int id) throws Exception {
        User user = null;
        db.open();
        String sql = "SELECT * from user where id = ?";
        db.init(sql);
        db.getPstm().setInt(1,id);
        ResultSet res = db.executeSelect();
        if(res.next())
        {
            user = new User();
            user.setId(res.getInt(1));
            user.setNom(res.getString(2));
            user.setPrenom(res.getString(3));
            user.setEmail(res.getString(4));
            user.setPassword(res.getString(5));

        }
        return user;
    }

    @Override
    public User login(String email, String password) throws Exception {
        User user = null;
        db.open();
        String sql = "SELECT * from user where email = ? and password = ?";
        db.init(sql);
        db.getPstm().setString(1,email);
        db.getPstm().setString(1,password);
        ResultSet res = db.executeSelect();
        if(res.next())
        {
            user = new User();
            user.setId(res.getInt(1));
            user.setNom(res.getString(2));
            user.setPrenom(res.getString(3));
            user.setEmail(res.getString(4));
            user.setPassword(res.getString(5));

        }
        return user;
    }
}
