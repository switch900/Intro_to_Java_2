
/** 
 * Lab 2A and Lab 2B - Comp 1451
 * 
 * @author Andrew Hewitson - A01029917
 * @version September 23, 2017
 * 
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. "World of Zuul" is a
 * very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game. It is connected
 * to other rooms via exits. The exits are labeled north, east, south, west.
 * For each direction, the room stores a reference to the neighboring room, or
 * null if there is no exit in that direction.
 */
//commented out Map and Treeset left for possible future reference.
//import java.util.Map;
//import java.util.TreeSet;
import java.util.HashMap;
import java.util.Set;

public class Room {
	public String description;
	private HashMap<String, Room> roomExits;

	/**
	 * Constructor for objects of Room class.  Create a room described "description" with roomExits from HashMap.  
	 * "description" is something like "a kitchen" or "an open court yard".  
	 * 
	 * @param description
	 *            The room's description.
	 */
	public Room(String description) {
		roomExits = new HashMap<String, Room>();
		this.description = description;
	}

	/**
	 * @return The description of the room.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return direction
	 */
	public Room getExits(String direction) {
		return roomExits.get(direction);
	}

	/**
	 * Define the exits of this room. Every direction either leads to another room
	 * or is null (no exit there).
	 * 
	 * @param direction
	 *            that player can leave the Room
	 * @param nextRoom
	 *            the Room which that direction takes the player to
	 */
	public void setExits(String direction, Room nextRoom) {
		if (direction != null && nextRoom != null) {
			roomExits.put(direction, nextRoom);
		}
	}

	/**
	 * @return list of exits as a String
	 */
	public String getListOfExits() {
		String listOfExits = "";
		// Set<String> keys = map.keySet();
		// Treeset<String> sortedKeys = new Treeset<>(key);
		Set<String> keys = roomExits.keySet();
		// for (String key : sortedKeys){
		for (String exit : keys) {
			listOfExits = listOfExits.concat(exit + " ");
		}
		return listOfExits;
	}

}
