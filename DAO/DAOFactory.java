public class DAOFactory
{

	public static PersonDAO getDAO(){
	
	
		return new PersonDAOImpl();
		}
	}
		