package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        /*
        Scanner 를 이용하여 정수를 입력 받는다.
        가이드 내용 "*을 출력할 라인의 수를 입력하세요 >>"
        만약 정수값이 3이라면
        *
        **
        ***
        만약 정수값이 5라면
        *
        **
        ***
        ****
        ***** 출력이되면된다.
         */
        Scanner star = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요 >>");
        int num = star.nextInt();
        int i = 0;
        int z = 0;
        for (i = 0; i < num; i++) {
            for (z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
