package com.green.day6.ch2;

public class OverFlowUnderFlow {
    public static void main(String[] args) {
        int i = 127;
        byte b = 0; //=-128~ 127

        int i2 = -126;
        System.out.println((byte) i2);

        int n3 = 100; //n3 를 byte 로 형변환  //형변환 할 수 있는 값인지 체크하는 if문 작성

        if (Byte.MIN_VALUE <= n3 && n3 <= Byte.MAX_VALUE) {
            System.out.println("형변환이 가능합니다.");
        }

        /*if (Byte.MAX_VALUE >= i) {
            b = (byte) i;
            System.out.println("b :" + b);
        }
        if (Byte.MAX_VALUE <= i2) {
            byte b2 = (byte) i2;
            System.out.println("b2 : " + b2);
        }
        System.out.println("----종료----");// Over.Flow*/
    }
}
