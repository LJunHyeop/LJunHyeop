package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx25V2 {
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

        Scanner star = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = star.nextInt();
        int num2 = num;
        int sum = 0;
        while (num2 != 0) {
            int oneDigit = num2 % 10;
            sum += oneDigit;
            num2 /= 10;
        }
        System.out.printf(" 각 자리수의 합 %d\n", sum);
    }
}
