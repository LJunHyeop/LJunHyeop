package com.green.day13.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 10};
        System.out.println(Arrays.toString(arr));


        printIntArr(arr); // [3, 2, 1, 6, 5, 4 ]

    }

    public static void printIntArr(int[] num) {
        if (num.length == 0) {
            return;
        }
        System.out.printf(" [%d,", num[0]);
        for (int i = 1; i < num.length; i++) {
            System.out.printf(" , %d ", num[i]);
        }
        System.out.println("]");
        System.out.println(Arrays.toString(num));
    }
}
