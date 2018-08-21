
/**
 * Lab 3b - Comp 1451
 * 
 * @author Andrew Hewitson - A01029917
 * @version September 29, 2017
 */

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class EmailInfo {

	private HashMap<String, String> addressBook;
	private String emailAddress;

	/**
	 * constructor for EmailInfo class.  Creates new HashMap containing names as keys and email address as values.
	 */
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the properly formatted name
	 */
	private String formatName(String name) {
		String formatName = " ";
		if (name != null && name.length() > 0) {
			StringTokenizer stringTokenizer = new StringTokenizer(name);
			while (stringTokenizer.hasMoreElements()) {
				String index = stringTokenizer.nextToken();
				formatName = formatName
						.concat(index.substring(0, 1).toUpperCase() + index.substring(1).toLowerCase() + " ");
			}
		}
		return formatName.trim();
	}

	/**
	 * Add a friend to the address book. The friends's name must be formatted before
	 * being stored.
	 */
	public void addFriend(String name, String email) {
		if (name != null && name.length() > 0 && email != null && email.length() > 0) {
			addressBook.put(formatName(name), email);
		}
	}

	/**
	 * Remove a friend from the address book. The name passed in can be in upper
	 * case, lower case or mixed. The friend and their email will be removed from
	 * the address book
	 */
	public void removeFriend(String name) {
		if (name != null && name.length() > 0) {
			addressBook.remove(formatName(name));
		}
	}

	/**
	 * @Return email address as String based on friends name. The name passed in can
	 *         be in upper case, lower case or mixed. The friend's email address
	 *         will be returned.
	 */
	public String getAddress(String name) {
		String emailAddress = "";
		if (name != null && name.length() > 0) {
			emailAddress = addressBook.get(formatName(name));
		}
		return emailAddress;
	}

	/**
	 * Find and display friends based on their email address. There might be more
	 * than one friend using the same email.
	 */
	public void findFriends(String email) {
		if (addressBook.containsValue(email)) {
			for (Entry<String, String> entry : addressBook.entrySet()) {
				if (entry.getValue().equals(email)) {
					System.out.println(entry.getKey());

				}
			}
		}
	}

	/**
	 * List all friends and their email addresses
	 */
	public void listAll() {
		if (addressBook.isEmpty()) {
			System.out.println("You have no emails stored in your addressbook.");
		}
		for (String name : addressBook.keySet()) {
			String key = name.toString();
			{
				System.out.println("Name : " + key);
				System.out.println("Email Address : " + getAddress(key));
				// System.out.println();
			}
		}
	}
}
