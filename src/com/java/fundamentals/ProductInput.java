package com.java.fundamentals;

import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        byte id = scanner.nextByte();
        System.out.println("Enter productName");
        String productName = scanner.next();
        System.out.println("Enter manufacturedYear");
        short manufacturedYear = scanner.nextShort();
        System.out.println("Enter maxRetailPrice");
        int maxRetailPrice = scanner.nextInt();
        System.out.println("Enter discountPercentage");
        float discountPercentage = scanner.nextFloat();
        System.out.println("Enter finalPrice");
        double finalPrice = scanner.nextDouble();
        System.out.println("Enter category");
        char category = scanner.next().charAt(0);
        System.out.println("Enter isStockAvailable");
        boolean isStockAvailable = scanner.nextBoolean();
        System.out.println("Enter the product id");
        System.out.println("Enter the product name ");
        System.out.println("Enter the product manufacturedYear");
        System.out.println("Enter the product maxRetailPrice");
        System.out.println("Enter the product discountPercentage");
        System.out.println("Enter the product finalPrice");
        System.out.println("Enter the product category");
        System.out.println("Enter the product isStockAvailable");
    }
}
