package a01029917.comp1451Monday.assignment2.accounts;
import java.util.ArrayList;
/**
 * Account Class is the parent class for SavingsAccount, ChequingAccount and GoldAccount
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 *
 */
public class Account {
//instance variables
	double balance;
	String accountNumber;
	boolean active;
	ArrayList <String> transactionInformation;
	
	public Account(double balance, String accountNumber, boolean active) {
}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
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
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public void addTransactionInfo(String transactionInfo) {
}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String addTransactionInfo() {
//		return "Account [transactionInformation=" + transactionInformation + "]";
//	}
}