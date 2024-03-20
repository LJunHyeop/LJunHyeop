package com.green.day4;

public class pirmary {
    public static void main(String[] args) {
        String num = "*";
        String num2 = "0 ";
        for (int i = 2; i < 10; i++) {
            System.out.print(num2);
            for (int j = 0; j < i; j++) {
                System.out.println(num);
            }
        }
    }
}


