package com.green.day14.ch6;

import java.util.Arrays;

public class MyArrays {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[0]) {
                System.out.printf("[%d", arr[i]);
            } else {
                System.out.printf(",%d", arr[i]);
            }
            //System.out.println(arr[i]);
        }
        System.out.print("]");
    }

    public static String toString(int[] arr) {
        if (arr.length == 0) {
            return "[]";
        }
        String str = String.format("[%d,", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            str += String.format(",%d", arr[i]);
        }
        str += "]";
        return str;
        /*String str = "["+arr[0]; */
    }

}

class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4, 10};
        MyArrays.printArr(arr); // [3, 2, 1, 6, 5, 4, 10 ]   // 하나하나 출력
        System.out.print(Arrays.toString(arr));

        String str = Arrays.toString(arr); // 문장 자체를 만들어서 출력
        System.out.println("str : " + str);

        String str2 = MyArrays.toString(arr);
        System.out.print("str2 : " + str2);

    }
}
