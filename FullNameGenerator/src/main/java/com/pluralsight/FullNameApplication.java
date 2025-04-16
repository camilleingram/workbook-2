package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String middleName;
    static String lastName;
    static String suffix;
    public static void main(String[] args) {

        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine().trim();

        System.out.print("Enter your middle name: ");
        middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine().trim();

        System.out.print("Enter a suffix: ");
        suffix = scanner.nextLine();

        handleFullName(firstName, middleName, lastName, suffix);


    }

    public static void handleFullName(String firstName, String middleName, String lastName, String suffix) {
        String fullName = String.join(" ", firstName, middleName, lastName);

        if(suffix.length() > 1) {
            fullName = fullName.join(", ", fullName, suffix);
            System.out.print(fullName);
        } else {
            System.out.print(fullName);
        }
    }


}
