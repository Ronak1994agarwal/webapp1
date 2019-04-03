package Learning.MavenTest;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class FetchDateAction {
	 
	public static void main(String args[])
	{
		SessionFactory sessionfactory=new AnnotationConfiguration().configure("maven.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Query query=session.createQuery("from Hiberframe1");
		@SuppressWarnings("unchecked")
		List<Hiberframe1> l=query.list();
		
		Iterator<Hiberframe1> iterator=l.iterator();
		
		while (iterator.hasNext()) {
			
			Hiberframe1 hiberframe1 = (Hiberframe1) iterator.next();
			System.out.println(hiberframe1.getUid());
			System.out.println(hiberframe1.getFname());
			System.out.println(hiberframe1.getLname());
			System.out.println(hiberframe1.getEmail());
			System.out.println(hiberframe1.getPwd());
			
		}
		
		session.getTransaction().commit();
		System.out.println("Data successfully fetched");
		session.close();
	}
}
