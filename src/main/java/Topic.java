import Entity.History;
import Entity.Users;
import Hibernate.Factory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.SQLException;

import static java.lang.System.exit;

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
        Factory.getInstance().getUserDA0().addUserName(user);}
    void addHistory() throws SQLException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Откуда начал?");
        String str = sc.nextLine();
        System.out.println("Где закончил?");
        String str2 = sc.nextLine();
        Date now = new Date();
        String reportDate = df.format(now);
        double tempDistance = random.nextDouble();
        History history = new History(tempDistance,reportDate);
        Factory.getInstance().getUserDA0().addHistory(history);
    }
    void showUserHistory() throws SQLException {
        System.out.println(Factory.getInstance().getUserDA0().getAllofHistory());
    }

}
