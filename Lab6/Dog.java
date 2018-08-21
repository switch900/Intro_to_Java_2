/**
 * Dog class is part of Lab 6a-6b. It is a subclass of Animal class
 * 
 * @project Lab 6a - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 24, 2017
 */

public class Dog extends Animal {
	// instance variable
	private boolean likesToWalk;

	/**
	 * Default constructor for Dog Class
	 */
	public Dog() {
	}

	/**
	 * Constructor for objects of Dog class. Sets breed and weight from parent class
	 * and likesToWalk from instance variable
	 * 
	 * @param breed
	 *            to set the breed field
	 * @param weight
	 *            to set the weight field
	 * @param likesToWalk
	 *            to set the likesToWalk field
	 */
	public Dog(String breed, double weightInKilos, boolean likesToWalk) {
		super(breed, weightInKilos);
		setLikesToWalk(likesToWalk);
	}

	/**
	 * Get if the Dog likes to Walk
	 * 
	 * @return likesToWalk as a boolean
	 * 
	 */
	public boolean isLikesToWalk() {
		return likesToWalk;
	}

	/**
	 * Set if the Dog likes to Walk.
	 * 
	 * @param likesToWalk
	 *            to set the likesToWalk field
	 */
	public void setLikesToWalk(boolean likesToWalk) {
		this.likesToWalk = likesToWalk;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [likesToWalk = " + likesToWalk + ", toString()=" + super.toString() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * print details from Dog Class
	 */
	public void printDetails() {
		super.printDetails();
		if (likesToWalk == true) {
			System.out.println("This dog likes to walk.");
		} else {
			System.out.println("This is a lazy dog.");
		}
		System.out.println("");
	}
}
