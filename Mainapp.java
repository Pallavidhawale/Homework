
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Mainapp {
    public static void main(String[] args) {
       /// Session session = HibernateUtil.getSessionFactory().openSession();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
       // Person person=new Person();
       // person.setName("Pallavi");
        //session.save(person);
        Laptop laptop=new Laptop();
        laptop.setCpu("i7");
        Employee employee=new Employee();
        employee.setName("Pallavi");
        employee.setLaptop(laptop);
        session.save(laptop);
        transaction.commit();
        session.close();           // Optional
        sessionFactory.close();   // Optional
        
        Criteria criteria = session.createCriteria(Laptop.class);
        //Criteria id = criteria.add(Restrictions.eq("id", 1));
        List<Person> list = criteria.list();
        for (Person p:list){
            System.out.println(p);
        }
    }
}

