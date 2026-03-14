package com.java.fundamentals;

import java.util.Scanner;

public class OperatorsAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        byte id = scanner.nextByte();
        System.out.println("Enter productName");
        String productName = scanner.next();
        System.out.println("Enter maxRetailPrice");
        int maxRetailPrice = scanner.nextInt();
        System.out.println("Enter discountPercentage");
        float discountPercentage = scanner.nextFloat();
        double stateTax = (double)2.5F;
        double centralTax = (double)2.5F;
        double discountAmount = (double)(((float)maxRetailPrice + discountPercentage) / 100.0F);
        double finalPrice = (double)maxRetailPrice - discountAmount;
    }
}
