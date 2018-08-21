package a01029917.comp1451Monday.assignment2.accounts;

/**
 * SavingsAccount class is a subclass to Account class.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 *
 */
public class SavingsAccount extends Account {

	public static final double MIN_AMOUNT = 0;

	public SavingsAccount(double balance, String accountNumber, boolean active) {
		super(balance, accountNumber, active);
	}
}