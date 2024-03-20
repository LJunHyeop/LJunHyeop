package com.green.day4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 3;
        System.out.println("star : " + star); // 스타 값이 3개면 * ** *** 세로로 스타값이 5면 * ** *** **** ***** 세로로 나오게
        for (int i = 0; i < star; i++) {
            for (int z = 0; z <= i; z++) {
                System.out.print("0001");
            }
            System.out.println(" ");
        }
    }
}
