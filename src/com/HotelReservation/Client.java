package com.HotelReservation;

public class Client {
    private String name;
    private int partySize = 1;
    private float currentBill = 0;
    private float prepaid = 0;
    private String phoneNumber = "";
    private int roomNumber;
    private String roomType;
    private Room room;

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

    public void SetRoomType() {
        if (roomNumber < 10) {
            this.roomType = "Standard";
        } else {
            this.roomType = "Suite";
        }
    }
}
