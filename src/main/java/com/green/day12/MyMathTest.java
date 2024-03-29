package com.green.day12;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.add(10, 20);
        myMath.add(100, 200);
        myMath.minus(100, 50); //100-50 = 50
        myMath.minus(200, 50); //200-50 = 50

        System.out.println(myMath.returnAdd(500, 600));
    }
}

class MyMath {
    void method1() {

    }

    int method2() {
        return 10;
    }
    // 리턴 메소드 , void 메소드 크게 두가지로 나뉜다. 공식적인건 아님
    // 리턴 메소드는 외부에 무조건 값을 던져야하는 or 값을 돌려줘야하면 리턴
    //자체 해결은 void 메소드

    // 리턴타입 void 메소드명 add 파라미터(소괄호안 ) 매개변수 라고 부름
    // {} 부분은 > 메소드 구현부
    void add(int n1, int n2) {
        System.out.printf(" %d + %d = %d\n", n1, n2, n1 + n2);    // static 가 안붙엇는데 사용하고싶을땐 무조건 객체화를 해줘야한다.
        // 위랑 아래랑 n1 을 써두되는이유가 스코프가 겹치지 않아서.
    }

    int returnAdd(int n1, int n2) {    //인트가 들어갓다고해서 리턴타입을 꼭 int 로 내보낼필요는없다  리턴 type 을 마음대로 바꿀 수 있다.
        return n1 + n2;
    }

    void minus(int n1, int n2) {
        System.out.printf(" %d - %d = %d\n", n1, n2, n1 - n2);
    }
}