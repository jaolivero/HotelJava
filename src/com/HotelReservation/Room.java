package com.HotelReservation;

import java.util.HashMap;
import java.text.NumberFormat;

public class Room {
    public int number;
    public String type;
    private boolean isOccupied = false;
    private boolean isNeedsCleaning = false;
    private Client occupant;
    public float costPerNight = 19.99F;
    HashMap<String, Integer> beds = new HashMap<String, Integer>();

    public Room (int number, String type,  Client occupant) {
        this.number = occupant.getRoomNumber();
        this.type = type;
        this.occupant = occupant;
    }

    public void reserve(int roomNumber, Client occupant) {
        if (isOccupied && isNeedsCleaning == true) {
            System.out.println("Room is unavailable");
        } else {
            isOccupied = true;
            this.occupant = occupant;
            System.out.println("Congrats!! Check-in is at 3pm");
        }
    }

    public float checkout(int nights) {
        occupant = null;
        isOccupied = false;
        isNeedsCleaning = true;
        float totalCost = costPerNight * nights;

        System.out.println("Your total cost will be..." + totalCost );
        return totalCost;
    }

    public void cleaned (){
        isNeedsCleaning = false;
    }

    public Client getOccupant() {
        return occupant;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    @Override
    public String toString() {
        return occupant.getName();
    }
}
