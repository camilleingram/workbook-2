package com.pluralsight;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TheaterReservations {

    static Scanner scanner = new Scanner(System.in);
    static String name = "";
    static String date = "";
    static LocalDate showDate;
    static int ticketAmount = 0;

    public static void main(String[] args) {
        name = formatName();
        showDate = formatDate();
        ticketAmount = getTicketAmount(scanner);

        displayOrder();
    }

    public static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        return name;
    }

    public static String formatName() {
        String scannerName = getName(scanner);
        String firstName = scannerName.substring(0, scannerName.indexOf(" ")).trim();
        String lastName = scannerName.substring(scannerName.lastIndexOf(" ")).trim();
        name = lastName + ", " + firstName;

        return name;
    }


    public static String getDate(Scanner scanner) {
        System.out.print("What day is the show? (mm/dd/yyyy) ");
        date = scanner.nextLine();

        return date;
    }

    public static LocalDate formatDate() {
        date = getDate(scanner);
        String[] parts = date.split("/");
        String formattedDate = parts[2] + '/' + parts[0] + '/' + parts[1];
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate newDate = LocalDate.parse(formattedDate, format);
        return newDate;
    }

    public static int getTicketAmount(Scanner scanner) {
        System.out.print("How many tickets will you need? ");
        ticketAmount = scanner.nextInt();
        scanner.nextLine();

        return ticketAmount;
    }

    public static void displayOrder() {
        System.out.printf("%d ticket(s) reserved for %s under %s.", ticketAmount, showDate, name);
    }
}
