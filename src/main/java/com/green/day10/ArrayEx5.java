package com.green.day10;

public class ArrayEx5 {
    public static void main(String[] args) {
        /*
        학생들의 국어 점수 입ㄴ디ㅏ. 총점과 평점 출력해주세요
         */
        int[] score = {100, 88, 100, 100, 90};
        int num = 0;
        for (int i = 0; i < score.length; i++) {
            num += score[i];
            System.out.println(num);
        }
        double num2 = (double) num / score.length;
        // num2 = num = num/score.length)
        System.out.printf("평균점수의 총합은 %d 평균은 %.2f \n", num, num2);
    }
}
