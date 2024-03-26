package com.green.day9.ch5;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int len = 19;
        int[] numArr = new int[100]; // 0~99 방의 모든값음 0 으로되어잇다 0번방 1 1번방 2 순차적 넣기 99번방 100이들어감
        for (int i = 0; i < 10; i++) {
            numArr[i] += i + 1;
        }
        for (int i = 0; i < 10; i++)
            System.out.printf("numArr[%d] : %d\n", i, numArr[i]);
    }
}
