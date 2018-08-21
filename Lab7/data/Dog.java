package com.a00123456.data;
/**
 * Dog likes to walk or not
 * 
 * @author Bullwinkle
 * @version this one
 */
public class Dog extends Animal {
	// instance variables
	private boolean walks;

	/**
	 * Default constructor
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor for objects of class Dog
	 * @param breed to initialize breed field
	 * @param weight to initialize weight field
	 * @param walks to initialize walks field
	 * 
	 */
	public Dog(String breed, double weight, boolean walks) {
		super(breed, weight);
		setWalks(walks);
	}

	/**
	 * @return the walks as boolean
	 */
	public boolean isWalks() {
		return walks;
	}

	/**
	 * @param walks
	 *            the walks to set
	 */
	public void setWalks(boolean walks) {
		this.walks = walks;
	}
	
	/**
	 * displays the whether the dog walks or is lazy
	 */
	public void display() {
		
		super.display();

		if (walks) {
			System.out.println("This dog likes to walk.");

		} else {
			System.out.println("This is a lazy dog!");

		}	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [walks=" + walks + ", toString()=" + super.toString() + "]";
	}

	

}
