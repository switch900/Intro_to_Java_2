
/**
 * Lab 2A and Lab 2B - Comp 1451
 * 
 * @author Andrew Hewitson - A01029917
 * @version September 23, 2017
 * 
 * This class is the main class of the "World of Zuul" application. "World of
 * Zuul" is a very simple, text based adventure game. Users can walk around some
 * scenery. That's all. It should really be extended to make it more
 * interesting!
 * 
 * To play this game, create an instance of this class and call the "play"
 * method.
 * 
 * This main class creates and initialises all the others: it creates all rooms,
 * creates the parser and starts the game. It also evaluates and executes the
 * commands that the parser returns.
 */
import java.util.Stack;//lab 2b

public class Game {
	private Parser parser;
	private Room currentRoom;
	private Stack<Room> route;// lab 2b

	/**
	 * Constructor for Game class. Starts the game and initialise its internal map.
	 * Create new Stack to trace history of route player has taken through the game.
	 */
	public Game() {
		createRooms();
		parser = new Parser();
		route = new Stack<Room>();// lab 2b
	}

	/**
	 * @param Create
	 *            all the rooms and link their exits together.
	 */
	private void createRooms() {
		Room outside, theatre, pub, lab, office, basement;// lab 2b

		// create the rooms
		outside = new Room("outside the main entrance of the university");
		theatre = new Room("in a lecture theatre");
		pub = new Room("in the campus pub");
		lab = new Room("in a computing lab");
		office = new Room("in the computing admin office");
		basement = new Room("in a dark and scary basement.  Something grabs your ankle.");// lab 2b

		// initialise room exits
		outside.setExits("east", theatre);
		outside.setExits("south", lab);
		outside.setExits("west", pub);
		theatre.setExits("west", outside);
		pub.setExits("east", outside);
		lab.setExits("north", outside);
		lab.setExits("east", office);
		lab.setExits("down", basement); // lab 2b
		office.setExits("west", lab);
		basement.setExits("up", lab);// lab 2b

		currentRoom = outside; // start game outside
	}

	/**
	 * Main play routine. Loops until end of play.
	 */
	public void play() {
		printWelcome();
		printYouAreHere();
		printGetHelp();

		// Enter the main command loop. Here we repeatedly read commands and
		// execute them until the game is over.

		boolean finished = false;
		while (!finished) {
			Command command = parser.getCommand();
			finished = processCommand(command);
		}
		System.out.println("Thank you for playing.  Good bye.");
	}

	/**
	 * Print out the opening message for the player.
	 */
	private void printWelcome() {
		System.out.printf("%s%n%n", "Welcome to the World of Zuul!");
		System.out.printf("%s%n",
				"World of Zuul is an exciting new game where you can live the life of Zuul The Adventurer.");
	}

	/**
	 * Print out message to tell the player how to get help.
	 */
	private void printGetHelp() {
		System.out.printf("%s%n%n", "Type 'help' if you need help.");
	}

	/**
	 * Print out message telling the player where they are.
	 */
	private void printYouAreHere() {
		System.out.printf("%n%s%s%n%n%s%s%n%n", "You are ", currentRoom.getDescription(), "Exits: ",
				currentRoom.getListOfExits());
	}

	/**
	 * Print out some help information. Here we print some stupid, cryptic message
	 * and a list of the command words.
	 */
	private void printHelp() {
		System.out.println("You are lost. You are alone. You wander");
		System.out.println("around at the university.");
		System.out.println("Your command words are:");
		System.out.printf("%s%n%n", "   go quit help back");
	}

	/**
	 * Given a command, process (that is: execute) the command.
	 * 
	 * @param command
	 *            The command to be processed.
	 * @return true If the command ends the game, false otherwise.
	 */
	private boolean processCommand(Command command) {

		boolean wantToQuit = false;

		if (command.isUnknown()) {
			System.out.println("I don't know what you mean...");
			return false;
		}

		String commandWord = command.getCommandWord();
		// todo - build a collection of good command words in CommandWords class to
		// replace following if else statement
		if (commandWord.equals("help"))
			printHelp();
		else if (commandWord.equals("go"))
			goRoom(command);
		else if (commandWord.equals("back"))// lab 2b
			goBack();
		else if (commandWord.equals("quit"))
			wantToQuit = quit(command);

		return wantToQuit;
	}

	// implementations of user commands:

	/**
	 * Try to go to one direction. If there is an exit, enter the new room,
	 * otherwise print an error message.
	 * 
	 * @param push
	 *            new Room onto stack
	 */
	public void goRoom(Command command) {
		if (!command.hasSecondWord()) {
			// if there is no second word, we don't know where to go...
			System.out.println("Go where?");
			return;
		}
		String direction = command.getSecondWord();
		// Try to leave current room.
		Room nextRoom = currentRoom.getExits(direction);
		if (nextRoom != null) {
			route.push(currentRoom);
		} // lab 2b
		if (nextRoom == null) {
			System.out.println("There is no door!");
		} else {
			currentRoom = nextRoom;
			printYouAreHere();
		}
	}

	/**
	 * "Quit" was entered. Check the rest of the command to see whether we really
	 * quit the game.
	 * 
	 * @return true, if this command quits the game, false otherwise.
	 */
	private boolean quit(Command command) {
		if (command.hasSecondWord()) {
			System.out.println("Quit what?");
			return false;
		} else {
			return true; // signal that we want to quit
		}
	}

	// all following code is from Lab 2b

	/**
	 * @return route for Stack
	 */
	public Stack<Room> getRoute() {
		return route;
	}

	/**
	 * @param pop
	 *            last room player visited from stack
	 * 
	 */
	private void goBack() {

		if (route.empty() == true) {
			System.out.printf("%n%s%n", "You have returned to the Planck Epoch!!! ");
			printYouAreHere();

		} else {
			currentRoom = route.pop();
			int roomsLeftInStack = route.size();
			System.out.println("Amount Of Rooms Left In Stack : " + roomsLeftInStack);
			printYouAreHere();
		}
	}
}