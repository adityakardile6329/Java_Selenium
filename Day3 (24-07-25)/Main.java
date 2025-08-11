package Day4;

public class Main {
	public static void main(String[] args) {

		Order physical = new PhysicalProductOrder("1234");
		physical.process_order();
		physical.print_order_summary();
		System.out.println();

		Order digital = new DigitalProductOrder("9999");
		digital.process_order();
		digital.print_order_summary();
		System.out.println();

		Order service = new ServiceOrder("7575");
		service.process_order();
		service.print_order_summary();

	}
}