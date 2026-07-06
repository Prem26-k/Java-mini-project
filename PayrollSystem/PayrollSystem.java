package PayrollSystem;

import java.util.Scanner;

class Employee {

    int empId;
    String empName;
    double basicSalary;
    double hra, da, pf, tax, grossSalary, netSalary;

    // Input Employee Details
    public void input(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    // Calculate Salary
    public void calculateSalary() {

        hra = basicSalary * 0.20;   // 20%
        da = basicSalary * 0.10;    // 10%
        pf = basicSalary * 0.12;    // 12%
        tax = basicSalary * 0.05;   // 5%

        grossSalary = basicSalary + hra + da;
        netSalary = grossSalary - pf - tax;
    }

    // Display Payroll
    public void display() {

        System.out.println("\n========== PAYROLL ==========");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("PF            : " + pf);
        System.out.println("Tax           : " + tax);
        System.out.println("Gross Salary  : " + grossSalary);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class PayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        int choice;

        do {

            System.out.println("\n===== PAYROLL SYSTEM =====");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Payroll");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    emp.input(sc);
                    break;

                case 2:
                    emp.calculateSalary();
                    System.out.println("Salary Calculated Successfully.");
                    break;

                case 3:
                    emp.display();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}