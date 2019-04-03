package Learning.MavenTest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class DeleteDataAction {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=new AnnotationConfiguration().configure("maven.cfg.xml").buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction trx = 	session.beginTransaction();
		
		try
		{
						Query query=session.createQuery("delete from Hiberframe1 where id=:i");
						query.setParameter("i",9);
						int i=query.executeUpdate();
						if(i>0)
						{
							System.out.println("Record successfully deleted");
						}
						else
						{
							System.out.println("Record not deleted");
						}
						trx.commit();
						
		}
		catch (Exception e) {
			trx.rollback(); //cancel the transaction 
		}
		
		session.close();
		
		
		}

}
