package com.green.day14.ch6;

// 매개변수 있는 생성사 (오버로딩된 생성자) ,this 를 배운다
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("white", "auto", 5);
        System.out.printf("c1. color : %s\n , c1.gearType : %s\n , c1.door : %d\n\n", c1.color, c1.gearType, c1.door);

        Car c2 = new Car("black", " manual", 3);
        System.out.printf("c2. color : %s\n , c2.gearType : %s\n , c2.door : %d\n\n", c2.color, c2.gearType, c2.door);

        Car c3 = new Car();
        System.out.printf("c3. color : %s\n , c3.gearType %s\n , c3.door %d\n\n", c3.color, c3.gearType, c3.door);
        //color red , manual, 5
        Car c4 = new Car(c2);
        System.out.printf("c4. color : %s , c4.gearType %s , c4.door %d\n", c4.color, c4.gearType, c4.door);
        // black , manual , 3
    }
}

class Car {
    String color;
    String gearType;
    int door;

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;

        init();
    }

    public Car() {
       /*this.color = "red";
       this.door = 5;
       this.gearType = "manual";*/
        this("red", "manual", 5);
    }

    public Car(Car c2) {
       /* this.color = c2.color;
        this.gearType = c2.gearType;
        this.door = c2.door;*/
        this(c2.color, c2.gearType, c2.door);
    }

    void init() {

    }

}
//   void start(){
//       System.out.println("차 시동을 건다."); //method 가 생성자 호출불가 이미 생성되어있기때문에
//   }
//}
