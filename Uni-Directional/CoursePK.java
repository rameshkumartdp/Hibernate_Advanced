	import java.io.Serializable ;
	import javax.persistence.Embeddable;

	@Embeddable
	public class CoursePK implements Serializable {

	private String studentId;

	private String courseId;

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId= studentId;
	}

	public String getCourseId() {
		return this.courseId;
	}

	public void setCourseId(String CourseId) {
		this.courseId =CourseId ;
	}


}