package day7;

class ControlledThreads extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println(getName() + " - Count: " + i);

			try {

				Thread.sleep(1000); // pause for 1 second

			} catch (InterruptedException e) {

				System.out.println(e);

			}

		}

	}

	public static void main(String[] args) {

		System.out.println("Main thread starts….");

		ControlledThreads t1 = new ControlledThreads();

		ControlledThreads t2 = new ControlledThreads();

		ControlledThreads t3 = new ControlledThreads();

		t1.setName("Worker-1");

		t2.setName("Worker-2");

		t3.setName("Worker-3");

		System.out.println("Starting threads...");

		t1.start();

		try {

			t1.join();

		} catch (InterruptedException e) {

			System.out.println(e);

		}

		t2.start();

		try {

			t2.join();

		} catch (InterruptedException e) {

			System.out.println(e);
		}

		t3.start();

		try {

			t3.join();

		} catch (InterruptedException e) {

			System.out.println(e);
		}

		System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());

		System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

		System.out.println("Is " + t3.getName() + " alive? " + t3.isAlive());

	}

}
