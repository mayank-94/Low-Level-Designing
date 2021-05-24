package library.management.system;

public class Librarian extends Account{
	
	public Boolean addBookItem(final BookItem bookItem) {
		return true;
	}
	
	public Boolean blockMember(final Member member) {
		return false;
	}
	
	public Boolean unBlockMember(final Member member) {
		return false;
	}
	
	@Override
	public boolean resetPassword() {
		return false;
	}
}
