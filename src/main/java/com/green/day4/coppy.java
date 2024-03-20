package com.green.day4;

public class coppy {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                num = num + i;
            }
        }
        System.out.print(num);
    }
}
