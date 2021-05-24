package library.management.system;

import java.util.Date;

public class BookItem extends Book {
	private String barCode;
	private Boolean isReferenceOnly;
	private Date borrowedDate;
	private Date dueDate;
	private Double price;
	private BookFormat format;
	private BookStatus status;
	private Date publishDate;
	
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public Boolean getIsReferenceOnly() {
		return isReferenceOnly;
	}
	public void setIsReferenceOnly(Boolean isReferenceOnly) {
		this.isReferenceOnly = isReferenceOnly;
	}
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public BookFormat getFormat() {
		return format;
	}
	public void setFormat(BookFormat format) {
		this.format = format;
	}
	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	public Boolean checkOut(final String memberId, final BookItem bookItem) {
		if(bookItem.isReferenceOnly) {
			System.out.println("This is a reference only book");
			return false;
		}
		
		if(!BookLending.lendBook(bookItem.barCode, memberId)) {
			return false;
		}
		return true;
	}
}
