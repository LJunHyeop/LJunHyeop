package com.green.day16.ch7;

/*
다형성 대전제 3가지
 */
public class PolyTest {
    public static void main(String[] args) {
        Animal ani_1 = new Dog();
        Animal ani_2 = new BullDog();
        Animal ani_3 = new Cat();
        Dog dog_1 = new BullDog();
//        Dog dog_2 = new Animal();  컴파일 에러
//        Dog dog_3 = (Dog)new Animal();
        ani_1.crying();
        Dog dog_4 = (Dog) ani_1;
        dog_4.sleep();

        BullDog dog_5 = (BullDog) ani_2;
        dog_5.sleep();
        Dog dog_6 = (Dog) ani_2;
        dog_6.sleep();

        System.out.println("---------종료-----------");
    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다");
    }
}

class Dog extends Animal {
    void crying() {
        System.out.println("강아지가 멍멍");
    }

    void sleep() {
        System.out.println("강아지가 잔당");
    }
}


class BullDog extends Dog {
    void crying() {
        System.out.println("불독이 월월");
    }

    void sleep() {
        System.out.println("불독이 잔당");
    }
}

class Cat extends Animal {
    void crying() {
        System.out.println("고먐미가 야옹 ");
    }
}