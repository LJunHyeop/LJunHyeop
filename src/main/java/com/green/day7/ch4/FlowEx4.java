package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        /*
        Scanner 를 통해 점수를 입력 받으세요
        점수는 정수로 바로 받으시고 , grade(학점)을 관리할 문자 타입을 선언해주세요.
        만약 점수가 90점 이상이면 grade 에 A값을 저장하고
        만약 점수가 80점이상이면 grade 에 B값을 저장하고
        만약 점수가 70점이상이면 grade 에 C값을 저장하고
        만약 점수가 60점이상이면 grade 에 F값을 저장하고
         */
        Scanner result = new Scanner(System.in);
        System.out.println("점수를 입력해주세요");
        String abc = result.nextLine();
        String grade = "D";
        int a = Integer.parseInt(abc);
        if (a < 0 || a > 100) {
            System.out.println("점수 입력이 잘못되었습니다.");
        } else if (a >= 90 && a <= 100) {
            grade = "A";
            System.out.printf("당신의 학점은 는 %s 입니다.", grade);
        } else if (a >= 80 && a < 90) {
            grade = "B";
            System.out.printf("당신의 학점은 는 %s 입니다.", grade);
        } else if (a >= 70 && a < 80) {
            grade = "C";
            System.out.printf("당신의 학점은 는 %s 입니다.", grade);
        } else {
            System.out.printf("당신의 학점은 는 %s 입니다.", grade);
        }
    }
}
