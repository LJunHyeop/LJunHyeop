package com.green.day8.ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        /*
        반복문을 활용하여 이렇게 출력해주세여
        111
        112
        113
        121
        122
        123
        131
        132
        133
        211
        212
        213
        ...
        333 이될수 있도록
         */
        int num = 5;
        for (int i = 1; i < num; i++) {
            for (int z = 1; z < num; z++) {
                for (int j = 1; j < num; j++)
                    System.out.printf("%d%d%d\n", i, z, j);
            }
        }
    }
}
