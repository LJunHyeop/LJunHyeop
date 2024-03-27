package com.green.day10;

public class ArrayEx6 {
    public static void main(String[] args) {
        /*
        score 에서 가장 큰값 가장 작은값 찾아내서 출력
       mni : 33 max :  100  값을 추가해도 큰값이 나오게 출력
         */
        int[] score = {79, 88, 91, 33, 100, 55, 95, 200};
        int min = score[0];
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            }
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.printf("최댓값 %d 최솟갑 %d \n", max, min);
    }
}
