package com.green.day19;

import java.util.Arrays;

public class ExamTest {
    public static void main(String[] args) {
        String str = "1,2,3,4";
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
    }
}

class Exam {

}