package com.pluralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone(0, "", "", "", "", "");

        CellPhone phone2 = new CellPhone(0, "", "", "", "", "");


        phone1.getUser(scanner);
        phone2.getUser(scanner);

        display(phone1, phone2);

    }

    public static void display(CellPhone phone1, CellPhone phone2) {
       System.out.println(phone1.dial(phone2.getPhoneNumber()));
       System.out.println(phone2.dial(phone1.getPhoneNumber()));
    }


}
