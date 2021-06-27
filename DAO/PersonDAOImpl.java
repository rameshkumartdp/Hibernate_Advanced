import org.hibernate.*;
import org.hibernate.cfg.*;


public class PersonDAOImpl implements PersonDAO {

    public boolean createPerson(Person p) {

        boolean b = false;
        try {
            Session session = HibernateUtil.currentSession();
            Transaction tr = session.beginTransaction();

            session.save(p);
            tr.commit();
            b = true;
        } catch (Exception e) {
            System.out.println(e);
        }


        return b;
    }

    public boolean updatePerson(Person p) {

        boolean b = false;
        try {
            Session session = HibernateUtil.currentSession();
            Transaction tr = session.beginTransaction();
            session.saveOrUpdate(p);

            tr.commit();
            b = true;
        } catch (Exception e) {
            System.out.println(e);
        }


        return b;
    }

    public boolean deletePerson(int id) {

        boolean b = false;
        try {
            Session session = HibernateUtil.currentSession();
            Transaction tr = session.beginTransaction();
            Person p = (Person) session.load(Person.class, new Integer(id));

            session.delete(p);
            tr.commit();
            b = true;
        } catch (Exception e) {
            System.out.println(e);
        }


        return b;
    }

    public Person findPerson(int id) {
        Person p = null, p1 = new Person();
        try {
            Session session = HibernateUtil.currentSession();
            Transaction tr = session.beginTransaction();
            p = (Person) session.load(Person.class, new Integer(id));
            p1.setFirstname(p.getFirstname());
            p1.setLastname(p.getLastname());
            p1.setAge(p.getAge());
            p1.setPerson_id(p.getPerson_id());

            tr.commit();

            session.close();
        } catch (Exception e) {
        }

        return p;
    }


}
