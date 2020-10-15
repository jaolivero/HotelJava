package com.HotelReservation;

import java.util.HashMap;
import java.util.List;

public class Hotel {
    final static byte hotelRooms = 20;
    int availableStandard;
    String reservedStandards;
    int availableSuites;
    int reservedSuites;
    private List<Client> clients;

    HashMap<Integer, Boolean> Rooms = new HashMap<Integer, Boolean>();


    public Hotel(int availableStandard, String reservedStandards, int availableSuites, int reservedSuites, List<Client> clients) {
        this.availableStandard = availableStandard;
        this.reservedStandards = reservedStandards;
        this.availableSuites = availableSuites;
        this.reservedSuites = reservedSuites;
        this.clients = clients;
    }
    public void addRoom() {
        for (int i = 0; i < hotelRooms; i ++){
            Rooms.put(i, true);
        }
    }
}
