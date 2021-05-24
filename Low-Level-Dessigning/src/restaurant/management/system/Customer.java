package restaurant.management.system;

public class Customer extends Person{
	private Search search;
	
	public Reservation reserveTable(final Table table, final Customer customer) {
		return new Reservation();
	}
	
	public Menu getMenu() {
		return new Menu();
	}
}
