package com.green.day15.ch7;

public class FinalTest {
    public static void main(final String[] args) {
        Car c = new Car(2200);     // 값변경 불가
        System.out.println(c.CC);
        Car c2 = new Car(3000);
        System.out.println(c2.CC);

    }
}

class Car {
    final int CC; //생성자를 이용하면 Lazy 처리 가능함 Lazy(잠깐 뒤로 미룬다 는느낌)

    Car(int CC) {
        this.CC = CC;
    }

    Car() {
        CC = 100;
    }

    final void start() {
        System.out.println("자동차 시동을 건다 ");
    }

}

final class Suv extends Car {  //final class 는 상속 금지
//    void start(){
//        System.out.println("자동차 시동을 건다 "); 빨간줄 오버라이딩 금지
//    }
}
//class Tuscon extends Suv{
// final 이 있기때문에 상속 금지
//}