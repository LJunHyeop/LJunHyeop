package com.green.day10;

import java.util.Arrays;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] nArr1 = {10, 20, 30, 40};
        int[] nArr2 = new int[nArr1.length]; //new 가 들어가야된다.

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));
        nArr2 = nArr1;
        System.out.println(Arrays.toString(nArr2));


    }
}
