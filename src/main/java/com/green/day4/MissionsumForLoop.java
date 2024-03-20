package com.green.day4;

public class MissionsumForLoop {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 11; i++) {
            num = num + i;
        }
        System.out.println("num: " + num);
    }
}
//1 ~ 10까지 더한 값을 출력