package com.HotelReservation;


public class Suite extends Room {
    boolean needsRestock = false;

    public Suite(int number, String type, String occupant, float costPerNight) {
        super(number, type,  occupant, costPerNight);

    }

    @Override
    public float checkout(int nights) {
        needsRestock = true;
        float totalCost = costPerNight * nights;
        return totalCost;
    }
}