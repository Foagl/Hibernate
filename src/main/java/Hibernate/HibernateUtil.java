package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Valeriy on 04.10.2016.
 */
public class HibernateUtil {
      private static SessionFactory sessionFactory= null;
      static {
          try{
              sessionFactory = new Configuration().configure().buildSessionFactory();
          } catch(Exception e){
              e.printStackTrace();
          }
      }
      public static SessionFactory getSessionFactory() { return sessionFactory; }
}
