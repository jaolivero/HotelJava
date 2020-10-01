package com.HotelReservation;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Room myRoom = new Room(101, "single", (byte) 3, false, false, "Joel Olivero", 30.25f);
        myRoom.reserve(102, "John Smith");
        System.out.println(myRoom.number);
//        Date now = new Date();
//        System.out.println(now);

//        System.out.println(myRoom);
    }
}
