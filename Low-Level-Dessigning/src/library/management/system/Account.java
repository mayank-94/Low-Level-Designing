package library.management.system;

public abstract class Account {
	protected String accountId;
	protected String password;
	protected Person person;
	protected AccountStatus accountStatus;
	
	public abstract boolean resetPassword();
}
