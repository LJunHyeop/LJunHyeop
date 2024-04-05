package com.green.day17.ch7;

interface Movable {
    void move();
}

public class AnnonymousTest2 {
    public static void main(String[] args) { //1
        Movable m1 = new MyMove();
        m1.move();
        Movable m2 = new Movable() {   //1 .2 번 작업을 한번에 끝낸것이다 익명 클래스 이름없이 씀
            @Override
            public void move() {
                System.out.println("일본으로 가자 !!");
            }
        };
        m2.move();
    }
}

class MyMove implements Movable {
    @Override
    public void move() {
        System.out.println("서울까지 가자~~");//2
    }
}
