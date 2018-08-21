/**
 * Instructor class is part of Lab 5b. It is a subclass of Database class.
 * 
 * @project Lab 5B - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 21, 2017
 */

public class Instructor extends Database {

	private double hourlyWage;

	/**
	 * default constructor for Instructor class
	 */
	public Instructor() {
	}

	/**
	 * Constructor to initialize parameters inherited from Database class plus sets hourlyWage
	 * 
	 * @param firstName
	 *            as String
	 * @param lastName
	 *            as String
	 * @param emailAddress
	 *            as String
	 * @param bCIT_ID
	 *            as String
	 * @param hourlyWage
	 *            as double
	 */

	public Instructor(String firstName, String lastName, String emailAddress, String BCIT_ID, double hourlyWage) {
		super(firstName, lastName, emailAddress, BCIT_ID);
		setHourlyWage(hourlyWage);
	}

	/**
	 * Retrieve the hourly wage
	 * 
	 * @return the hourlyWage as a double
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * Set the value of hourlyWage
	 * 
	 * @param hourlyWage
	 *            a variable of type double
	 */
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
}
