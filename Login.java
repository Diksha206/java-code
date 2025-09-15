package com.inheritance;


import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(password)) {
            System.out.println("Login successful!");
        } else {
            throw new RuntimeException("Invalid password");
        }
    }
}