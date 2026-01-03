package projects;/*
 * Bank Menu Application
 * Java Training Practice
 * Author: Nihir
 */

import java.util.Scanner;

// Renamed class to avoid duplicate purpose
class UserAccount {
    int userId;
    String name;
    String accountNumber;
    String email;
    double balance;

    UserAccount(int userId, String name, String accountNumber, String email, double balance) {
        this.userId = userId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount cannot be negative.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        }
    }

    void display() {
        System.out.println("\n--- User Details ---");
        System.out.println("Name           : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Email          : " + email);
        System.out.println("Balance Amount : " + balance);
    }
}

public class BankMenuApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserAccount[] users = new UserAccount[10]; // max 10 users
        int userCount = 0;

        while (true) {

            System.out.println("\n====== MENU ======");
            System.out.println("1) Create account");
            System.out.println("2) Withdraw money");
            System.out.println("3) Deposit money");
            System.out.println("4) Display by user");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the number of users: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEnter account details of user " + (userCount + 1));

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Account Number: ");
                        String accNo = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        System.out.print("Initial Amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        users[userCount] = new UserAccount(
                                userCount + 1, name, accNo, email, amount
                        );
                        userCount++;
                    }
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int wid = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double wamt = sc.nextDouble();

                    if (wid > 0 && wid <= userCount) {
                        users[wid - 1].withdraw(wamt);
                    } else {
                        System.out.println("Invalid User ID");
                    }
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    int did = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double damt = sc.nextDouble();

                    if (did > 0 && did <= userCount) {
                        users[did - 1].deposit(damt);
                    } else {
                        System.out.println("Invalid User ID");
                    }
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();

                    if (uid > 0 && uid <= userCount) {
                        users[uid - 1].display();
                    } else {
                        System.out.println("Invalid User ID");
                    }
                    break;

                case 0:
                    System.out.println("Program exited successfully.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
