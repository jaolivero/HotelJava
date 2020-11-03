package com.HotelReservation;

public class Client {
    private String name;
    private byte partySize = 1;
    private float currentBill = 0;
    private float prepaid = 0;
    private String phoneNumber = "";
    private int roomNumber;

    public Client (String name, byte partySize, float prepaid, String phoneNumber, int roomNumber ) {
        this.name = name;
        this.partySize = partySize;
        this.prepaid = prepaid;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
    }

    public void makePayment(float amount) {
        if (currentBill > 0) {
            currentBill = -amount;
        }
        System.out.println("There is no outstanding balance");
    }

    public void chargeRoom(float charge) {
        currentBill =+ charge;
        System.out.println("your balance is now " + currentBill);
    }

    public float getOutstandingBalance() {
        return currentBill;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public byte getPartySize() {
        return partySize;
    }
}
