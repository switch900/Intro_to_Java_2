package a01029917.comp1451.lab8.utilities;

import a01029917.comp1451.lab8.data.CommissionEmployee;
import a01029917.comp1451.lab8.data.Employee;
import a01029917.comp1451.lab8.data.HourlyEmployee;
import a01029917.comp1451.lab8.data.SalariedEmployee;
import a01029917.comp1451.lab8.database.CompanyB;

/**
 * Main driver class for Lab 8
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8, 2017
 */

public class Lab8Driver {

	/**
	 * Main method for testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}

	/**
	 * initialize a new arrayList from CompanyB and add values to test.
	 */
	public static void test() {
		CompanyB theCompany = new CompanyB();
		Employee employee1 = new HourlyEmployee("Bob", 162);
		theCompany.addEmployee(employee1);
		Employee employee2 = new CommissionEmployee("Dave", 2000.00, 1.25);
		theCompany.addEmployee(employee2);
		Employee employee3 = new SalariedEmployee("Sam", 50000.00, 50);
		theCompany.addEmployee(employee3);
		System.out.println("Current employees are:");
		System.out.println("");
		theCompany.printEmployeeDetails();
		theCompany.removeEmployee(employee1);
		System.out.println("");
		System.out.println("Bob got fired for stealing office stationary.");
		System.out.println("Current employees are:");
		System.out.println("");
		theCompany.printEmployeeDetails();
	}
}
