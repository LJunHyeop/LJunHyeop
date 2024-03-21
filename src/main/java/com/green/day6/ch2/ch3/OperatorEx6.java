package com.green.day6.ch2.ch3;
//p.98 ~

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = (byte) (a + b);
        System.out.println(c); //byte + byte (short)도가능 가되면 int 로 변환되어서 출력

        int d = 1_000_000;
        System.out.println(d);

        long e = 1_000_000L * 1_000_000; // int * int  라 OverFlow 가 되어 값이 -727379968이 나옴
        long f = 1_000_000 * 1_000_000L; // long * long 이라 long type 가 저장할 수 있는 범위다 .
        System.out.println("e : " + e);
        System.out.println("f : " + f);

        double g = (double) 10 / 3;
        System.out.println("g : " + g);
    }
}
