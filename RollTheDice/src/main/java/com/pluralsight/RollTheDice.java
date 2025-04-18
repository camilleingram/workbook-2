package com.pluralsight;

public class RollTheDice {

    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int sum;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            switch (sum) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }
            System.out.printf("%d - %d Sum: %d%n", roll1, roll2, sum);
        }

        System.out.printf("Two was rolled %d times%n", twoCounter);
        System.out.printf("Four was rolled %d times%n", fourCounter);
        System.out.printf("Six was rolled %d times%n", sixCounter);
        System.out.printf("Seven was rolled %d times", sevenCounter);

    }
}
