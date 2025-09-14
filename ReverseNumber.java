package com.inheritance;

public class ReverseNumber {


    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one integer as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            int reversedNumber = 0;

            while (number != 0) {
                int remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
