import org.hibernate.annotations.*;
import org.hibernate.validator.*;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
@Entity
@Table(name = "HibernateAccount")

public class Account {

	private double amount;
	private String account_type;
	private AccountPK accPK;


@EmbeddedId 
public AccountPK getAccPK(){
	return accPK;
}
public void setAccPK(AccountPK accpk){
accPK=accpk;
}	

@Column(name = "Account_Type")
@NotNull
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



}