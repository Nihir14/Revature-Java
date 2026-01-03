package projects;

/*
 * Simple Bank Account Application
 * Java Training Practice
 * Author: Nihir
 */

import java.util.Scanner;

class Account {
    int userId;
    String name;
    double balance;

    Account(int userId, String name, double balance) {
        this.userId = userId;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Balance : " + balance);
    }
}

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating 3 user accounts
        Account a1 = new Account(1, "User One", 1000);
        Account a2 = new Account(2, "User Two", 2000);
        Account a3 = new Account(3, "User Three", 3000);

        System.out.print("Enter User ID (1 / 2 / 3): ");
        int uid = sc.nextInt();

        Account currentAccount = null;

        if (uid == 1) currentAccount = a1;
        else if (uid == 2) currentAccount = a2;
        else if (uid == 3) currentAccount = a3;
        else {
            System.out.println("Invalid User ID");
            return;
        }

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    currentAccount.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    currentAccount.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: " + currentAccount.balance);
                    break;

                case 4:
                    currentAccount.display();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

