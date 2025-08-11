package project3;

import java.util.ArrayList;

public class RegistrationManager {
	private ArrayList<Student> students;
	private ArrayList<Course> courses;

	public RegistrationManager() {
		students = new ArrayList<>();
		courses = new ArrayList<>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public void addCourse(Course c) {
		courses.add(c);
	}

	public Student findStudentById(int id) {
		for (Student s : students) {
			if (s.id == id) {
				return s;
			}
		}
		return null;
	}

	public Course findCourseByCode(String code) {
		for (Course c : courses) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;
	}
}