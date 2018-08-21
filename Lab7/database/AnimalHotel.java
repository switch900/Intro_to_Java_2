package com.a00123456.database;
import java.util.ArrayList;

import com.a00123456.data.Animal;

/**
 * AnimalHotel where critters go on holiday.
 * 
 * @author Bullwinkle
 * @version this one
 */
public class AnimalHotel {
	// instance variables
	private ArrayList<Animal> hotel;

	/**
	 * Constructor for objects of class AnimalHotel
	 */
	public AnimalHotel() {
		hotel = new ArrayList<Animal>();
	}

	/**
	 * Register a guest in the hotel
	 * 
	 * @param guest
	 */
	public void registerGuest(Animal guest) {
		if (guest != null) {
			hotel.add(guest);
		}
	}

	/**
	 * Show all the guests.
	 */
	public void showGuests() {
		for (Animal guest : hotel) {
			guest.display();
		}
	}

}
