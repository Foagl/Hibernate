package Hibernate.DAO;

import Entity.History;
import Entity.Users;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Valeriy on 04.10.2016.
 */
public interface UserDAO {

    public void addUserName(Users users) throws SQLException;// Написать методы для работы с БД
    public void updateUserName(Users users) throws SQLException;
    public void deleteUser(Users users) throws  SQLException;
    public Users giveIdData(int id) throws SQLException;
    public void addHistory(History history) throws SQLException;
    public History getHistory(int id) throws SQLException;
    public void deleteHistory(History history) throws SQLException;
    public List<History> getAllofHistory() throws SQLException;


}
