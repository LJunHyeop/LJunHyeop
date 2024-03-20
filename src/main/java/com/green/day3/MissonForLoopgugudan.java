package com.green.day3;

public class MissonForLoopgugudan {
    public static void main(String[] args) {
        int dan = (int) (Math.random() * 8.0) + 2;
        System.out.println("dan:" + dan);
        for (int i = 1; i <= 9; i++) {
            //System.out.printf("%d x %d = %d\n", dan,i,(dan *i));
            System.out.println(dan + "*" + i + "=" + (dan * i)); // dan=2  2x1 = 2 2x2= .... 2x9= 18  dan= 5 구구단 5만들기
        }
    }
}
