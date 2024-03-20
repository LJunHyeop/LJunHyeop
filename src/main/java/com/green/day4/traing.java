package com.green.day4;

public class traing {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101);//0~100점사이의 랜덤값
        System.out.println("score : " + score);
        String grade = "F";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        System.out.printf("당신의학점은 %s입니다.\n", grade);
    }
}
