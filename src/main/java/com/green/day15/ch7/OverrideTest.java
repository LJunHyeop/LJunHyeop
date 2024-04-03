package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);
        System.out.println(p.age);
        Child child = new Child();
        child.attack();
        child.doubleAttack();
    }
}


class Parent {
    int age;

    Parent(int age) {
        super();
        this.age = age;  // this.으로 접근할수 있는건 전역변수와 메소드 밖에없다 .  this() 생성자 호출 생성자 만이 가능
    }

    void attack() {
        System.out.println("부모가 공격한다.");
    }

    public void defence() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}


class Child extends Parent {
    int mzPower;

    public Child() {
        super(1);
    }

    @Override
        // 애노테이션 Annotation 검사 느낌 오버라이딩이 아니면 빨간줄 끄임
    void attack() {
        System.out.println("자식이 적을 공격한다");
        // this.attack(); 한무루프
    }

    public void doubleAttack() {
        this.defence(); // 나 부터 뒤지고(찾아보고) 올라간다 생략해도 this.
        super.defence(); //올라가고 난후에 뒤진다(찾아본다).
    }

}