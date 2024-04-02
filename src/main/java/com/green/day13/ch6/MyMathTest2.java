package com.green.day13.ch6;

//p279
public class MyMathTest2 {
    public static void main(String[] args) {

        System.out.println(Math.abs(-100));
        long r = MyMath2.add(10, 20); // static 가 붙어있기때문에 객체 생성과 상관없이 메모리에 올라가기떄문에 사용가능 // 앞에 MyMath2를 지워서 빨간줄이안뜨면 같은 클래스에있고 스태틱 메소드이다.
        System.out.println("r : " + r);

        MyMath2 myMath2 = new MyMath2();
        long r2 = myMath2.add();
        System.out.println("r2 : " + r2);
    }
}

class MyMath2 {
    long n1, n2;

    static long add(long n1, long n2) {
        System.out.println("add()");
        return n1 + n2; // 이름이 똑같앗을때 윗보다 아래가 가까우므로 아래로 이용함  이름이 달랐을때 윗 long 도 객체화가 되면 사용가능.
        // 객체화가 되지않앗는데 무조건 객체화 가되었다고 말을 할 수 없음 .
    }

    long add() {
        System.out.println("add10,20");
        add(10, 20);

        return n1 + n2;
    }
}
