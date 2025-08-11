package day12;

public class SalaryDetails {

	double basic;
	double hra;
	double allowances;
	double deductions;

	public SalaryDetails(double basic, double hra, double allowances, double deductions) {
		this.basic = basic;
		this.hra = hra;
		this.allowances = allowances;
		this.deductions = deductions;
	}

	public void display() {
		double gross = basic + hra + allowances;
		double net = gross - deductions;

		System.out.println("\n---THis are Employee Salary Details:------9");
		System.out.println("Basic Salary: " + basic);
		System.out.println("HRA: " + hra);
		System.out.println("Allowances: " + allowances);
		System.out.println("Deductions: " + deductions);
		System.out.println("Net Salary: " + net);
	}
}
