package parking.lot;

import java.util.Date;

public class ParkingTicket {
	private Integer ticketId;
	private Integer spaceId;
	private Integer levelId;
	private Date entryDateTime;
	private Date exitDateTime;
	private Double totalCost;
	private ParkingSpaceType spaceType;
	private ParkingTicketStatus ticketStatus;
	
	public void updateTotalCost() {}
	
	public void updateExitTime(final Date exitTime) {}
	
}
