package day7;

class BankAccount_1 {
	private int account_Balance = 2000;

	public synchronized void withdraw(int amount, String user) {
		System.out.println(user + " is trying to withdraw " + amount);
		if (account_Balance >= amount) {
			System.out.println(user + " Withdrawl approved");

			account_Balance = account_Balance - amount;
			System.out.println(user + " completed withdrawl ");
			System.out.println("Remaining balance " + account_Balance);
		} else {
			System.out.println(user + "Withdrawl denied insufficient funds");
		}
	}
}

public class AccountWorking {

	public static void main(String[] args) {
		BankAccount_1 ba = new BankAccount_1();

		Thread t1 = new Thread(() -> {
			ba.withdraw(1500, "User1-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			ba.withdraw(600, "User-2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}
