package day10;

class Customer {

	private String customerId;
	private String customerName;
	private long customerContact;
	private String customerLocation;

	public Customer(String customerId, String customerName, long customerContact, String customerLocation) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerLocation = customerLocation;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	@Override
	public String toString() {
		return "Customer{" + "customerId='" + customerId + ", customerName='" + customerName + ", customerContact='"
				+ customerContact + ", customerLocation='" + customerLocation + '}';
	}
}