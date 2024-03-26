package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        /*
        1~ n까지 더하는데 100이 막 넘은 index 값과 sum 값을 출력한다.
         */
        int sum = 0;
        int num = 0;
        while (true) {
            sum += num;
            num = ++num;
            if (sum > 100) {
                break;
            }
            System.out.printf("%d+%d = %d\n", sum, num, (sum + num));
        }
        System.out.printf("index : %d  %d ", num - 1, sum);
    }
}
