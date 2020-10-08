package com.HotelReservation;

import java.util.HashMap;
import java.util.List;

public class Hotel {
    public int hotelRooms = 20;
    int availableStandard;
    String reservedStandards;
    int availableSuites;
    int reservedSuites;
    private List<Client> clients;

    HashMap<Integer, Boolean> Rooms = new HashMap<Integer, Boolean>();


    public Hotel(int availableStandard, String reservedStandards, int avaliableSuites, int reservedSuites, List<Client> clients) {
        this.availableStandard = availableStandard;
        this.reservedStandards = reservedStandards;
        this.availableSuites = avaliableSuites;
        this.reservedSuites = reservedSuites;
        this.clients = clients;
    }
    public void addRoom() {
        for (int i = 0; i < hotelRooms; i ++){
            Rooms.put(i, true);
        }
    }
}
