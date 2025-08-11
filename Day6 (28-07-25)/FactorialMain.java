package day7;
import java.util.Scanner;
public class FactorialMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find a factorial of:");
		int n = sc.nextInt();
		
		FactorialNumber factorialobj = new FactorialNumber();
		 int res = factorialobj.calculateFactorial(n);
		 
		 System.out.println("Factorial of "+n + " is: "+res);
		
		

	}

}
