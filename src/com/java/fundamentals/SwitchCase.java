package com.java.fundamentals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of Subject 4: ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of Subject 5: ");
        int s5 = sc.nextInt();
        int total = s1 + s2 + s3 + s4 + s5;
        double average = (double)total / (double)5.0F;
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        if (average >= (double)90.0F) {
            System.out.println("Grade: A");
        } else if (average >= (double)80.0F) {
            System.out.println("Grade: B");
        } else if (average >= (double)65.0F) {
            System.out.println("Grade: C");
        } else if (average >= (double)50.0F) {
            System.out.println("Grade: D");
        } else if (average >= (double)35.0F) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }

    }
}
