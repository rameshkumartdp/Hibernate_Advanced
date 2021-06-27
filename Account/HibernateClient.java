import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.*;
import org.hibernate.Criteria;
import java.sql.*;

import java.util.*;

public class HibernateClient {

static Session session=null;

public static void main(String args[]){

try
{
	
	AnnotationConfiguration conf=new AnnotationConfiguration();

	conf.configure();

	SessionFactory fact=conf.buildSessionFactory();

	System.out.println("Session factory is buid");

	session=fact.openSession();

	System.out.println("Session created");	

	Transaction tr=session.beginTransaction();

HibernateAccountPOJO pojo=new HibernateAccountPOJO();

pojo.setAccount_id(1006);
pojo.setAccount_type("Current");
pojo.setAmount(89500);
pojo.setCustomer_id("569");

//session.save(pojo);

HibernateAccountPOJO account=(HibernateAccountPOJO)session.load(HibernateAccountPOJO.class,8905);


System.out.println("Amount "+account.getAmount());

System.in.read();

session.refresh(account);

System.out.println("Amount "+account.getAmount());

//session.evict(account);

//account.setAmount(4022);

//System.out.println(account.getClass());

//session.saveOrUpdate(account);



tr.commit();
	
}
catch(Exception e){
try
{
	session.close();
}
catch(HibernateException ee){

System.out.println(ee);
}

System.out.println(e);
}




}


}