package com.green.day4;

public class VarScope {
    public static void main(String[] args) {
        if (1 > 0) {
            int num = 10;
            System.out.println(num);
            int num2 = 10;
            System.out.println(num2);
        }
        int num2 = 10; // 위 if 문에 있는 num2와 같은 이름을 사용할 수 있다. 스코프(살아있는 범위가 달라서)
        for (int i = 0; i < 10; i++) {
            int bb = 0;
            bb = bb + i;//의미없는 코드
        }
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
    }
}
/* 스코프 개념은 모든 언어가 동일 변수가 선언이되면
         그변수를 감싸고 있는 중괄호 가 있다. 그 중괄호를 벗어나면 죽는다
         선언도 안됫는대 사용은 불가능 하다 .*/