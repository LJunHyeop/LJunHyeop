package com.green.day9.ch4;

import java.util.Scanner;

// p.172
public class FlowEx27 {
    public static void main(String[] args) {
        /*
        가이드 출력 " 합게를 구할 숫자를 입력하세요.
        가이드 출력이 계속된다 0을 입력할때 까지 (종료 :0)>>
        입력한 모든 숫자를 더한 값을 마지막에 출력한다
        출력 포맷은 자유
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. 종료 : 0");
        int sum = 0;
        int num2 = scan.nextInt();
        while (num2 != 0) {
            num2 = scan.nextInt();
            sum += num2;
            System.out.printf("sum : %d\n", sum);
            if (num2 == 0) {
                System.out.println("---종료---");
            }
        }
    }
}
