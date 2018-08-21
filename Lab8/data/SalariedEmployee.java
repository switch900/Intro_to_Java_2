package a01029917.comp1451.lab8.data;

/**
 * SalariedEmployee is a subclass to Employee class. It is part of Lab 8.
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8, 2017
 */

public class SalariedEmployee extends Employee {
	// instance variable
	private double yearlySalary;
	public int weeksWorked;

	/**
	 * default constructor
	 */
	public SalariedEmployee() {
	}

	/**
	 * main constructor for objects of SalariedEmployee class
	 */
	public SalariedEmployee(String name, double yearlySalary, int weeksWorked) {
		super(name);
		setYearlySalary(yearlySalary);
		setWeeksWorked(weeksWorked);
	}

	/**
	 * Get the employee's yearly salary
	 * 
	 * @return the yearlySalary as a double
	 */
	public double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * Set the employee's yearly salary if yearly salary is greater than or equal to
	 * 0.
	 * 
	 * @param yearlySalary
	 *            the yearlySalary to set
	 */
	public void setYearlySalary(double yearlySalary) {
		if (yearlySalary >= 0) {
			this.yearlySalary = yearlySalary;
		}
	}

	/**
	 * Get the weeks worked in a year by the employee
	 * 
	 * @return the weeksWorked as int
	 */
	public int getWeeksWorked() {
		return weeksWorked;
	}

	/**
	 * Set the weeks worked in a year by the employee if the weeks worked is greater
	 * than or equal to 0.
	 *
	 * @param weeksWorked
	 *            the weeksWorked to set
	 */
	public void setWeeksWorked(int weeksWorked) {
		if (weeksWorked >= 0) {
			this.weeksWorked = weeksWorked;
		}
	}

	/**
	 * calculate monthly earnings for a salaried employee. Monthly earnings equal
	 * the employee's yearly salary divided by the weeks worked multiplied by the
	 * amount of weeks in a year divided by the amount of months in a year
	 * 
	 * @return monthlyEarning as a double
	 */
	@Override
	public double calculateMonthlyEarnings() {
		double monthlyEarning = (yearlySalary / weeksWorked) * (52 / 12);
		return monthlyEarning;
	}

	/**
	 * Displays the employee name, monthly earnings, weeks worked and salary
	 */
	public void printEmployeeDetails() {
		System.out.println("Name: " + getEmployeeName());
		System.out.println(String.format("%s%.2f", "Yearly Salary: $", yearlySalary));
		System.out.println("Weeks Worked: " + weeksWorked);
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
		return "SalariedEmployee [yearlySalary=" + yearlySalary + ", weeksWorked=" + weeksWorked + "]";
	}

}
