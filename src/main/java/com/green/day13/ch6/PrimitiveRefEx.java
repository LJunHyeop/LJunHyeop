package com.green.day13.ch6;

public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 10;

        Numbox nb = new Numbox();
        nb.num = 10;

        changeNum(num);
        System.out.println("num : " + num); // 10

        changeNum(nb);
        System.out.println(" nb. num : " + nb.num); // 100

        //void, 같은 클래스 안에 존재 , static Methods  (객체화 x) ,메소드명 ,  파라미터로 정수값 1개 가지고있다.
    }

    public static void changeNum(Numbox n) {
        //n  = new Numbox();
        n.num = 100;
    }

    public static void changeNum(int n) {
        n = 100;
    }
}


class Numbox {
    int num;
}
