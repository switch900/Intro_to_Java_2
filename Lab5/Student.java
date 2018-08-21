import java.util.HashMap;
import java.util.Set;

/**
 * Student class is part of Lab 5b. It is a subclass of Database class.
 * 
 * @project Lab 5B - Comp 1451
 * @author Andrew Hewitson - A01029917
 * @version October 21, 2017
 */

public class Student extends Database {

	private HashMap<String, Double> studentGrade;
	private double average;

	/**
	 * default constructor. Creates empty HashMap for studentGrade
	 * 
	 * @param studentGrade
	 *            as HashMap
	 * 
	 */
	public Student() {
		studentGrade = new HashMap<String, Double>();
	}

	/**
	 * Constructor to initialize parameters inherited from Database class. Creates
	 * empty HashMap for studentGrade
	 * 
	 * @param firstName
	 *            as String
	 * @param lastName
	 *            as String
	 * @param emailAddress
	 *            as String
	 * @param bCIT_ID
	 *            as String
	 * @param studentGrade
	 *            as HashMap
	 */
	public Student(String firstName, String lastName, String emailAddress, String BCIT_ID) {
		super(firstName, lastName, emailAddress, BCIT_ID);
		studentGrade = new HashMap<String, Double>();
	}

	/**
	 * Retrieves HashMap containing the course name as Key and they student's grade
	 * as a value
	 * 
	 * @return the studentGrade as a HashMap
	 */
	public HashMap<String, Double> getStudentGrade() {
		return studentGrade;
	}

	/**
	 * Adds courseName as the key and grade as value to HashMap of studentGrade
	 * 
	 * @param courseName
	 *            a variable of type String
	 * @param grade
	 *            a variable of type double
	 */
	public void createGrade(String courseName, double grade) {
		if (courseName != null && grade >= 0 && studentGrade != null) {
			studentGrade.put(courseName.toUpperCase(), grade);
		}
	}

	/**
	 * gets student average. An average of all values in HashMap.
	 */
	public double getAverage() {
		double sum = 0;
		if (studentGrade != null) {
			Set<String> values = studentGrade.keySet();
			for (String index : values) {
				if (studentGrade.get(index) >= 0) {
					sum = studentGrade.get(index) + sum;
				}
			}
			if (studentGrade.size() != 0) {
				average = sum / studentGrade.size();
			}
		}
		return average;
	}

	/**
	 * displays list of details from HashMap studentGrade
	 */
	public void printCourseDetails() {
		if(studentGrade != null) {
			System.out.println("");
			Set<String> values = studentGrade.keySet();
			System.out.println(getFirstName() + " " + getLastName());
			for (String index : values)  {
				System.out.println("Course: " + index);
				System.out.println("Grade: " + studentGrade.get(index).toString());
				}			
		}
	}
}


