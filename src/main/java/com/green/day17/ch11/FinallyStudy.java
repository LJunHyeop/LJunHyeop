package com.green.day17.ch11;

public class FinallyStudy {
    public static void main(String[] args) {
        method(2);
    }

    public static void method(int val) {
        try {
            if (val % 2 == 0)
                return;
        } catch (Exception e) {
            System.out.println("예외발생");
        } finally {
            System.out.println("finally");
        }
        System.out.println("methods 종료");
    }
}
