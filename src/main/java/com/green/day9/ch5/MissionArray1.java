package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30, 40, 50};
        /*
        for 문을 활용 해서 10,20,30,40,가 출력될수있게
         */
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = numArr[i];
        }
        for (int i = 0; i < numArr.length; i++) {
            if (i < numArr.length - 1) {
                System.out.printf("%d,", numArr[i]);
            } else System.out.printf("%d", numArr[i]);
        }
    }
}
