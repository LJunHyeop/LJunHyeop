package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char grade = 'd';
        System.out.println("점수를 입력해 주세요 >>");
        int score = scan.nextInt();
        scan.close();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 70;
            }
            System.out.printf("당신의 학점은 %c 입니다.\n", grade);
        }
        System.out.println("----종료----");
    }
}
