/**
 * Lab5b_Driver class is the driver Class for Lab 5b. It runs the main method and
 * initializes parameters for testing and prints results.
 * 
 * @project Lab 5B - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 21, 2017
 */

public class Lab5b_Driver {
	
	public static Database person;
	public static Student student1;
	public static Student student2;
	public static Instructor instructor1;

	/**
	 * Main method for Lab 5b. Initializes a new person ArrayList and prints the
	 * results.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Database();
		initialize();
		testPrint();
	}

	/**
	 * Creates new objects for Student and Instructor class for testing and places
	 * them in person ArrayList
	 */
	public static void initialize() {

		person = new Database();

		instructor1 = new Instructor("Paul", "Mills", "PaulMills@BCIT.com", "5152125", 1000000.00);
		
		person.addInstructor(instructor1);

		student1 = new Student("andrew", "hewitson", "Switch900", "A010209");
		student1.createGrade("test", -50.0);
		person.addStudent(student1);

		student2 = new Student("alice", "dog", "alice@dog.com", "A124124");
		student2.createGrade("eating", 100.00);
		student2.createGrade("sleeping", 95);
		student2.createGrade("barking", 25);
		student2.createGrade("test fail 2", -50.0);
		person.addStudent(student2);
	}

	/**
	 * prints results from methods in Instructor, Student and Database class. Runs
	 * printDetails method from Database class. Prints results from Instructor class
	 * method getHourlyWage. Prints results from Student class method getAverage.
	 */
	public static void testPrint() {
		person.printDetails();

		System.out.println(instructor1.getFirstName() + " " + instructor1.getLastName() + " " + "wage is "
				+ instructor1.getHourlyWage());

		student1.printCourseDetails();
		System.out.println("Average is: " + student1.getAverage());
		
		student2.printCourseDetails();
		System.out.println("Average is: " + student2.getAverage());
	}
}
