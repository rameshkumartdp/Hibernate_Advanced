import java.io.Serializable ;
import org.hibernate.annotations.*;
import org.hibernate.validator.*;
import java.io.Serializable ;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name ="HibernateAccount")
@org.hibernate.annotations.Entity(
		dynamicUpdate =true
)
public class HibernateAccountPOJO {
	private int account_id;
	private double amount;
	private String customer_id,account_type;


	@Id 
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}


	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

@Column(name="Amount")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
@NotNull
@Column(name="Customer_id")
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

}