import org.hibernate.*;
import org.hibernate.cfg.*;

public class HClient {

    public static void main(String args[]) {

        try {

            AnnotationConfiguration cfg = new AnnotationConfiguration();

            cfg.setListener("post-insert", new AccountUpdateListener());

            cfg.configure();

            SessionFactory fact = cfg.buildSessionFactory();

            Session session = fact.openSession();

            System.out.println("Session opened...");
            Transaction tr = session.beginTransaction();

            Account account = new Account();

            account.setCustomer_id("1200");
            account.setAmount(4500.10);
            account.setAccount_type("Savings");

            session.save(account);

            tr.commit();
            session.close();

        } catch (Exception e) {

            System.out.println(e);
        }

    }
}