package com.green.day4;

public class ContinueBreak {
    public static void main(String[] args) {
        //continue > skip에 가깝고 break > stop에 가깝다 둘다 반복문 안에서 사용 가능
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("---------break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("----------continue");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
