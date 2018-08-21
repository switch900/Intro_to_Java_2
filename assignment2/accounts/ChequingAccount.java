package a01029917.comp1451Monday.assignment2.accounts;

/**
 * ChequingAccount class is a subclass to Account class.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 *
 */
public class ChequingAccount extends Account {

	public static final double FEE = 1.0;
	//instance variable
	private int numberOfCheques;

	public ChequingAccount(double balance, String accountNumber, boolean active, int numberOfCheques) {
		super(balance, accountNumber, active);
		setNumberOfCheques(numberOfCheques);
	}

	/**
	 * @return the numberOfCheques
	 */
	public int getNumberOfCheques() {
		return numberOfCheques;
	}

	/**
	 * @param numberOfCheques
	 *            the numberOfCheques to set
	 */
	public void setNumberOfCheques(int numberOfCheques) {
		if (numberOfCheques >= 0) {
			this.numberOfCheques = numberOfCheques;
		}
	}
}
