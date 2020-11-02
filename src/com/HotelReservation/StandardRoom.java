package com.HotelReservation;

public class StandardRoom extends Room {
    int beds;
    int rooms;

    public StandardRoom(int number, String type, Client occupant, float costPerNight) {
        super(number, "Standard", occupant);
        this.rooms = rooms;
        this.beds = beds;
    }

    @Override
    public void reserve(int roomNumber, Client occupant) {
        int partySize = getOccupant().getPartySize();
        if( partySize > beds * 2) {
            System.out.println("Unavailable, not enough beds");
        }
        else {
            super.reserve(roomNumber, getOccupant());
        }
    }
}
