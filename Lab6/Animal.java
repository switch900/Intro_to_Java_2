import java.text.DecimalFormat;
/**
 * Animal class is part of Lab 6a-6b. It is a subclass of AnimalHotel class and
 * is the parent class for Cat class and Dog class
 * 
 * @project Lab 6a - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 24, 2017
 */

public class Animal extends AnimalHotel {
	// instance variables
	private String breed;
	private double weightInKilos;

	/**
	 * Default constructor
	 */
	public Animal() {
	}

	/**
	 * Constructor for Animal class. Sets animals breed and weight
	 * 
	 * @param breed
	 *            to set the breed field
	 * @param weight
	 *            to set the weight field
	 */
	public Animal(String breed, double weightInKilos) {
		setBreed(breed);
		setWeight(weightInKilos);
	}

	/**
	 * Get the animal's breed.
	 * 
	 * @return the breed as a String
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * Get the animal's weight
	 * 
	 * @return the weight as a double
	 */
	public double getWeight() {
		return weightInKilos;
	}

	/**
	 * Set the animal's breed
	 * 
	 * @param breed
	 *            to set the breed field
	 */
	public void setBreed(String breed) {
		if(breed != null) {
		this.breed = breed;
		}
	}

	/**
	 * Set the animal's weight in Kilos
	 * 
	 * @param weight
	 *            to set the weight field
	 */
	public void setWeight(double weightInKilos) {
		if(weightInKilos >=0.0) {
		this.weightInKilos = weightInKilos;
	}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal[breed=" + breed + ", weight=" + weightInKilos + "]";
	}

	/**
	 * print details from Animal Class
	 */
	public void printDetails() {
		if (breed != null && weightInKilos > 0.0) {
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("This is a " + breed + " weighing " + df.format(weightInKilos) + " kilos.");
		}
	}
}

