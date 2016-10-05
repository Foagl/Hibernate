package Hibernate;

import Hibernate.DAO.UserDAO; //
import Hibernate.DAO.UserDAOimpl;

public class Factory { // Создание объекта
    private static UserDAO userDA0 = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
    public UserDAO getUserDA0(){
        if (userDA0 == null){
            userDA0 = new UserDAOimpl();
        }
        return userDA0;
    }
}

