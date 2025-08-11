package day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		Student s1 = new Student("Alex", 23);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Wipro\\student.ser"))) {
			out.writeObject(s1);
			System.out.println("Object Serialized to student.ser");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
