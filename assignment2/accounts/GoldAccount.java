package a01029917.comp1451Monday.assignment2.accounts;
/**
 * GoldAccount class is a subclass to Account class.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 *
 */
public class GoldAccount extends Account{
	
	private double interestRate;
	private boolean inOverDraft;
	private final double FEE = 5.00;
	private final double OVERDRAFT_AMT = 500.00;

	public GoldAccount(double balance, String accountNumber, boolean active, double interestRate, boolean inOverDraft) {
		super(balance, accountNumber, active);
		setInterestRate(interestRate);
		setInOverDraft(inOverDraft);
	}

	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the inOverDraft
	 */
	public boolean isInOverDraft() {
		return inOverDraft;
	}

	/**
	 * @param inOverDraft the inOverDraft to set
	 */
	public void setInOverDraft(boolean inOverDraft) {
		if(super.balance < OVERDRAFT_AMT) {
		this.inOverDraft = inOverDraft;
	}
	}
}
