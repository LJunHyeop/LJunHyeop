package com.green.day11.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        /*
        1. numArr 모든방에 0~9사이의 랜덤값을 넣어주세요 중복허용
        2. numArr 각 칸에 들어있는 값의 갯수를 counterArr 에 저장한다.
        예를들어  [9, 8, 6, 7, 6, 6, 0, 0, 4, 2] 인경우
        counterArr[0] 에는 2
        counterArr[1] 에는 0  각숫자가 몇개있는지를 확인 .
         */
        int len = 10;
        int[] numArr = new int[len];
        int[] counterArr = new int[len];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * numArr.length);
            counterArr[numArr[i]]++;

        }
        for (int i = 0; i < numArr.length; i++) {
            int val = numArr[i];


            counterArr[val]++;  //num Arr 은 val 값이지만 counterArr 입장에서는 방번호가된다.

        }
        System.out.println(Arrays.toString(numArr));
        System.out.print(Arrays.toString(counterArr));
    }
}
