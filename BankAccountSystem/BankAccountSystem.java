package BankAccountSystem;

import java.util.Scanner;

class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Create Account
    public void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("\nAccount Created Successfully!");
    }

    // Deposit
    public void deposit(Scanner sc) {
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance += amount;

        System.out.println("Amount Deposited Successfully.");
    }

    // Withdraw
    public void withdraw(Scanner sc) {
        System.out.print("Enter Withdraw Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    // Display Details
    public void displayDetails() {
        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.createAccount(sc);
                    break;

                case 2:
                    account.deposit(sc);
                    break;

                case 3:
                    account.withdraw(sc);
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    account.displayDetails();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}