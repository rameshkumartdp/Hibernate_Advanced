import org.hibernate.*;
import org.hibernate.cfg.*;

public class Client {


    public static void main(String args[]) {
        Transaction tr = null;
        Session session = null;

        try {


            Configuration cfg = new Configuration();
            cfg.configure();
            SessionFactory factory = cfg.buildSessionFactory();

            session = factory.openSession();
            tr = session.beginTransaction();

//actual code
            Product product = new Product();

            product.setProductCode("1001");
            product.setProductName("Java Ref");
            product.setPrice(450.20);
            product.setCategoryCode("Book");

//session.save(product);

            Product nProduct = (Product) session.load(Product.class, "1001");

//System.out.println(nProduct.getProductName()+ " : "+nProduct.getPrice());

            nProduct.setPrice(100.50);

            session.saveOrUpdate(nProduct);

            session.delete(nProduct);

            tr.commit();

        } catch (Exception e) {
            System.out.println(e);
            try {
                tr.rollback();
            } catch (Exception he) {
                System.out.println("Rollbacking the transactions..." + he);
            }
        } finally {
            try {
                session.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }//finally

    }//main

}//class