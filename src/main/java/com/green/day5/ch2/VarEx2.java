package com.green.day5.ch2;

// 스와핑
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x: " + x + ", y" + y);
        int z = x;
        z = x;
        x = y;
        y = z;
        System.out.println("x: " + x + ", y: " + y);
    }
}
/* x가 가지고있는 값과 y가 가지고 있는 값을 서로 교환한다.
조건 1) 리터럴값은 사용할 수 없습니다.
조건 2) 조건 1만 지키면 무엇이든지 해도 됨.
 */
