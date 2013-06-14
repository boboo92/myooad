package code;

import javax.persistence.Entity;

import edu.fudan.ss.persistence.hibernate.common.IPersistenceManager;
import edu.fudan.ss.persistence.hibernate.demo.NormalCourse;
import edu.fudan.ss.persistence.hibernate.demo.Teacher;

@Entity
public class Course {
	private String courseId;
	private String courseName;
	private String place;
	private int limit;
	
	public static Course create(Teacher teacher, String name, IPersistenceManager pm) {
		NormalCourse result = new NormalCourse();
		result.setTeacher(teacher);
		result.setName(name);
		pm.save(result);
		return result;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
