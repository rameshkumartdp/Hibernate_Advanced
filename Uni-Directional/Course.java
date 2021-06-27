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
import javax.persistence.EmbeddedId;
import java.lang.String;
@Entity
@Table(name="CourseTable")
public class Course {

private String courseId;
private int mark;

@Id
public String getCourseId(){
	return courseId;
}

public void setCourseId(String cid){
	this.courseId = cid;
}


@Column(name="mark")
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}

}
