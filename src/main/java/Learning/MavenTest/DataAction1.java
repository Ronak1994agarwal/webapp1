package Learning.MavenTest;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class DataAction1 {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=new AnnotationConfiguration().configure("maven.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		Hiberframe1 hbr=new Hiberframe1();
		String fn,ln,email,pwd;
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("fname ");
		fn = sc.nextLine();
		
		System.out.println("lname ");
		ln = sc.nextLine();
		
		System.out.println("email ");
		email = sc.nextLine();
		
		System.out.println("pwd ");
		pwd = sc.nextLine();
		
		sc.close();
		
		hbr.setFname(fn);
		hbr.setLname(ln);
		hbr.setEmail(email);
		hbr.setPwd(pwd);
		
		session.saveOrUpdate(hbr);
		session.getTransaction().commit();
		
		System.out.println("Data sucessfully inserted");
		session.close();
		
	}

}
