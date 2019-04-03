package Learning.MavenTest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class DataAction {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=new AnnotationConfiguration().configure("maven.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Hiberframe1 hbr=new Hiberframe1();
		hbr.setFname("Ronak");
		hbr.setLname("Agarwal");
		hbr.setEmail("ronakagarwal123@gmail.com");
		hbr.setPwd("ronak12345");
		
		session.saveOrUpdate(hbr);
		session.getTransaction().commit();
		
		System.out.println("Data sucessfully inserted");
		session.close();
		
	}

}
