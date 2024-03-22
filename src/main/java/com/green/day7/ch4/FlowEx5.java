package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
         /*
        Scanner 를 통해 점수를 입력 받으세요
        점수는 정수로 바로 받으시고 , grade(학점)을 관리할 문자 타입을 선언해주세요.
        만약 점수가 90점 이상이면 grade 에 A값을 저장하고
        만약 점수가 80점이상이면 grade 에 B값을 저장하고
        나머지는 C학점
        1점대가 0~2 -
        1점대가 3~6 0
        1점대가 7~9 +
        C 학점은 오로지 C 학점만 나오게
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 ");
        int score = scan.nextInt();
        char symbol = '+';
        char grade = 'c';
        int num = score % 10;
        if (score < 0 || score > 100) {
            System.out.println("점수 입력이 잘못 되었습니다.");
        } else if (score == 100) {
            grade = 'A';
            System.out.printf("당신은 %c%c 입니다", grade, symbol);
        } else if (score >= 90) {
            grade = 'A';
            switch (num) {
                case 0, 1, 2: {
                    symbol = '-';
                    System.out.printf("당신은 %c%c 입니다.\n", grade, symbol);
                }
                case 3, 4, 5, 6: {
                    symbol = '0';
                    System.out.printf("당신은 %c%c 입니다.\n", grade, symbol);
                }
                case 7, 8, 9: {
                    symbol = '+';
                    System.out.printf("당신의 학점은 %c%c 입니다,\n", grade, symbol);
                    {
                        break;
                    }
                }
            }
        } else if (score >= 80) {
            grade = 'B';
            switch (num) {
                case 0, 1, 2: {
                    symbol = '-';
                    System.out.printf("당신은 %c%c 입니다.\n", grade, symbol);
                }
                case 3, 4, 5, 6: {
                    symbol = '0';
                    System.out.printf("당신은 %c%c 입니다.\n", grade, symbol);
                }
                case 7, 8, 9: {
                    symbol = '+';
                    System.out.printf("당신은 %c%c 입니다,\n", grade, symbol);
                    {
                        break;
                    }
                }
            }
        } else {
            System.out.printf("당신은 %c입니다", grade);
        }
    }
}
