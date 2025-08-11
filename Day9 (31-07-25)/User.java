package day11;

import java.io.Serializable;

public class User implements Serializable{
	String username;
	String email;


	public User(String username, String email) {
		this.username = username;
		this.email = email;
		
	}

	public void display() {
		System.out.println("Name: " + username + " Email: " + email);
	}
}
