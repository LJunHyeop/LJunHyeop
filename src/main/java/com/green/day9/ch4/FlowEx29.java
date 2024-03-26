package com.green.day9.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        /*
        3,6,9 게임 i =1 i=2 i=3 짝 i33= 짝짝
        1~100 까지
         */
        int sum = 0;
        for (sum = 1; sum < 401; sum++) {
            int i = sum;
            System.out.printf("i=%d", sum);
            while (i != 0) {
                if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
                    System.out.print("짝");
                i /= 10;
            }
            System.out.println();
        }
    }
}
