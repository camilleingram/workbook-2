package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    static String fullName = "";
    static String firstName = "";
    static String middleName = "";
    static String lastName = "";
    static int firstSpace;
    static int secondSpace;

    public static void main(String[] args) {
        fullName = handleInput(scanner);
        firstName = getFirstName(fullName);
        middleName = getMiddleName(fullName);
        lastName = getLastName(fullName);

        firstSpace = fullName.indexOf(" ");
        secondSpace = fullName.lastIndexOf(" ");
        if(firstSpace != secondSpace) {
            System.out.printf("First Name: %s %n", firstName);
            System.out.printf("Middle Name: %s %n", middleName);
            System.out.printf("Last name: %s", lastName);
        } else {
            System.out.printf("First Name: %s %n", firstName);
            System.out.printf("Last name: %s", lastName);
        }
    }

    public static String handleInput(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        fullName = scanner.nextLine();
        return fullName;
    }

    public static String getFirstName(String fullName) {
         firstName = fullName.substring(0,fullName.indexOf(" ")).trim();
         return firstName;

    }

    public static String getMiddleName(String fullName) {
        String firstMiddle = fullName.substring(0, fullName.lastIndexOf(" "));
        middleName = firstMiddle.substring(firstMiddle.indexOf(" ")).trim();
        return middleName;
    }

    public static String getLastName(String fullName) {
        lastName = fullName.substring(fullName.lastIndexOf(" "));
        return lastName;
    }

}
