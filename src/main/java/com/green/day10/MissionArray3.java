package com.green.day10;

import java.util.Arrays;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        int i = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = i;
        System.out.print(Arrays.toString(numArr));
    }
}
/*
스와핑 0번칸 2번칸 스와핑
 */