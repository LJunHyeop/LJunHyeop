package com.green.day8.ch4;

public class FlowEx16_1 {
    public static void main(String[] args) {
        int star = 5;
        int i = 0;
        /*
        Star 값이 5 라면 별 5개 가로로 출력한다.  마지막 개행
        star 값이 3 이라면 별을 3개 가로로 출력한다.
         */
        for (i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
