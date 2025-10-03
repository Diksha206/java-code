package Abstraction;


interface Workable {
    void work();
}

interface Payable {
    double getSalary();
}

class Employee implements Workable, Payable {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as an Employee.");
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }

    @Override
    public double getSalary() {
        return baseSalary + 5000;
    }
}

class Developer extends Employee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding software.");
    }

    @Override
    public double getSalary() {
        return baseSalary + 3000;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ravi", 40000);
        Employee e2 = new Developer("Anita", 35000);

        e1.work();
        System.out.println("Salary: " + e1.getSalary());

        e2.work();
        System.out.println("Salary: " + e2.getSalary());
    }
}

