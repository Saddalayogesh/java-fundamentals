package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
        System.out.println(n1++);
        ++n1;
        System.out.println(n1);
        System.out.println(n1--);
        --n1;
        System.out.println(n1);
        ++n1;
        --n2;
        int var14 = n1 - n2 + n1++ - n2--;
        ++n1;
        int res = var14 + n1;
        System.out.println(res);
    }
}
