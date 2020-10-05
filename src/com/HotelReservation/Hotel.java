package com.HotelReservation;

import java.util.HashMap;

public class Hotel {
    int Rooms;
    int availiableStandard;
    String reservedStandards;
    int avaliableSuites;
    int reservedSuites;
    private Client clent;

    HashMap<String, Integer> hotelRooms = new HashMap<String, Integer>();
}
