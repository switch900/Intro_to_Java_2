package a01029917.comp1451Monday.assignment2.mainDriver;
import a01029917.comp1451Monday.assignment2.database.Bank;
import a01029917.comp1451Monday.assignment2.data.BankCustomer;
import a01029917.comp1451Monday.assignment2.utilities.InputReader;

/**
 * This class is the main class for Bullwinkle's Bank. The ATM class will allow
 * users to access information about the Bank Customers stored in the Bank
 * Class.
 * 
 * @project Assignment 2 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 31, 2017
 *
 */

public class ATM {

	private InputReader reader;
	private Bank currentBank;
	private BankCustomer currentAccount;
	private String accountInput;
	private String passCodeInput;
	private static String ADMIN_PASSCODE = "debug"; // passcode to use to enter debugging mode
	public static String ADMIN_ACCOUNT = "debug"; // account name to use to open debugging mode
	private boolean isVerified;

	/**
	 * Constructor for Game class. Starts the ATM, displays an introduction message,
	 * initializes its internal map, and starts the reader from Input Class.
	 */
	public ATM() {
		introMessage();
		initialize();
		reader = new InputReader();
		run();
	}

	/**
	 * @param args
	 *            - for program arguments (not used) Main method calls the class
	 *            default constructor from ATM class.
	 */
	public static void main(java.lang.String[] args) {
		new ATM();
	}

	/**
	 * Adds Customer references to the Back HashMap as seed data for testing.
	 */
	public void initialize() {
		currentBank = new Bank();
		currentBank.createAccount(new BankCustomer("darby", "dog", "ST-123", "123", 74.17));
		currentBank.createAccount(new BankCustomer("Freckle", "cat", "ST-789", "789", 0.0));
		currentBank.createAccount(new BankCustomer("Myia", "dog", "ST-456", "456", 0.0));
		currentBank.createAccount(new BankCustomer("admin", "admin", ADMIN_ACCOUNT, ADMIN_PASSCODE, 0.0));
	}

	/**
	 * The primary application processor. All application functions are called from
	 * here. Uses a loop to prompt users to perform banking transactions. Must use
	 * switch/case selection to determine uses choices.
	 */
	public void run() {

		printMenu();
		System.out.print("> ");
		int userInput = reader.getIntInput();
		{
			switch (userInput) {
			case 1:
				verifyCustomer();
			case 2:
				transactDeposit();
			case 3:
				transactWithDraw();
			case 4:
				if (isVerified) {
					Bank.displayCustomerInformation(currentAccount);
					run();
				} else {
					System.out.println("You must LOGIN before you can perform a transaction.");
					run();
				}
			case 5:
				System.out.println("Thank you for banking at Bullwinkle's Bank");
				Bank.displayAllCustomers();
				break;
			case 6:
				if (accountInput != null && passCodeInput != null) {
					if (accountInput.equals(ADMIN_ACCOUNT) && passCodeInput.equals(ADMIN_PASSCODE)) {
						System.out.println("DEBUG: Displaying all the acounts in the bank.");
						Bank.displayAllCustomers();
						System.out.println("");
						run();
					}
				}
			case 7:
				if (accountInput != null && passCodeInput != null) {
					if (accountInput.equals(ADMIN_ACCOUNT) && passCodeInput.equals(ADMIN_PASSCODE)) {
						System.out.println("Account to Close: ");
						String accountToClose = reader.getStringInput();
						currentBank.closeAccount(accountToClose);
						Bank.displayAllCustomers();
						System.out.println("");
						run();
					}
				}
			default:
				System.out.println("Not a valid input");
				run();
			}
		}
	}

	/**
	 * Performs a deposit into a BankCustomer's account. Checks to see if the user
	 * has signed in. If not, then verifyCustomer() is called and the menu is
	 * displayed again.
	 */
	public void transactDeposit() {
		if (isVerified) {
			System.out.println("Enter the amount to deposit:");
			double deposit = reader.getDoubleInput();
			currentBank.deposit(currentAccount.getAccountNumber(), deposit);
			run();
		} else {
			notLoggedInError();
		}
	}

	/**
	 * Performs a withdrawal from a BankCustomer's account. Checks to see if the
	 * user has signed in. If not, then verifyCustomer() is called and the menu is
	 * displayed again.
	 */
	public void transactWithDraw() {
		if (isVerified) {
			System.out.println("Enter the amount to withdraw: ");
			double withdraw = reader.getDoubleInput();
			currentBank.withdraw(currentAccount.getAccountNumber(), withdraw);
			run();
		}else {
			notLoggedInError();
		}
	}

	/**
	 * To confirm a BankCustomer's account number and passcode. Called when the user
	 * is required to sign in to the application. Will set a boolean so the user
	 * does not have to sign in again during the session.
	 */
	public void verifyCustomer() {
		System.out.println("Enter Account Number");
		accountInput = reader.getStringInput();
		System.out.println("Enter Password");
		passCodeInput = reader.getStringInput();

		BankCustomer tempAccount = Bank.theBank.get(accountInput);
		if (tempAccount != null) {
			if (passCodeInput.equalsIgnoreCase(tempAccount.getPassCode())) {
				System.out.println("");
				isVerified = true;
				currentAccount = tempAccount;
				run();
			} else {
				logInError();
			}
		} else {
			logInError();
		}
	}

	/**
	 * Print the menu options for ATM Class. If debuging mode is entered will
	 * display additional administrative options.
	 */
	public void printMenu() {

		System.out.println("Choose one of the following options:");
		System.out.println("1 - Sign In");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - Display Account Info");
		System.out.println("5 - Exit");
		if (accountInput != null && passCodeInput != null) {
			if (accountInput.equals(ADMIN_ACCOUNT) && passCodeInput.equals(ADMIN_PASSCODE)) {
				System.out.println("6 - Display Account Info For All Customers");
				System.out.println("7 - Delete Customer Account");
				System.out.println("");
			}
		}
	}

	/**
	 * Print out introduction message.
	 */
	public void introMessage() {
		System.out.println("Welcome to Bullwinkle's Bank.");
		System.out.println("");

	}
	/**
	 * Print out error that user is not logged in and send to account verification process
	 */
	public void notLoggedInError() {
		System.out.println("ERROR: You must LOGIN before you can perform a transaction.");
		verifyCustomer();
	}
	
	/**
	 * Print out error that user has not logged in properly and restart ATM
	 */	
	public void logInError() {
		System.out.println("ERROR: Either account number or passcode is not correct.");
		main(null);
	}
}
