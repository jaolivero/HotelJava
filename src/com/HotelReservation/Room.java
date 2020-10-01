package com.HotelReservation;

public class Room {
    public int number;
    public String type;
    public byte floor;
    private boolean isOccupied;
    private boolean needsCleaning;
    private String occupant;
    private float costPerNight;

    public Room (int number, String type, byte floor, boolean isOccupied, boolean needsCleaning, String occupant, float costPerNight) {
        this.number = number;
        this.type = type;
        this.floor = floor;
        this.isOccupied = isOccupied;
        this.needsCleaning = needsCleaning;
        this.occupant = occupant;
        this.costPerNight = costPerNight;
    }

    public void reserve(int roomNumber, String customer) {
        if (isOccupied && needsCleaning == true) {
            System.out.println("Room is unavailable");
        } else {
            isOccupied = true;
            System.out.println("Congrats!! Check-in is at 3pm");
        }
    }

    public void checkout(int roomNumber, int nightsStayed) {
        this.occupant = "";
        this.needsCleaning = true;
        float totalCost = this.costPerNight * nightsStayed;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }
}
