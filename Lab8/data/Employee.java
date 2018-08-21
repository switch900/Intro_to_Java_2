package a01029917.comp1451.lab8.data;

/**
 * Employee is the parent class to HourlyEmployee, CommissionEmployee and
 * SalariedEmployee. It is part of Lab 8.
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8, 2017
 * 
 */

public abstract class Employee {
	// instance variable
	String employeeName;

	/**
	 * default constructor
	 */
	public Employee() {
	}

	/**
	 * main constructor for objects of Employee Class
	 */
	public Employee(String employeeName) {
		setEmployeeName(employeeName);
	}

	/**
	 * Get the employee's name
	 * 
	 * @return the employeeName as a String
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * Set the employee's name if the name does not equal null.
	 * 
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		if (employeeName != null) {
			this.employeeName = employeeName;
		}
	}

	/**
	 * abstract definition to calculate monthly earnings
	 */
	public abstract double calculateMonthlyEarnings();

	/**
	 * abstract definition to print employee details
	 */
	public abstract void printEmployeeDetails();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + "]";
	}
}