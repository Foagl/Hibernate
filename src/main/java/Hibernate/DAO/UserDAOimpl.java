package Hibernate.DAO;

import Entity.Users;
import Hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class UserDAOimpl implements UserDAO {

@Override
public void addUserName(Users users) throws SQLException{
    Session session = null;
    try {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(users);
        session.getTransaction().commit();
        System.out.println("added complite!"); }
    catch (Exception p){
        System.out.println("Ошибка передачи данных в БД");
    } finally {
        if (session!= null && session.isOpen())
            session.close();
    }
    }

    @Override
    public void updateUserName(Users users) throws SQLException {
        Session session =null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(users);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void deleteUser(Users users) throws SQLException {
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(users);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public Users giveIddata(int id) throws SQLException {
        Users user = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            user = (Users) session.load(Users.class, id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
    // Реализация методов с БД
}
