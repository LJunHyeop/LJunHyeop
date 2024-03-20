package com.green.day3;

public class MissionmultipleForLoop {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2; // int star =2~6 사이 랜덤값 세팅
        System.out.println(star);
        for (int i = 0; i < star; i++) {
            for (int z = 0; z < star; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}