import java.util.ArrayList;

/**
 * AnimalHotel class is part of Lab 6a-6b. It holds an ArrayList of objects from
 * the Animal class.
 * 
 * @project Lab 6a - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 24, 2017
 */
public class AnimalHotel {

	private ArrayList<Animal> animals;

	/**
	 * Constructor for objects of AnimalHotel class. It creates an empty ArrayList of
	 * animals.
	 */
	public AnimalHotel() {
		animals = new ArrayList<Animal>();
	}

	/**
	 * Adds an animal to the Animal Hotel.
	 * 
	 * @param animal to be added to the list
	 */
	public void addAnimal(Animal animal) {
		if (animal != null) {
			animals.add(animal);
		}
	}

	/**
	 * Displays the breed and weight of all the animals in the AnimalHotel
	 */
	public void printAnimalsDetails() {

		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}
}
