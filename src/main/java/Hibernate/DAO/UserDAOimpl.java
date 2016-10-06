package Hibernate.DAO;

import Entity.History;
import Entity.Users;
import Hibernate.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
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
         Session session = null;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(users);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Override
    public Users giveIdData(int id) throws SQLException {
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
    @Override
    public void addHistory(History history) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(history);
            session.getTransaction().commit();
            System.out.println("added complite!"); }
        catch (Exception p){
            System.out.println("Ошибка передачи данных в БД(История)");
        } finally {
            if (session!= null && session.isOpen())
                session.close();
        }
    }
    @Override
    public History getHistory(int id) throws SQLException{
        History history = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
             history = (History) session.load(History.class, id);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return history;
    }
    @Override
    public void deleteHistory(History history) throws SQLException {
        Session session = null;

        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(history);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    @Override
    public List<History> getAllofHistory()  {
        Session session = null;          // Добавление всех элемнетов в один объект
        List<History> history = new ArrayList<History>();
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            history = session.createCriteria(History.class).list();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return history;
    }

}
