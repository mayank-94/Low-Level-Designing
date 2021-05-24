package parking.lot;

public class Entrance extends Gate {
	public ParkingTicket getParkingTicket(final Vehicle vehicle) {
		return new ParkingTicket();
	}
}
