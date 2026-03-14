package com.java.fundamentals;

import java.util.Scanner;

public class BasicAmazonApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Place Order");
            System.out.println("4. Delivery");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Registered Successfully");
                case 2 -> System.out.println("Login Successfully");
                case 3 -> System.out.println("Order Placed Successfully");
                case 4 -> System.out.println("Your Order is Delivered");
                case 5 -> System.out.println("Thank You");
                default -> System.out.println("Invalid Choice");
            }

        }
    }
