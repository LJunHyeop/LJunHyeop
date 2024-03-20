package com.green.day3;

public class MissionForLoopStar {
    public static void main(String[] args) {
        // 3~10 star 에 대입 되도록해주세요
        int star = (int) (Math.random() * 8 + 3);
        System.out.println(star);// 만약 5가 나왓다 ***** 5개 찍이면되고 만약 star 가 10이나오면 *가 10이나온다.
        //for (int i=1; i<=star; i++){
        System.out.print("*");
        for (int i = star; i > 1; i--) {
            System.out.print("*");
        }
    }
}


