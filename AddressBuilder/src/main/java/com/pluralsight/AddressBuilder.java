package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {

    static String name = "";
    static String billingStreet = "";
    static String billingCity = "";
    static String billingState = "";
    static int billingZipCode = 0;
    static String billingAddress = "";
    static String shippingStreet = "";
    static String shippingCity = "";
    static String shippingState = "";
    static int shippingZipCode = 0;
    static String shippingAddress = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full name: ");
        name = scanner.nextLine();

        getBilling(scanner);
        getShipping(scanner);

        billingAddress = displayBilling();
        shippingAddress = displayShipping();

        System.out.println(name);
        System.out.println("Billing Address: ");
        System.out.println(billingAddress);
        System.out.println("Shipping Address: ");
        System.out.print(shippingAddress);
    }

    public static void getBilling(Scanner scanner) {
        System.out.print("Enter your billing street: ");
        billingStreet = scanner.nextLine();

        System.out.print("Enter your billing city: ");
        billingCity = scanner.nextLine();

        System.out.print("Enter your billing state (NC): ");
        billingState = scanner.nextLine();

        System.out.print("Enter your billing zip code: ");
        billingZipCode = scanner.nextInt();
        scanner.nextLine();

    }

    public static String displayBilling() {
        StringBuilder billAddressBuilder = new StringBuilder();
        billAddressBuilder.append(billingStreet);
        billAddressBuilder.append(System.lineSeparator());
        billAddressBuilder.append(billingCity).append(", " + billingState).append(" " + billingZipCode);

        String billingAddress = billAddressBuilder.toString();
        return billingAddress;
    }

    public static void getShipping(Scanner scanner) {
        System.out.print("Enter your shipping street: ");
        shippingStreet = scanner.nextLine();

        System.out.print("Enter your shipping city: ");
        shippingCity = scanner.nextLine();

        System.out.print("Enter your shipping state (NC): ");
        shippingState = scanner.nextLine();

        System.out.print("Enter your shipping zip code: ");
        shippingZipCode = scanner.nextInt();
        scanner.nextLine();

    }

    public static String displayShipping() {
        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(shippingStreet);
        addressBuilder.append(System.lineSeparator());
        addressBuilder.append(shippingCity).append(", " + shippingState).append(" " + shippingZipCode);

        String shippingAddress = addressBuilder.toString();
        return shippingAddress;
    }


}
