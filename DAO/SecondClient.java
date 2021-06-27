import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;

public class SecondClient {

    public static void main(String hh[]) {

        try {
            Session session = HibernateUtil.currentSession();
            Transaction tx = session.beginTransaction();

            Person person = new Person();

            Person p = (Person) session.load(Person.class, new Integer(Integer.parseInt(hh[0])), LockMode.UPGRADE_NOWAIT);

            System.out.println(p.getAge());
            System.in.read();
            p.setAge(3333);
            System.out.println(p.getAge());

            tx.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}