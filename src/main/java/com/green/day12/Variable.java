package com.green.day12;

public class Variable {
    static int cv; // 클래스 변수 , 스태틱 변수 static 가 잇으면 Variable 이 메모리에  자동으로 올라감
    int iv; // 인스턴스 변수 , 전역 변수 (Global Variable)  static 이  안붙은 것들은 무조건 객체화가 필요하다 그렇기떄문에 인스턴스 변수 라고부름

    static void staticMethod() {
        int lv = 0; // 지역변수 (Local Variable)
    }

    void method() {
        int lv = 0; // 지역변수 (Local Variable)
    }
}
