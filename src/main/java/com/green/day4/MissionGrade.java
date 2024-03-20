package com.green.day4;

public class MissionGrade {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101);//0~100점사이의 랜덤값
        System.out.println("score : " + score);
        String grade = "F";

        if (score >= 90) {
            System.out.println("당신의학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("당신의학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("당신의학점은 C입니다.");
        } else {
            System.out.println("당신의 학점은 f입니다.");
        }
        System.out.println("----종료----");
    }
}
