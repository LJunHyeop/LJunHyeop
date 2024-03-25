package com.green.day8.ch4;

public class FlowEx16_1Result {
    public static void main(String[] args) {
        /*
       star 값이 5라면 별 5개 가로로 5줄 출력한다. 마지막 개행
       *****
       *****
       *****
       *****
       *****
         */
        int star = 5;
        int i = 0;
        int z = 0;
        for (i = 0; i < star; i++) {
            for (z = 0; z < star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
