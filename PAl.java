import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PAl {

	public static void main(String[] args) 
	{
		HibernateUtil.getSessionFactory().openSession();
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Laptop laptop=new Laptop();
		laptop.setHdd("500GB");
		laptop.setCpu("Intel");
		laptop.setRam("samsung");
		session.save(laptop);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
