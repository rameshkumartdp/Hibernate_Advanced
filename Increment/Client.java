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

    public static void main(String hh[]) {

        try {


            Session sess = HibernateUtil.currentSession();

            Transaction tr = sess.beginTransaction();

            INCAccount account = new INCAccount();

            account.setCustomer_id("4899");
            account.setAmount(4500.20);
            account.setAccount_type("Savings");

            Integer in = (Integer) sess.save(account);

            System.out.println(in);
            tr.commit();
            sess.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}