package com.green.day10;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int abc = 10;
        //10 , 11 , 12 , ~~~19
        for (int i = 0; i < numArr.length; i++) {

            numArr[i] += abc;
            ++abc;
            System.out.println(numArr[i]);
        }
    }
}
