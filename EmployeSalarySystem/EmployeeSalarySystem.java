package EmployeSalarySystem;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basic, hra, da, gross;

    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Employee ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            name = sc.nextLine();

            System.out.print("Basic Salary: ");
            basic = sc.nextDouble();
        }
    }

    public void calculate() {
        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;
    }

    public void display() {
        System.out.println("--------------------------------");
        System.out.println("ID            : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + gross);
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter Details of Employee " + (i + 1));
            emp[i].input();
            emp[i].calculate();
        }

        System.out.println("\n===== Employee Salary Report =====");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}