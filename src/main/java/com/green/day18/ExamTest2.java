package com.green.day18;

import java.util.Arrays;

public class ExamTest2 {
    public static void main(String[] args) {
        Exam2.printGugudan(2, 4);
        /*
        2x1 =2 (tab)\t  3x1 = 3 4x1=4(개행)
        2x2 =4 (tab)\t  3x2 = 6 4x2=8(개행)
        2x9 =18 (tab)\t  3x9 = 27 4x9=36(개행)
         */

        int sum = Exam2.getSumFromString("232323"); //2+3+2+2+3 (12) 값 기런
        System.out.println(sum);
        int sum2 = Exam2.getSumFromString("111"); //1+1+1 (3) 값 기런
        System.out.println(sum2);
        System.out.println("================");

        int[] arr = new int[3];
        Exam2.inputRandomValue(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Exam2 {
    static void inputRandomValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rVal = (int) (Math.random() * arr.length) + 1;
            arr[i] = rVal;

            for (int z = 0; z < i; z++) {
                if (arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    //    static void inputRandomValue (int[]arr ){
//        int num = (int)(Math.random()*10)+1;
//        for(int i = 0; i<arr.length; i++){
//            while (arr[i] != arr[i])
//            arr[i] = num;
//
//        }
//    }
    static void printGugudan(int num, int sum) {
        for (int k = 1; k < 10; k++) {
            for (int i = num; i <= sum; i++) {
                System.out.printf(" %d x %d = %d\t", i, k, i * k);
            }
            System.out.println();
        }
        System.out.println("------");
    }

    static int getSumFromString(String str) {
        int sum = 0;
        int val = Integer.parseInt(str);
        do {
            int oneDigit = val % 10;
            sum += oneDigit;
            val /= 10;
        } while (val > 0);
        return sum;
    }

//    static int getSumFromString(String str){ // 문자 배열로 처리
//        int sum = 0;
//        char[] charArr = str.toCharArray();
//        for(int i = 0; i<charArr.length; i++){
//            char ch = charArr[i];
//            int val = Character.getNumericValue(ch);
//            sum+= val;
//        }return sum;
//    }


//    static int getSumFromString(String num){
//        int sum2= 0;
//        int num2 = Integer.parseInt(num);
//        while (num2 != 0){
//          sum2 += num2 % 10;
//          num2  = num2 / 10;
//        }
//        return sum2;
//    }
}

