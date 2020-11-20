package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = Integer.valueOf(input.next());
        int b = Integer.valueOf(input.next());

        System.out.println("Enter the operation to perform (+, -, *, /): ");
        String c = String.valueOf(input.next());

        switch (c) {
            case "+":
                System.out.printf("%d %s %d = ", a, c, b);
                System.out.println(a+b);
                break;
            case "-":
                System.out.printf("%d %s %d = ", a, c, b);
                System.out.println(a-b);
                break;
            case "*":
                System.out.printf("%d %s %d = ", a, c, b);
                System.out.println(a*b);
                break;
            case "/":
                System.out.printf("%d %s %d = ", a, c, b);
                System.out.println(a/b);
                break;
        }
    }
}
