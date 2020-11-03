package com.HotelReservation;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Client me = new Client("Joel Olivero", (byte) 4, 100, "4015559010", 11);
        Room myRoom = new Room(0, "single", me);
        myRoom.reserve(12, me);
       // me.chargeRoom((float) 20.00);
        System.out.println(myRoom.getOccupant());
        System.out.println(myRoom.checkout(3));
        System.out.println(myRoom.getOccupant());
        System.out.println(myRoom.number);
    }
}
