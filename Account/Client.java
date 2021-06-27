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

public class Client {

    public static void main(String args[]) {

        try {


            AnnotationConfiguration conf = new AnnotationConfiguration();


            conf.configure();

            SessionFactory fact = conf.buildSessionFactory();

            Session sess = fact.openSession();

            Transaction tr = sess.beginTransaction();

            HibernateAccountPOJO pojo = new HibernateAccountPOJO();

            pojo.setAccount_id(101);
            pojo.setAccount_type("Fixed");
            pojo.setAmount(4500.00);
            pojo.setCustomer_id("651");


            HibernateAccountPOJO account = (HibernateAccountPOJO) sess.load("HibernateAccountPOJO", Integer.parseInt(args[0]));

            System.out.println(account.getAmount());

            account.setAmount(account.getAmount() - Double.parseDouble(args[1]));

            System.out.println("Waiting for the user input...");

            System.in.read();

            System.out.println(account.getAmount());

            Connection con = sess.disconnect();

            System.out.println("No Database Conenction");

//sess.reconnect(con);

//HibernateAccountPOJO account1=(HibernateAccountPOJO)sess.load("HibernateAccountPOJO",Integer.parseInt(args[0]));

            System.out.println(account.getAmount());

            account.setAmount(89000);

            tr.commit();
            sess.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}