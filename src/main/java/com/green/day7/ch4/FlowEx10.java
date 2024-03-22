package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
     /*
     90점 이상은 당신의 학점은 A 입니다.
     80점 이상은 당신의 학점은 B 입니다.
     70점 이상은 당신의 학점은 C 입니다.
     나머지 당신의학점은 F 입니다.
      */
        Scanner num = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 >>>>");
        int num2 = num.nextInt();
        int abc = num2 / 10;
        if (num2 > 100 || num2 < 0) {
            System.out.println("잘못입력 되었습니다.");
        } else {
            String result = switch (abc) {
                case 10, 9 -> "당신의 학점은 A입니다";
                case 8 -> "당신의 학점은 B입니다";
                case 7 -> "당신의 학점은 C입니다";
                default -> "당신의 학점은 F입니다";
            };
            System.out.println(result);
        }
    }
}
