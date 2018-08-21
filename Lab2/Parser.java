/**
 *  Lab 2A and Lab 2B - Comp 1451
 * 
 * @author Andrew Hewitson - A01029917
 * @version September 23, 2017
 * 
 * This class is part of the "World of Zuul" application. "World of Zuul" is a
 * very simple, text based adventure game.
 * 
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and tries
 * to interpret the line as a two word command. It returns the command as an
 * object of class Command.
 *
 * The parser has a set of known command words. It checks user input against the
 * known commands, and if the input is not one of the known commands, it returns
 * a command object that is marked as an unknown command.
 */

import java.util.Scanner;

public class Parser {
	private CommandWords commands; // holds all valid command words
	private Scanner reader; // source of command input

	/**
	 * Create a parser to read from the terminal window.
	 */
	public Parser() {
		commands = new CommandWords();
		reader = new Scanner(System.in);
	}

	/**
	 * @return The next command from the user.
	 */
	public Command getCommand() {
		String inputLine; // will hold the full input line
		String word1 = null;
		String word2 = null;

		System.out.print("> ");// print prompt

		inputLine = reader.nextLine();

		// Find up to two words on the line.
		Scanner reader = new Scanner(inputLine.toLowerCase());
		if (reader.hasNext()) {
			word1 = reader.next(); // get first word
			if (reader.hasNext()) {
				word2 = reader.next();
				// get second word
				// note: we just ignore the rest of the input line.
			}
			reader.close();
		}
		// Now check whether this word is known. If so, create a command
		// with it. If not, create a "null" command (for unknown command).
		if (commands.isCommand(word1)) {
			return new Command(word1, word2);
		} else {
			return new Command(null, word2);
		}
	}

}
