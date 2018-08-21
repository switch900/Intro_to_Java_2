package a01029917.comp1451Monday.assignment2.database;
import java.util.HashMap;
import java.util.Set;

import a01029917.comp1451Monday.assignment2.data.BankCustomer;
import a01029917.comp1451Monday.assignment2.mainDriver.ATM;

/**
 * Part of Bullwinkle's Bank. This class creates a HashMap of bank customers
 * accounts from the BankCustomer Class.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 */

public class Bank {
	/**
	 * The bank collection to hold all the BankCustomer data. Uses a customer's
	 * account number as the key and the BankCustomer reference as the value
	 */
	public static HashMap<String, BankCustomer> theBank;
	private static double MIN_AMOUNT = 0.0;

	/**
	 * Default constructor for the Bank class. Initializes the HashMap.
	 */
	public Bank() {

		theBank = new HashMap<String, BankCustomer>();
	}

	/**
	 * Adds a new BankCustomer element to the HashMap
	 * 
	 * @param newCustomer
	 *            - The new element to add to the HashpMap using the account number
	 *            as the key and new BankCustomer as the value. Adds a new
	 *            BankCustomer element to the HashMap.
	 */
	public void createAccount(BankCustomer newCustomer) {
		if (newCustomer != null) {
			theBank.put(newCustomer.getAccountNumber(), newCustomer);
		}
	}

	/**
	 * Removes a BankCustomer from the HashMap.
	 * 
	 * @param accountNumber
	 *            - The key of the element to remove from the HashMap.
	 */
	public void closeAccount(String accountNumber) {
		if (accountNumber != null) {
			theBank.remove(accountNumber);
		}
	}

	/**
	 * Gets the BankCustomer from the HashMap and adds a double amount to a
	 * BankCustomer's balance.
	 * 
	 * @param accountNumber
	 *            - The account number of the BankCustomer.
	 * @param amount
	 *            - The amount to add to a BankCustomer's balance.
	 */
	public void deposit(String accountNumber, double amount) {
		if (accountNumber != null && amount >= MIN_AMOUNT) {
			theBank.get(accountNumber).addToBalance(amount);
		}
	}

	/**
	 * Gets the BankCustomer from the HashMap and adds a double amount to a
	 * BankCustomer's balance.
	 * 
	 * @param accountNumber
	 *            - The account number of the BankCustomer.
	 * @param amount
	 *            - The amount to subtract from a BankCustomer's balance.
	 */
	public void withdraw(String accountNumber, double amount) {
		if (accountNumber != null && amount >= MIN_AMOUNT) {
			if (amount <= theBank.get(accountNumber).getBalance()) {
			}
			theBank.get(accountNumber).subtractFromBalance(amount);
		}
	}

	/**
	 * Displays the details of a BankCustomer element in the HashMap. Uses
	 * BankCustomer.toString() implementation.
	 * 
	 * @param customer-
	 *            the BankCustomer chosen to display.
	 */
	public static void displayCustomerInformation(BankCustomer customer) {
		if (customer != null) {
			System.out.println(customer);
		}
	}

	/**
	 * Displays all elements of the HashMap by using BankCustomer.toString()
	 * implementation of each.
	 * 
	 */
	public static void displayAllCustomers() {
		if (theBank.isEmpty() != true) {
			Set<String> values = theBank.keySet();
			for (String index : values) {
				if (index != ATM.ADMIN_ACCOUNT) {
					System.out.println(theBank.get(index).toString());
				}
			}
		} else {
			System.out.println("There are no customers");
			System.out.println("");
		}
	}
}
