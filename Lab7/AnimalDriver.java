package com.a00123456;
import com.a00123456.data.Cat;
import com.a00123456.data.Dog;
import com.a00123456.database.AnimalHotel;

public class AnimalDriver {

	public AnimalDriver() {
		super();

	}

	public static void main(String[] args) {
		
		new AnimalDriver().test();

	}

	public void test() {
		
		AnimalHotel hotel = new AnimalHotel();
		
		hotel.registerGuest(new Dog("German Shepherd", 47.0, true));
		hotel.registerGuest(new Dog("German Shepherd", 40.0, false));
		hotel.registerGuest(new Cat("Tri-Colour", 5.0, false));
		
		hotel.showGuests();
		

	}

}
