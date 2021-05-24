package parking.lot;

import java.util.List;

public class ParkingLot {
	private List<Entrance> entrances;
	private List<Exit> exits;
	private List<ParkingFloor> floors;
	private Address address;
	private String parkingLotName;
	
	public Boolean isParkingSpaceAvailable(final Vehicle vehicle) {
		return true;
	}
	
	public Boolean updateParkingAttendant(final ParkingAttendant attendant, final Integer gated) {
		return true;
	}
}
