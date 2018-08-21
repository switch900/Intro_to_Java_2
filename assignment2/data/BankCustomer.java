package a01029917.comp1451Monday.assignment2.data;
/**
 * Part of Bullwinkle's Bank. This Class constructs new Bank Customers and
 * confirms that parameters are valid.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 */

public class BankCustomer {

	private String firstName;
	private String lastName;
	private String accountNumber;
	private String passCode;
	private double balance;

	/**
	 * Default constructor for a BankCustomer.
	 */
	public BankCustomer() {
	}

	/**
	 * Constructor to create new Bank Customer
	 * 
	 * @param firstName
	 *            - String to initialize the firstName field
	 * @param lastName
	 *            - String to initialize the lastName field
	 * @param accountNumber
	 *            - String to initialize the accountNumber field
	 * @param passcode
	 *            - String to initialize the passcode field
	 */
	public BankCustomer(String firstName, String lastName, String accountNumber, String passCode, double balance) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPassCode(passCode);
		setBalance(balance);
	}

	/**
	 * Accessor method for the firstName field
	 * 
	 * @return the firstName as a String
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Mutator for the firstName field
	 * 
	 * @param the
	 *            - firstName to set as a String
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && !firstName.trim().isEmpty()) {
			firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
			this.firstName = firstName;
		}
	}

	/**
	 * Accessor method for the lastName field
	 * 
	 * @return the lastName as a String
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Mutator for the lastName field
	 * 
	 * @param lastName
	 *            - the lastName to set as a String
	 */
	public void setLastName(String lastName) {
		if (lastName != null && !lastName.trim().isEmpty()) {
			lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
			this.lastName = lastName;
		}
	}

	/**
	 * Accessor method for the accountNumber field
	 * 
	 * @return the accountNumber as a String
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Mutator method for the accountNumber field
	 * 
	 * @param accountNumber
	 *            - the accountNumber to set as a String
	 */
	public void setAccountNumber(String accountNumber) {
		if (accountNumber != null && !accountNumber.trim().isEmpty()) {
			this.accountNumber = accountNumber;
		}
	}

	/**
	 * Accessor method for the passCode field
	 * 
	 * @return the passCode as a String
	 */
	public String getPassCode() {
		return passCode;
	}

	/**
	 * Mutator method for the passCode field
	 * 
	 * @param passCode
	 *            - the passCode to set as a String
	 */
	public void setPassCode(String passCode) {
		if (passCode != null && !passCode.trim().isEmpty()) {
			this.passCode = passCode;
		}
	}

	/**
	 * Accessor method for the balance field
	 * 
	 * @return the balance as a double
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Mutator method for the balance field
	 * 
	 * @param balance
	 *            - the balance to set as a double
	 */
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	/**
	 * Adds to the BankCustomer's balance
	 * 
	 * @param amount
	 *            - a double to add to the existing balance field
	 */
	public void addToBalance(double amount) {
		if (amount >= 0) {
			balance = getBalance();
			balance = balance + amount;
		}
	}

	/**
	 * Subtracts from the BankCustomer's balance
	 * 
	 * @param amount
	 *            - a double to subtract from the balance field
	 */
	public void subtractFromBalance(double amount) {

		balance = getBalance();
		if (amount >= 0 && amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("You don't have that much money in your account!");
			System.out.println("");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankCustomer [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", passCode=" + passCode + ", balance=" + balance + "]";
	}


}
