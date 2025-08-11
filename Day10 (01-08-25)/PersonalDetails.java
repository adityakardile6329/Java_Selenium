package day12;

public class PersonalDetails {
	String name;
	String address;
	String gender;
	int age;

	public PersonalDetails(String name, String address, String gender, int age) {
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}

	public void display() {
		System.out.println("\n------THis are Employeee Personal details:-----");
		System.out.println("Employee name: " + name);
		System.out.println("Employee address: " + address);
		System.out.println("Employee gender: " + gender);
		System.out.println("Employee age: " + age);

	}

}
