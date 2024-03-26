package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx26 {
    public static void main(String[] args) {
        /*
        1~ 1000까지 계속 값을들 더할껀데 더한값이 100 미만인 index 값이 몇인지 구하시오
         */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 0;
        int sum = 0;
        while ((sum += ++i) <= num) {
            System.out.printf("%d + %d\n", sum, i + 1);
        }
        System.out.println();
    }
}
