import java.util.ArrayList;
/**
 * Database class is the parent class for Student Class and Instructor Class. It
 * is a subclass of the main class Lab5b_Driver. It provides Student and
 * Instructor class with instance variables for firstName, lastName,
 * emailAddress and BCIT_ID. It places the parameters from Student Class and
 * Instructor Class into the person ArrayList. It extends this information to
 * Lab5b_Driver class for testing
 * 
 * @project Lab 5B - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 21, 2017
 */

public class Database extends Lab5b_Driver {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String BCIT_ID;
	private ArrayList<Database> person;
	public Student student;
	public Instructor instructor;

	private final static int MINIMUM_NAME_LENGTH = 0;

	/**
	 * default constructor that creates an empty person ArrayList
	 */
	public Database() {
		person = new ArrayList<Database>();
	}

	/**
	 * Constructor for Database class. It sets the parameters for the variables of
	 * firstName, lastName, emailAddress and BCIT_ID and creates an empty person
	 * ArrayList.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param bCIT_ID
	 */
	public Database(String firstName, String lastName, String emailAddress, String BCIT_ID) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
		setBCIT_ID(BCIT_ID);
		person = new ArrayList<Database>();
	}

	/**
	 * Retrieve the first name
	 * 
	 * @return the String firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set the value of firstName
	 * 
	 * @param firstName
	 *            a variable of type String
	 */
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() >= MINIMUM_NAME_LENGTH) {
			firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
			this.firstName = firstName;
		}
	}

	/**
	 * Retrieve the last name
	 * 
	 * @return the String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set the value of lastName
	 * 
	 * @param lastName
	 *            a variable of type String
	 */
	public void setLastName(String lastName) {
		if (lastName != null && lastName.length() >= MINIMUM_NAME_LENGTH) {
			lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
			this.lastName = lastName;
		}
	}

	/**
	 * Retrieve the email address
	 * 
	 * @return the emailAddress as a String
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Set the value of emailAddress
	 * 
	 * @param emailAddress
	 *            a variable of type String
	 */
	public void setEmailAddress(String emailAddress) {
		if (emailAddress != null) {
			this.emailAddress = emailAddress;
		}
	}

	/**
	 * Retrieve the BCIT ID number
	 * 
	 * @return the bCIT_ID as a String
	 */
	public String getBCIT_ID() {
		return BCIT_ID;
	}

	/**
	 * Set the value of BCIT_ID
	 * 
	 * @param bCIT_ID
	 *            a variable of type String
	 */
	public void setBCIT_ID(String BCIT_ID) {
		if (BCIT_ID != null) {
			this.BCIT_ID = BCIT_ID;
		}
	}

	/**
	 * Retrieve object from the person ArrayList
	 * 
	 * @return person as an ArrayList of persons from Student class and Instructor
	 *         class
	 */
	public ArrayList<Database> getPerson() {
		return person;
	}

	/**
	 * Set person object to the person ArrayList
	 * 
	 * @param person
	 */
	public void setPerson(ArrayList<Database> person) {
		if (person != null) {
			this.person = person;
		}
	}

	/**
	 * add an object from the Student class to the ArrayList person
	 */
	public void addStudent(Student student) {
		if (person != null && student != null) {
			person.add(student);
		}
	}

	/**
	 * add an object from Instructor class to the ArrayList person
	 */
	public void addInstructor(Instructor instructor) {
		if (person != null && instructor != null) {
			person.add(instructor);
		}
	}

	/**
	 * print firstName, lastName and email address from person ArrayList. Uses
	 * initialization method in main class Lab5b_Driver to populate person ArrayList
	 */
	public void printDetails() {
		initialize();
		if (person != null) {
			for (int index = 0; index < person.size(); index++) {
				System.out.println("Name: " + person.get(index).getFirstName() + " " + person.get(index).getLastName());
				System.out.println("Email: " + person.get(index).getEmailAddress());
				System.out.println("");
			}
		}
	}
}
