import javax.persistence.Embeddable;
@Embeddable
public class AccountPK implements java.io.Serializable{


public AccountPK(){}

private int account_id;
private String customer_id;


public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) 	{
		this.customer_id = customer_id;
	}
}