/**
 * Lab 3b - Comp 1451
 * 
 * @author Andrew Hewitson - A01029917
 * @version September 29, 2017
 */

public class Driver {

	public static void main(String[] args) {

		testCode();
	}

	public static void testCode() {

		EmailInfo testCode = new EmailInfo();
		System.out.println("Results with no friends entered.");
		testCode.listAll();

		System.out.printf("%n%s%n%s%n%n", "Results with 3 friends entered.",
				"Names are entered as \"bob the builder\" - good email, \"ROCKY raccoon\" - good email, \"AndreW hEwitson\" - bad email, \"\"- good email");
		testCode.addFriend("bob the builder", "good email");
		testCode.addFriend("ROCKY raccoon", "good email");
		testCode.addFriend("AndreW hEwitson", "bad email");
		testCode.addFriend("","good email");
		testCode.listAll();

		System.out.printf("%n%s%n", "Remove Bob The Builder and print updated list.");
		testCode.removeFriend("bob the builder");
		testCode.listAll();

		System.out.printf("%n%s%n", "Show email address for Rocky - entered as rocky raccoon");
		String test = testCode.getAddress("rocky raccoon");
		System.out.println(test);

		System.out.printf("%n%s%n", "Show list of friends who have email address \"good Email\"");
		testCode.findFriends("good email");
		System.out.printf("%n%s%n", "Show list of friends who have email address \"bad Email\"");
		testCode.findFriends("bad email");
		System.out.printf("%n%s%n", "Add new friend named \"ilana w\" - bad email");

		testCode.addFriend("ilana w", "bad email");
		System.out.printf("%n%s%n", "Show list of friends who have email address \"bad Email\"");
		testCode.findFriends("bad email");
	}

}
