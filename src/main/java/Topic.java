import Entity.History;
import Entity.Users;
import Hibernate.Factory;
import java.util.Random;
import java.sql.SQLException;
import java.util.Scanner;

public class Topic {
    History history = new History();
    Users user = new Users();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

   public Topic(){ }

    void Login() throws SQLException {
        System.out.println("Enter yours login: ");
        user.setName(sc.nextLine());
        System.out.println("Enter your password: ");
        user.setPass(sc.nextLine());
        Factory.getInstance().getUserDA0().addUserName(user);
        System.out.println("Enter your password: ");
    }
    void Menu()  {

        Login();
        addHistory();

    }

    void addHistory(){
        double temp = 37.2;
        String time = "05.10.2016";
        History history = new History(temp,time);
        Factory.getInstance().getUserDA0().addUserName(history);
    }

}
