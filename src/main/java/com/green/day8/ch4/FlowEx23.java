package com.green.day8.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        while (i != 0) {   // i가 0이 아니면 아래문구 출력 true 이기 때문 0이면 false 라 빠져나옴
            System.out.printf("%d  - I can do it\n", i--);
        }
        System.out.println("---종료---");
    }
}
