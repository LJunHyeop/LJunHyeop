package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx26V2 {
    public static void main(String[] args) {
        /*
        1~ 1000까지 계속 값을들 더할껀데 더한값이 100 이상인 index 값이 몇인지 구하시오
         */
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while (true) {
            int result = sum + i + 1; // +1 은 한번 올려본것 처럼 꾸민다음 break; 를 걸어 13을 출력되게 만듦
            if (result > 100) {
                break;
            }
            System.out.printf("%d + %d = %d\n", sum, i + 1, result);
            sum += ++i;
        }
        System.out.println(i);
    }
}
