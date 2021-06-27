import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderBy;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.EntityResult;
import java.util.*;

@Entity
@Table(name="StudentTable")

public class Student {
private String studentId,studentName,address;
private List<Course> courses=new ArrayList<Course>();



@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="STUDENTID")
@Basic(fetch = FetchType.LAZY)
public List<Course> getCourses() {
	return courses;
}

public void setCourses(List<Course> courses) {
	this.courses = courses;
}
@Column(name="address")
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
@Id
public String getStudentId() {
	return studentId;
}

public void setStudentId(String studentId) {
	this.studentId = studentId;
}
@Column(name="StudentName")
public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}


}
