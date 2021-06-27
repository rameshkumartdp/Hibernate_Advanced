import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String hh[]) {

        try {

            Session session = HibernateUtil.currentSession();
            Transaction tr = session.beginTransaction();

            Student std = new Student();
            std.setStudentId("1045");
            std.setStudentName("Deepak");

            std.setAddress("TVM");

            Course c = new Course();

            c.setCourseId("24");
            c.setMark(12);


            Course c1 = new Course();

            c1.setCourseId("27");
            c1.setMark(18);

            std.getCourses().add(c);
            std.getCourses().add(c1);

            session.save(std);
/*
Query query=session.createQuery(" from Course where mark>?");

query.setParameter(0,15);
List<Course> list=query.list();

System.out.println(list.size());

*/





/*
Student std1=(Student)session.load(Student.class,"1045");
System.out.println(std1.getCourses().size());

session.delete(std1);*/


            tr.commit();
            session.close();


        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }


    }


}