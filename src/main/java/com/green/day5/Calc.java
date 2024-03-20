package com.green.day5;

public class Calc {
    public static void main(String[] args) {
        int score = 97;
        int val1 = score / 10; // 0~10 0~2 - 3~6 0 7~9 ++  99> A+ 82 > B- 75 > C0 1의자리 10의자리 구분법
        System.out.println(val1);
        int val2 = score % 10;
        System.out.println(val2);
    }
}
