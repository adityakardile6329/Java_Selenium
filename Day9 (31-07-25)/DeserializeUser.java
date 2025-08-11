package day11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeUser {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Wipro\\user.ser"));
		User user = (User) in.readObject(); // This will fail
		System.out.println("Deserialized");
		user.display();
		in.close();
	}
}