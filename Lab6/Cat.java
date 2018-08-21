/**
 * Cat class is part of Lab 6a-6b. It is a subclass of Animal class
 * 
 * @project Lab 6a - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 24, 2017
 */

public class Cat extends Animal {
	// instance variable
	private boolean hunts;

	/**
	 * Default constructor
	 */
	public Cat() {
	}

	/**
	 * Constructor for objects of Cat Class. Sets breed and weight from parent class
	 * and sets hunts from instance variable
	 * 
	 * @param breed
	 *            to set the breed field
	 * @param weight
	 *            to set the weight field
	 * @param hunts
	 *            to set the hunts field
	 */
	public Cat(String breed, double weightInKilos, boolean hunts) {
		super(breed, weightInKilos);
		setHunts(hunts);
	}

	/**
	 * Get if the Cat hunts
	 * 
	 * @return the hunts as a boolean
	 */
	public boolean isHunts() {
		return hunts;
	}

	/**
	 * Set if the Cat hunts
	 * 
	 * @param hunts
	 *            to set hunts as a boolean
	 */
	public void setHunts(boolean hunts) {
		this.hunts = hunts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [hunts = " + hunts + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * print details from Cat Class
	 */
	public void printDetails() {

		if (hunts == true) {
			System.out.println("This is a hunter!");
		} else {
			System.out.println("This is one lazy cat!");
		}
		super.printDetails();
		System.out.println("");
	}
}
