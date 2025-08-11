package Day4;

public abstract class Order {
	protected String order_id;

	// constructor
	public Order(String order_id) {
		this.order_id = order_id;
	}

	// Abstract Method
	abstract void process_order();

	// concrete Method
	void print_order_summary() {
		System.out.println("Order"+" "+ order_id +" "+ "summary printed");
	}

}
