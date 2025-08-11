package day10;

import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();

		customers.add(new Customer("C001", "Kunal", 5478415247L, "Pune"));
		customers.add(new Customer("C002", "Makarand", 5781236547L, "Balewadi"));
		customers.add(new Customer("C003", "Dhiraj", 8965471256L, "Baner"));
		customers.add(new Customer("C004", "Kalpesh", 2365478954L, "Koregaon Park"));
		customers.add(new Customer("C005", "Sanket", 2365471245L, "Kharadi"));
		customers.add(new Customer("C006", "Yash", 4521304587L, "Hinjewadi"));

		System.out.println("Added list of customer:");
		for (Customer c : customers) {
			System.out.println(c);
		}

		if (customers.size() > 3) {
			customers.remove(3);
		}

		System.out.println("");
		System.out.println("After removing element at index 3:");
		for (Customer c : customers) {
			System.out.println(c);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the customer ID to search: ");
		String searchId = sc.nextLine();

		Iterator<Customer> iterator = customers.iterator();
		iterator = customers.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			Customer c = iterator.next();
			if (c.getCustomerId().equals(searchId)) {
				System.out.println("\nCustomer " + searchId + " found:");
				System.out.println("Name: " + c.getCustomerName());
				System.out.println("Location: " + c.getCustomerLocation());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Customer C003 not found in the list.");
		}
	}
}