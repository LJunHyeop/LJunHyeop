package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        /*
        가이드로 " 숫자를 입력하세요 . (예 12345) >>
        12345 라는 숫자를 정수로 값을 받는다.
        1+2+3+4+5 했는 결과값을 출력하는것
        "각 자리 수의 합 : 15" (출력)
        12345 % 10 >5
        > 12345 / 10 > 1234
        1234 % 10 > 4
        1234 / 10 > 123
         */
        Scanner num = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num2 = num.nextInt();
        int num3 = num2 / 10;
        int num4 = num3 / 10;
        int num5 = num4 / 10;
        int num6 = num5 / 10;
        int num7 = num2 % 10;
        int num8 = num3 % 10;
        int num9 = num4 % 10;
        int num10 = num5 % 10;
        int num11 = num6 % 10;
        System.out.printf("%d", num7 + num8 + num9 + num10 + num11);
    }
}
