package day12;

public class LeaveDetails {
	int totalPaidLeaves;
	int totalCasualLeaves;
	int paidLeavesUsed;
	int casualLeavesUsed;

	public LeaveDetails(int totalPaidLeaves, int totalCasualLeaves, int paidLeavesUsed, int casualLeavesUsed) {
		this.totalPaidLeaves = totalPaidLeaves;
		this.totalCasualLeaves = totalCasualLeaves;
		this.paidLeavesUsed = paidLeavesUsed;
		this.casualLeavesUsed = casualLeavesUsed;
	}

	public void display() {
		System.out.println("\n----These are Employee Leave Details:------");

		int remainingPaid = totalPaidLeaves - paidLeavesUsed;
		int remainingCasual = totalCasualLeaves - casualLeavesUsed;

		System.out.println("Total Paid Leaves: " + totalPaidLeaves);
		System.out.println("Paid Leaves Used: " + paidLeavesUsed);
		System.out.println("Remaining Paid Leaves: " + remainingPaid);

		System.out.println("Total Casual Leaves: " + totalCasualLeaves);
		System.out.println("Casual Leaves Used: " + casualLeavesUsed);
		System.out.println("Remaining Casual Leaves: " + remainingCasual);
	}

}
