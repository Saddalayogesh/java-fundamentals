package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price ");
        double productPrice = sc.nextDouble();
        System.out.println(" Enter Membership Type");
        char membershipType = sc.next().charAt(0);
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();

        double discount = 0;
        double shipping = 0;

        if (membershipType == 'S') {
            discount = 0.10;
            shipping = 50;
        } else if (membershipType == 'G') {
            discount = 0.15;
            shipping = 20;
        } else if (membershipType == 'D') {
            discount = 0.20;
            shipping = 0;
        } else {
            discount = 0;
            shipping = 100;
        }
        double discountAmount = productPrice * discount;
        double discountedPrice = productPrice - discountAmount;
        double taxAmount = discountedPrice * 0.05;

        double finalPrice = discountedPrice + taxAmount + shipping;
        double totalBill = finalPrice * quantity;
        double totalSavings = discountAmount * quantity;


        System.out.println("Product Price: " + productPrice);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price per Product: " + finalPrice);
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Total Savings: " + totalSavings);

        sc.close();
    }
}

