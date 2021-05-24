package library.management.system;

import java.util.Date;

public class BookReservation {
	private Date reservationDate;
	private ReservationStatus status;
	private String memberId;
	private String barCode;
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public ReservationStatus getStatus() {
		return status;
	}
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	public static BookReservation fetchReservationDetails(final String barCode) {
		return new BookReservation();
	}
	
	public void updateStatus(ReservationStatus status) {
		
	}
}
