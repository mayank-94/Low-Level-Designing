package hotel.management.system;

public class RoomServiceCharge implements BaseRoomCharge{
	private Double cost;
	private BaseRoomCharge baseRoomCharge;
	
	@Override
	public Double getCost() {
		baseRoomCharge.setCost(baseRoomCharge.getCost() + cost);
		return baseRoomCharge.getCost();
	}

	@Override
	public void setCost(Double cost) {		
	}
}
