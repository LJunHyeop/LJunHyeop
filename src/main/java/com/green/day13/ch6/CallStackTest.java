package com.green.day13.ch6;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
        CallStackTest.firstMethod();
    }

    public static void firstMethod() {
        System.out.println("Call firstMethod");
        secondMethod();
    }

    public static void secondMethod() {
        System.out.println("call SecondMethod");
    }
}
