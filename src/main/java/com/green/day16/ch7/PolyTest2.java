package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();
        Animal ani = new Dog();

        doCrying(dog); //강아지가 잔다.
        doCrying(bullDog); // 불독이 잔다
        doCrying(cat);
//        doCrying(ani);

    }

    public static void doCrying(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).sleep();
        }
        animal.crying();
    }

}
