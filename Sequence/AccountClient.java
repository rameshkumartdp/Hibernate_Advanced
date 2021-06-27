import org.hibernate.*;
import org.hibernate.cfg.*;

public class AccountClient {


    public static void main(String args[]) {

        try {

            AnnotationConfiguration conf = new AnnotationConfiguration();

            conf.configure();

            SessionFactory fact = conf.buildSessionFactory();

            Session session = fact.openSession();

            Transaction tr = session.beginTransaction();

            //actual code

            Account account = new Account();

            account.setAmount(4500.20);
            account.setCustomer_id("SBI45052");
            account.setAccount_type("Savings");

            session.save(account);


            tr.commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}