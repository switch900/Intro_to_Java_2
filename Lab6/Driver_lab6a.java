/**
 * Driver_lab6a class is part of Lab 6a-6b. It contains the main method it
 * creates a new ArrayList from AnimalHotel class and adds Cats and Dogs to it.
 * 
 * @project Lab 6a - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 24, 2017
 */
public class Driver_lab6a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnimalHotel hilton = new AnimalHotel();
		
		Animal animal = new Dog("corgi", 10, true);
		Animal animal2 = new Dog("beagle", 9.55666, false);
		Animal animal3 = new Cat("Persian", 4.5, false);
		Animal animal4 = new Cat("Siamese", 2.3, true);
		
		hilton.addAnimal(animal);
		hilton.addAnimal(animal2);
		hilton.addAnimal(animal3);
		hilton.addAnimal(animal4);
		
		hilton.printAnimalsDetails();
		System.out.println("");
		
		animal.printDetails();
		animal2.printDetails();
		animal3.printDetails();
		animal4.printDetails();
	}
}
