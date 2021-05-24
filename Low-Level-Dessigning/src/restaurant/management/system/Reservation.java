package restaurant.management.system;

import java.time.LocalDate;

public class Reservation {
	private Integer reservationId;
	private LocalDate dateTime;
	private Table table;
	private Customer customer;
	private String note;
	private Integer capacity;
	private LocalDate checkInTime;
}
