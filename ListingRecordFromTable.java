
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class ListingRecordFromTable {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM Laptop");
        ((org.hibernate.query.Query) query).setString("name", "Tarkesh");
         List lst=((org.hibernate.query.Query) query).list();
         for(Object obj:lst){
             System.out.println(obj);
         }
    }
}
