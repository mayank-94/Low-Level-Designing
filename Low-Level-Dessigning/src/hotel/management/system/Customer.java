package hotel.management.system;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
	private Search search;
	private Booking booking;
	
	public List<RoomBooking> getAllRoomBooking(){
		return new ArrayList<>();
	}
}
