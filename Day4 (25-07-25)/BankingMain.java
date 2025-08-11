package day5;

public class BankingMain {

	public static void main(String[] args) {
		InterestCalculator interestCalculator = new InterestCalculator() {
			public double calculateInterest(double principal, double rate, double time) {
				return (principal * rate * time) / 100;
			}
		};
		double interest = interestCalculator.calculateInterest(10000, 5, 2);
		System.out.println("Simple Interest: " + interest);

		EMICalculator emiCalculator = new EMICalculator() {
			public double calculateEMI(double principal, double rate, int time) {
				double r = rate / (12 * 100);
				int n = time * 12; 
				double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
				return emi;
			}
		};
		double emi = emiCalculator.calculateEMI(200000, 8, 5);
		System.out.println("Monthly EMI: " + emi);

		CurrencyConverter currencyConverter = new CurrencyConverter() {
			public double convertINRtoUSD(double amountInINR) {
				return amountInINR / 86.53; 
			}
		};
		double usd = currencyConverter.convertINRtoUSD(10000);
		System.out.println("INR to USD: " + usd);
	}
}