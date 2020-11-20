package com.company;

public class OuterClass {
    public static String msg = "Outer Message";
    public static class NestedStaticClass {
        public void printMsg() {
            System.out.println("Message from inside of static nested class: " + msg);
        }
    }
}
