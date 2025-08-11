package day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUser {
	public static void main(String[] args) throws Exception {
		User user = new User("Alex", "alex@example.com");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Wipro\\user.ser"));
		out.writeObject(user);
		System.out.println("Serialized");
		user.display();
		out.close();

	}
}
