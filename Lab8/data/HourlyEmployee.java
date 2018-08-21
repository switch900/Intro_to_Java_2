package a01029917.comp1451.lab8.data;

/**
 * HourlyEmployee class is a sublass to Employee Class. It is part of Lab 8
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8, 2017
 * 
 */

public class HourlyEmployee extends Employee {
	// instance variable
	private int hoursWorked;
	private final double HOURLY_WAGE = 11.25;

	/**
	 * default constructor
	 */
	public HourlyEmployee() {
	}

	/**
	 * main constructor for objects of HourlyEmployee class
	 */
	public HourlyEmployee(String name, int hoursWorked) {
		super(name);
		setHoursWorked(hoursWorked);

	}

	/**
	 * Get the amount of hours worked by the employee
	 * 
	 * @return the hoursWorked as an int
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * Set the amount of hours worked by the employee if the amount of hours worked
	 * is greater than or equal to 0.
	 * 
	 * @param hoursWorked
	 *            the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked) {
		if (hoursWorked >= 0) {
			this.hoursWorked = hoursWorked;
		}
	}

	/**
	 * calculate monthly earnings for hourly employee
	 * 
	 * @return monthlyEarning as a double
	 */
	@Override
	public double calculateMonthlyEarnings() {
		double monthlyEarning = 0.0;
		if (hoursWorked >= 0) {
			monthlyEarning = hoursWorked * HOURLY_WAGE;
		}
		return monthlyEarning;
	}

	/**
	 * Displays the employee name, monthly earnings and hours worked
	 */
	public void printEmployeeDetails() {
		System.out.println("Name: " + getEmployeeName());
		System.out.println(String.format("%s%.2f", "Hourly Wage: $", HOURLY_WAGE));
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println(String.format("%s%.2f", "Monthly Earning: $", calculateMonthlyEarnings()));
		System.out.println("");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + "]";
	}
}
