package parking.lot;

public class Admin extends Account{
	
	public Boolean addParkingFloor(final ParkingLot lot, final ParkingFloor floor) {
		return true;
	}
	
	public Boolean addParkingSpace(final ParkingFloor floor, final ParkingSpace space) {
		return true;
	}
}
