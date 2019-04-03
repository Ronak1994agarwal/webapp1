package Learning.MavenTest;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class UpdateDataAction {
	
	
	public static void main(String args[])
	{
		SessionFactory sessionfactory=new AnnotationConfiguration().configure("maven.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Hiberframe1 hbr=new Hiberframe1();
		String fn1,ln1,email,pwd1;
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("New fname ");
		fn1 = sc.nextLine();
		
		System.out.println("New lname ");
		ln1 = sc.nextLine();
		
		System.out.println("New email ");
		email = sc.nextLine();
		
		System.out.println("New pwd ");
		pwd1 = sc.nextLine();
		
		sc.close();
		
		hbr.setFname(fn1);
		hbr.setLname(ln1);
		hbr.setEmail(email);
		hbr.setPwd(pwd1);
		
		
		Query query=session.createQuery("update Hiberframe1 set email='"+email +"',fname='"+fn1+"',lname='"+ln1+"' where id='10'");
		query.executeUpdate();
		//session.saveOrUpdate(hbr);
		session.getTransaction().commit();
		
		System.out.println("Data sucessfully updated");
		session.close();
		
		
	}
}
