package com.pluralsight;

import java.util.Scanner;

public class CellPhone {

    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";
    private String message = "";

    public CellPhone (int serialNumber, String model, String carrier, String phoneNumber,
                      String owner, String message) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.message = message;

    }

    public void getUser(Scanner scanner) {
        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is the model of the phone? ");
        model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();

    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String dial(String phoneNumber) {
        whoIsCalling(phoneNumber);
        return message;
    }

    public void whoIsCalling(String phoneNumber) {
        this.message = this.message.format("%s's phone is calling %s", this.owner,
                                           phoneNumber);
    }
}
