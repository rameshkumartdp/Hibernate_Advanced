import java.util.ArrayList;
import java.util.List;

public class Client {

public static void main(String hh[]){


	DAOFactory fact=new DAOFactory();
	PersonDAO dao=fact.getDAO();

	Person p=dao.findPerson(1001);

	System.out.println(p.getAge());

	p.setAge(89);

}


}