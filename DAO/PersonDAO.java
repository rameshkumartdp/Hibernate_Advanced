
public interface PersonDAO {

    public boolean createPerson(Person p);

    public boolean deletePerson(int id);

    public boolean updatePerson(Person p);

    public Person findPerson(int id);

}
	