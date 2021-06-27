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


            Session session = HibernateUtil.currentSession();

            Transaction tr = session.beginTransaction();

            int accountid = Integer.parseInt(hh[0]);

            double amount = Double.parseDouble(hh[1]);

            INCAccount account = (INCAccount) session.load(INCAccount.class, accountid, LockMode.UPGRADE_NOWAIT);

            System.out.println(account.getAmount());

            System.in.read();

            account.setAmount(account.getAmount() - amount);

            System.out.println(account.getAmount());

            tr.commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}