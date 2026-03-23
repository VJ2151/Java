//package BalanceApp.test;
//
//import java.util.Scanner;
//
//public class BankApp {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter ID: ");
//        int id = sc.nextInt();
//        sc.nextLine();
//
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter Balance: ");
//        double balance = sc.nextDouble();
//        sc.nextLine();
//
//        System.out.print("Set Password: ");
//        String password = sc.nextLine();
//
//        Account acc = new Account(id, name, balance, password);
//
//        // Login
//        System.out.print("\nEnter Password to Login: ");
//        String pass = sc.nextLine();
//
//        if (!acc.login(pass)) {
//            System.out.println("Wrong Password!");
//            return;
//        }
//
//        while (true) {
//            System.out.println("\n--- MENU ---");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Display");
//            System.out.println("4. Exit");
//
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter amount: ");
//                    double d = sc.nextDouble();
//                    acc.deposit(d);
//                    break;
//
//                case 2:
//                    System.out.print("Enter amount: ");
//                    double w = sc.nextDouble();
//                    acc.withdraw(w);
//                    break;
//
//                case 3:
//                    acc.display();
//                    break;
//
//                case 4:
//                    System.out.println("Thank you!");
//                    System.exit(0);
//            }
//        }
//    }
//}