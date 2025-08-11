package day12;

public class ProjectDetails {
	String proj_1;
	String proj_2;
	String proj_3;

	public ProjectDetails(String proj_1, String proj_2, String proj_3) {
		this.proj_1 = proj_1;
		this.proj_2 = proj_2;
		this.proj_3 = proj_3;
	}

	public void display() {
		System.out.println("\n-----These are Employee Projects Undertaken:-------");
		System.out.println("Project 1: " + proj_1 );
		System.out.println("Project 2: " + proj_2);
		System.out.println("project 3: " + proj_3);

	}

}
