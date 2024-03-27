package com.green.day10;

import java.util.Arrays;

public class ArrayStudy4V2 {
    public static void main(String[] args) {
        int[] nArr1 = {10, 20, 30, 40};
        int[] nArr2 = new int[nArr1.length]; //new 가 들어가야된다.

        System.arraycopy(nArr1, 0, nArr2, 0, nArr1.length);

        System.out.println(Arrays.toString(nArr1));
        System.out.println(Arrays.toString(nArr2));


    }
}
