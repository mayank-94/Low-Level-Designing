package library.management.system;

import java.util.Date;

public class BookLending {
	private Date dueDate;
	private Date returnDate;
	private String memberId;
	private String barCode;
	
	public static Boolean lendBook(final String barCode, final String memberId) {
		return true;
	}
	
	public static BookLending fetchBookLending(final String barCode) {
		return new BookLending();
	}
}
