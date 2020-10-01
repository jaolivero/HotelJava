package com.HotelReservation;

public class Suite extends Room {

    public Suite(int number, String type, byte floor, boolean isOccupied, boolean needsCleaning, String occupant, float costPerNight) {
        super(number, type, floor, isOccupied, needsCleaning, occupant, costPerNight);
    }
}
