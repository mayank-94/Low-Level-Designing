package library.management.system;

import java.util.Date;
import java.util.Objects;

public class Member extends Account{
	
	private Date dateOfMembership;
	private Integer totalBooksCheckout;
	
	@Override
	public boolean resetPassword() {
		return false;
	}
	
	public Boolean checkoutBookItem(final BookItem bookItem) {
		if(this.totalBooksCheckout > Constants.MAX_BOOKS_ISSUED_BY_USER) {
			System.out.println("Member has already checked-out maximum number of books");
			return false;
		}
		
		BookReservation reservation = BookReservation.fetchReservationDetails(bookItem.getBarCode());
		if(Objects.nonNull(reservation) && reservation.getBarCode() != bookItem.getBarCode()) {
			System.out.println("Book already reserved by someone else");
			return false;
		}else if(reservation != null){
			reservation.updateStatus(ReservationStatus.COMPLETED);
		}
		
		return true;
	}
	
	public void checkForFine(final String carCode) {
		
	}

}
