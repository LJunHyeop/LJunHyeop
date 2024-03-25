package com.green.day8.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        /*
        2~9단 출력하기 2x1 =2 2x2=4 ...... 2x9 = 18


        9.9까지 출력
         */
        int dan = 0;
        for (int i = 2; i < 10; i++) {
            if (i > 2) {
                System.out.println("-----");
            }
            for (dan = 1; dan < 10; dan++)
                System.out.printf("%d x %d = %d\n", i, dan, i * dan);

        }
    }
}
