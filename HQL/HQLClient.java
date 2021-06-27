import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.*;
import org.hibernate.Criteria;

import java.util.*;

public class HQLClient {

    public static void main(String hh[]) {

        try {


            Session sess = HibernateUtil.currentSession();

            Transaction tr = sess.beginTransaction();

            Query query = sess.createQuery("from Account where amount>:amount");
            query.setDouble("amount", 15000.00);
            List<Account> list = query.list();


            Criteria c = sess.createCriteria(Account.class);
            c.add(Restrictions.gt("amount", new Double(20000.00)));
            List clist = c.list();

            Account ac = (Account) clist.get(0);
            System.out.println(ac.getAmount());


        } catch (Exception e) {
            System.out.println(e);
        }


    }


}