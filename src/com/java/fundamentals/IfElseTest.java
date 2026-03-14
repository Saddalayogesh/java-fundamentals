package com.java.fundamentals;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no1 : ");
        int no1 = scanner.nextInt();
        System.out.println("Enter no2 : ");
        int no2 = scanner.nextInt();
        if (no1 > no2) {
            System.out.println("no1 is greater");
        } else if (no1 == no2) {
            System.out.println("both numbers are equal");
        } else {
            System.out.println("no2 is greater");
        }
    }
}
