package com.pluralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone(0, "", "", "", "");

        myPhone.getUser(scanner);
        System.out.printf("Serial Number: %d %n", myPhone.getSerialNumber());
        System.out.printf("Model: %s %n", myPhone.getModel());
        System.out.printf("Carrier: %s %n", myPhone.getCarrier());
        System.out.printf("Phone Number: %s %n", myPhone.getPhoneNumber());
        System.out.printf("Owner: %s", myPhone.getOwner());

    }


}
