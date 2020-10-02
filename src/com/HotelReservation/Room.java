package com.HotelReservation;

import java.util.HashMap;

public class Room {
    public int number;
    public String type;
    public byte floor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private String occupant;
    private float costPerNight;
    HashMap<String, Integer> beds = new HashMap<String, Integer>();

    public Room (int number, String type, byte floor, boolean isOccupied, boolean needsCleaning, String occupant, float costPerNight) {
        this.number = number;
        this.type = type;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.needsCleaning = needsCleaning;
        this.occupant = occupant;
        this.costPerNight = costPerNight;
    }

    beds.put("single", 1);


    public void reserve(int roomNumber, String customer) {
        if (isOccupied && needsCleaning == true) {
            System.out.println("Room is unavailable");
        } else {
            isOccupied = true;
            occupant = customer;
            System.out.println("Congrats!! Check-in is at 3pm");
        }
    }

    public void checkout(int nights) {
        occupant = "";
        isOccupied = false;
        needsCleaning = true;
        float totalCost = costPerNight * nights;

        System.out.println("Your total cost will be..." + totalCost );
        System.out.println(beds);

    }

    public void clean (){
        needsCleaning = false;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

}
