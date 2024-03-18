package com.green.day3;

public class ifMultiple {
    public static void main(String[] args) {
        int val1 = 9, val2 = 100;
        if (val1 % 2 == 0) {
            if (val2 % 2 == 0) {
                System.out.println(val2 - val1);
            } else {
                System.out.println(val2);
            }
            //val1 이 짝수고 val2도 짝수면 val2 - val1 값을 출력
            //val1 이 홀수고 val2가 짝수면 val2-5 값을 출력
        } else {
            if (val2 % 2 == 0) {
                System.out.println(val2 - 5);
            } else {
                System.out.println(val2);
            }
        }
    }
}
