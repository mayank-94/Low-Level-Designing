package library.management.system;

public class Person {
	private String name;
	private String email;
	private String phoneNum;
	private Address address;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNum=" + phoneNum + ", address=" + address + "]";
	}
}
