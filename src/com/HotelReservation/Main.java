package com.HotelReservation;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Room myRoom = new Room(0, "single", false, false, "", 19.99F);
	myRoom.reserve(12, "Joel Olivero");
        System.out.println(myRoom.getIsOccupied());
        System.out.println(myRoom.getOccupant());
        System.out.println(myRoom.checkout(3));
        System.out.println(myRoom.number);
    }
}
