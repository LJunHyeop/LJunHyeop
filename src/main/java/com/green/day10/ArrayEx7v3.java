package com.green.day10;

import java.util.Arrays;

public class ArrayEx7v3 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = 10 + i;
        }
        //10 , 11 , 12 , ~~~19
        int abc = 0;
        for (int i = 0; i < numArr.length; i++) {
            int a = (int) (Math.random() * 10.0);
            abc = numArr[i];
            numArr[i] = numArr[a];
            numArr[a] = abc;

            System.out.printf("%d %d\n ", i, a);
            System.out.println(Arrays.toString(numArr));
        }
    }
}
