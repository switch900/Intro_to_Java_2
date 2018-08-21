package a01029917.comp1451.lab8.data;

/**
 * CommissionEmployee is a subclass to Employee Class. It is part of Lab 8.
 * 
 * @project lab 8 - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version November 8,2017
 */

public class CommissionEmployee extends Employee {
	// instance variable
	private double monthlySalesTotal;
	private double commissionRate;

	/**
	 * default constructor
	 */
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * main constructor for objects of CommissionEmployee class
	 */
	public CommissionEmployee(String name, double monthlySalesTotal, double commissionRate) {
		super(name);
		setMonthlySalesTotal(monthlySalesTotal);
		setCommissionRate(commissionRate);

	}

	/**
	 * Get the employee's commission rate
	 * 
	 * @return the commissionRate as a double
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Set the employee's commission rate if commission rate is greater than or equal to 0.
	 * 
	 * @param commissionRate
	 *            the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate >= 0) {
			this.commissionRate = commissionRate;
		}
	}

	/**
	 * Get the employee's monthly sales total
	 * 
	 * @return the monthlySalesTotal as a double
	 */
	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	/**
	 * Set the employee's monthly sales total if total is greater than or equal to 0.
	 * 
	 * @param monthlySalesTotal
	 *            the monthlySalesTotal to set
	 */
	public void setMonthlySalesTotal(double monthlySalesTotal) {
		if (monthlySalesTotal >= 0) {
			this.monthlySalesTotal = monthlySalesTotal;
		}
	}

	/**
	 * calculate monthly earnings for commissioned employee. Monthly earnings equal
	 * the employee's monthly Sales total times the employee's commission rate
	 * 
	 * @return monthlyEarning as a double
	 */
	@Override
	public double calculateMonthlyEarnings() {
		double monthlyEarning = 0.0;
		if (monthlySalesTotal >= 0) {
			monthlyEarning = monthlySalesTotal * commissionRate;
		}
		return monthlyEarning;
	}

	/**
	 * Displays the employee name, monthly earnings, monthly sales total and
	 * commission rate
	 */
	public void printEmployeeDetails() {
		System.out.println("Name: " + getEmployeeName());
		System.out.println(String.format("%s%.2f", "Monthly Sales Total: $", monthlySalesTotal));
		System.out.println(String.format("%s%.2f", "Commission Rate: ", commissionRate));
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
		return "CommissionEmployee [monthlySalesTotal=" + monthlySalesTotal + ", commissionRate=" + commissionRate
				+ "]";
	}
}
