package com.HotelReservation;


public class Suite extends Room {
    boolean needsRestock = false;

    public Suite(int number, String type, boolean isOccupied, boolean needsCleaning, String occupant, float costPerNight) {
        super(number, type, isOccupied, needsCleaning, occupant, costPerNight);

    }

    @Override
    public void checkout(int nights) {
        checkout(needsRestock = true);
    }

    private void checkout(boolean b) {
    }

}