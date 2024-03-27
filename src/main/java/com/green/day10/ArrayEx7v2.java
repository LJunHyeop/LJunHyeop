package com.green.day10;

import java.util.Arrays;

public class ArrayEx7v2 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int abc = 10;
        //10 , 11 , 12 , ~~~19
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = 10 + i;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
