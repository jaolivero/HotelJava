package com.HotelReservation;

public class Suite extends Room {
    boolean restock = false;
    boolean kitchenette = false;

    public Suite(int number, String type, Client occupant, float costPerNight) {
        super(number, "Suite",  occupant);
    }

    @Override
    public float checkout(int nights) {
        restock();
        float totalCost = costPerNight * nights;
        System.out.println("Your final balance will be " + totalCost);
        return totalCost;
    }

    public void restock() {
        this.restock = false;
    }

    @Override
    public
}