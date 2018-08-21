package a01029917.comp1451.lab8.database;

import java.util.ArrayList;

import a01029917.comp1451.lab8.data.Employee;

/**
 * Company creates an ArrayList of employees. It is part of Lab 8
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8, 2017
 * 
 */
public class CompanyB {

	public ArrayList<Employee> theCompany;

	/**
	 * constructor for Company class. creates a new ArrayList of Employees
	 */
	public CompanyB() {
		theCompany = new ArrayList<Employee>();
	}

	/**
	 * Adds an employee to Company database if employee does not equal null.
	 * 
	 * @param employee
	 *            to be added to the list
	 */
	public void addEmployee(Employee employee) {
		if (employee != null) {
			theCompany.add(employee);
		}
	}

	/**
	 * Removes Employee from database if employee does not equal null
	 * 
	 * @param employee
	 *            to be removed from the list
	 */
	public void removeEmployee(Employee employee) {
		if (employee != null) {
			theCompany.remove(employee);
		}
	}

	/**
	 * Displays the Employees information
	 */
	public void printEmployeeDetails() {
		for (Employee index : theCompany) {
			index.printEmployeeDetails();

		}
	}
}