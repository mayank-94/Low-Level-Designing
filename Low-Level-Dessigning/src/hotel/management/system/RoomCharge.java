package hotel.management.system;

public class RoomCharge implements BaseRoomCharge{
	private Double cost;
	
	@Override
	public Double getCost() {
		return cost;
	}
	
	public void setCost(final Double cost) {
		this.cost = cost;
	}

}
