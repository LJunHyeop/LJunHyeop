package com.green.day8.ch4;

public class FlowEx16_3 {
    public static void main(String[] args) {
        /*
        가로 10개 세로 5개 별 출력해주세요
         */
        int i = 0;
        int z = 0;
        for (i = 0; i < 10; i += 2) {
            for (z = 0; z < 10; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
