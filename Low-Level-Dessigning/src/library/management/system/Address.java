package library.management.system;

public class Address {
	private String street;
	private String postalCode;
	private String city;
	private String state;
	private String country;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
}
