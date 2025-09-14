package com.inheritance;

import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of OfficeStaff objects: ");
        int n = scanner.nextInt();

        OfficeStaff[] officeStaff = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for OfficeStaff " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Department: ");
            String department = scanner.next();

            officeStaff[i] = new OfficeStaff(id, name, department);
        }

        System.out.println("\nOfficeStaff Details:");
        for (OfficeStaff staff : officeStaff) {
            staff.displayDetails();
            System.out.println();
        }
    }
}