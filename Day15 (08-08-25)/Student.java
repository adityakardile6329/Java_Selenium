package project3;

import java.util.ArrayList;

public class Student extends Person implements Registrable {
	private ArrayList<Course> registeredCourses;

	public Student(String name, int id) {
		super(name, id);
		registeredCourses = new ArrayList<>();
	}

	@Override
	public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
		for (Course c : registeredCourses) {
			if (c.getCourseCode() == course.getCourseCode()) {
				throw new CourseAlreadyRegisteredException("Already registered for course: " + course.getCourseName());
			}
		}
		registeredCourses.add(course);
		System.out.println(name + " registered for course: " + course.getCourseName());
	}

	@Override
	public void dropCourse(Course course) throws CourseNotFoundException {
		boolean found = false;

		for (Course c : registeredCourses) {
			if (c.getCourseCode() == course.getCourseCode()) {
				registeredCourses.remove(c);
				System.out.println(name + " dropped course: " + course.getCourseName());
				found = true;
				break;
			}
		}

		if (!found) {
			throw new CourseNotFoundException("Course not found in registration list: " + course.getCourseName());
		}
	}

	public ArrayList<Course> getRegisteredCourses() {
		return registeredCourses;
	}
}
