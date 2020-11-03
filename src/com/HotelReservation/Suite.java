package com.HotelReservation;

public class Suite extends StandardRoom {
    boolean restock = false;
    boolean kitchenette = false;

    public Suite(int number, String type, Client occupant, int rooms, byte beds, boolean kitchenette) {
        super( number, "Suite", occupant, 30000, rooms, beds);
        this.kitchenette = kitchenette;
    }

    @Override
    public float checkout(int nights) {
        restock();
       super.checkout(nights);
    }

    public void restock() {
        this.restock = false;
    }
}