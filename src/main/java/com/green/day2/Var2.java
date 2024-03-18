package com.green.day2;

public class Var2 {
    public static void main(String[] args) {
        //변수 선언 동시에 초기화
        int globalnum; // 전역변수
        int num = 10, num2 = 11, num3 = 0; // 지역변수 는 초기화 필수
        num3 = num + num2;
        System.out.println(num3);
        //num3 = 10 + 11;
        //num3 = 21;
        num3 = num3 + 3;
        System.out.println(num3);
        //num3 = 21 + 3;
        //num3 = 24;
        num3++;
        ++num3;
        System.out.println(num3);

    }
}
