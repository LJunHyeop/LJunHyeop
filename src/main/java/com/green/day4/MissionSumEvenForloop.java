package com.green.day4;

public class MissionSumEvenForloop {
    public static void main(String[] args) {
        // 1~100까지 짝수만 더하기
        int num = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                num = num + i; // num += i;
            }
        }
        System.out.print("num: " + num);
    }
}
/* 스코프 개념은 모든 언어가 동일 변수가 선언이되면
         그변수를 감싸고 있는 중괄호 가 있다. 그 중괄호를 벗어나면 죽는다
         선언도 안됫는대 사용은 불가능 하다 .*/