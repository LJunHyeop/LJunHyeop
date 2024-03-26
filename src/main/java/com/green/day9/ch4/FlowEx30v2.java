package com.green.day9.ch4;

public class FlowEx30v2 {
    public static void main(String[] args) {
        /*
        1~ n까지 더하는데 100이 막 넘은 index 값과 sum 값을 출력한다.
         */
        int sum = 0;
        int num = 1;
        while (sum <= 100) {
            sum += ++num;
            System.out.printf("num : %d  sum : %d\n", sum, num);
        }
    }
}
