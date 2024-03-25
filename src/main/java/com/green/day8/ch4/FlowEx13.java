package com.green.day8.ch4;

public class FlowEx13 {
    public static void main(String[] args) {
        /*
        1~ 10 전부 더한 값 과정을 출력
        1부터 1까지의합 : 1
        1부터 1까지의합 : 3
        1부터 3까지의합 : 6 ....
        1부터 10까지의합 : 55
         */
        int i = 0;
        int sum = 0;
        for (i = 1; i < 11; i++) {
            sum += i;
            System.out.printf("1부터 %d 까지의 합 : %d \n", i, sum);
        }
    }
}
