import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.*;
import org.hibernate.Criteria;

import java.util.*;

public class Client {

public static void main(String hh[]){

try
{

	Session sess=HibernateUtil.currentSession();
	
	Transaction tr=sess.beginTransaction();

	Account ac=new Account();

	AccountPK accPK=new AccountPK();
	accPK.setAccount_id(101);
	accPK.setCustomer_id("451");

	ac.setAccPK(accPK);

	ac.setAccount_type("Savings");
	ac.setAmount(45000.00);

	sess.save(ac);
		
	tr.commit();
	sess.close();

}
catch(Exception e){
System.out.println(e);
}




}


}