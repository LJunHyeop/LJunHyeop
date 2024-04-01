package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {

    }
}

/*
 오버 로딩 : 같은 이름의 메소드를 여러개 작성 가능하게 해주는 기법/기술
 오버 로 딩은 매개 변수로 구분(변수명은 상관없다)만 가능하면 작성 가능 (오로지 매개변수만 따진다 타입 순서 , 갯수 등 )
 리턴타입은 상관 x
 */
class MyMath3 {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, double n2) {
        return 0;
    }
}
// void add (int nn1 , int nn2);
// 위에 daa 메소드도 int int 파라미터기 떄문에 구분이 안된다.  그렇기에 불가하다 .
//void