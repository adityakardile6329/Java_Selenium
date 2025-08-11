package day6;

class Throw_Throws {
	public static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Acces denied age should be more than 18 years");
		} else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(25);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught " + e.getMessage());

		}
		System.out.println("End of code");
	}
}