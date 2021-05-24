package parking.lot;

public class ParkingAttendant extends Account{
	
	private Payment paymentService;
	
	public Boolean processVehicleEntry(final Vehicle vehicle) {
		return true;
	}
	
	public PaymentInfo processPayment(final ParkingTicket parkingTicket, final PaymentType type) {
		return new PaymentInfo();
	}
}
