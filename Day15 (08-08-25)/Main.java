package project3;

public class Main {
	public static void main(String[] args) {
		RegistrationManager manager = new RegistrationManager();

		Course course1 = new Course("CS101", "Intro to Programming");
		Course course2 = new Course("MATH101", "Basic Math");

		manager.addCourse(course1);
		manager.addCourse(course2);

		Student student1 = new Student("John", 1);
		manager.addStudent(student1);

		try {
			student1.registerCourse(course1);
			student1.registerCourse(course2);
			student1.registerCourse(course1); 
		} catch (CourseAlreadyRegisteredException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {
			student1.dropCourse(new Course("PHY101", "Physics")); 
		} catch (CourseNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}

		student1.showCourses(); 
	}
}
