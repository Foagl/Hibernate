import Entity.History;
import Entity.Users;
import Hibernate.Factory;

import javax.xml.crypto.Data;
import java.util.*;
import java.text.DateFormat;


import java.sql.SQLException;

public class EnterPoint {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws SQLException {
        int select = 0;
        Topic topic = new Topic();
        History history = new History();
        Users user = new Users();
        // start
        topic.Login();
        while (select != 999){
            System.out.println("Ваше меню:");
            System.out.println("1.Ввести данные о поездке.");
            System.out.println("2.Посмотреть мою историю");
            System.out.println("3.Лучшие результаты");
            select = sc.nextInt();
        switch (select){
            case 1: topic.addHistory();
                 break;
            case 2: topic.showUserHistory();
                 break;
            case 3: //topic
                break;
        }
        }


        //topic.
        //Factory.getInstance().getUserDA0().giveIdData(2);




 }
}
