package day12;

public class ProfessionalDetails {

	int empId;
	String dept;
	String role;
	int exp;

	public ProfessionalDetails(int empId, String dept, String role, int exp) {
		this.empId = empId;
		this.dept = dept;
		this.role = role;
		this.exp = exp;
	}

	public void display() {
		System.out.println("\n-----THis are Employee Professional Details:------");
		System.out.println("Employee ID: " + empId);
		System.out.println("Department: " + dept);
		System.out.println("Designation: " + role);
		System.out.println("Experience: " + exp + " years");
	}

}
