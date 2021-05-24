package hotel.management.system;

import java.util.Date;
import java.util.List;

public class RoomBooking {
	private Integer bookingId;
	private Date bookingDate;
	private Integer duration;
	private List<Customer> cumstomers;
	private BookingStatus bookingStatus;
	private PaymentStatus paymentStatus;
	private PaymentType paymentType;
	private BaseRoomCharge totalRoomCharge;
}
