package restaurant.management.system;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends Employee{
	
	private Search search;
	
	public Table bookTable(final Customer customer) {
		return new Table();
	}
	
	public List<Customer> searchCustomer(final String name){
		return new ArrayList<Customer>();
	}
}
