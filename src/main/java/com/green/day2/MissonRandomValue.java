package com.green.day2;

public class MissonRandomValue {
    public static void main(String[] agrs) {
        //1~9사이의 랜던함 값 나올 수 있게 세팅
        for (int i = 0; i < 10; i++) {
            int result = (int) (Math.random() * 9) + 1;
            System.out.println(result);
            //5~12 사이의 랜덤한 값 나올수 있게 세팅
            for (int l = 0; l < 10; l++) {
                int rasult = (int) (Math.random() * 8) + 5;
                System.out.println(rasult);

            }
        }
    }
}