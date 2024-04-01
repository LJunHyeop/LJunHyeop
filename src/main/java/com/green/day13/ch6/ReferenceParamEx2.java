package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = {10, 20};
        System.out.printf("int Arr [0] : %d , int Arr[1] : %d \n ", intArr[0], intArr[1]);

        change(intArr);

        System.out.printf("int Arr [0] : %d , int Arr[1] : %d \n ", intArr[0], intArr[1]); // 11 과 21 이 찍혓으면좋겠다
    }

    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;

            ++arr[i];
        }
    }
}
