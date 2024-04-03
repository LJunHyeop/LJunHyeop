package com.green.day14.ch7;
// p.316 is - α(상속관계) has - α (포함관계)  관계

public class CarTest {
    public static void main(String[] args) {

    }
}

class Car {
    int cc;
    String company;
    Speaker speaker;

    void drive() {
        System.out.println(" 자동차가 붕붕");
    }
}

class Avante extends Car {
    int volume;

    void play() {
        System.out.println("음악이 흘러나온다.");
    }
}

class Speaker {

}


//아반떼
//차


//차
//스피커