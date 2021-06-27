import java.io.Serializable ;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;

/*
CREATE TABLE Hiber_Person(
	person_id number(4) CONSTRAINT cn_pk_Person PRIMARY KEY,
	age	number(3),
	firstname  	varchar2(20),
	lastname	varchar2(20)
);
*/


@Entity
@Table(name = "HIBER_PERSON")

public class Person implements Serializable {

	private Integer person_id;

	private Integer age;

	private String firstname;

	private String lastname;

	public Person() {

	}

	@Id
	public Integer getPerson_id() {
		return this.person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id= person_id;
	}

	@Column(name = "AGE")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age =age ;
	}

	@Column(name = "FIRSTNAME")
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname =firstname ;
	}

	@Column(name = "LASTNAME")
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname =lastname ;
	}

}
