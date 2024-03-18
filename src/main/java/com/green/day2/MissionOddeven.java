package com.green.day2;

public class MissionOddeven {
    public static void main(String[] agrs) {
        int num = (int) (Math.random() * 10) + 1;// 1~10
//        if (num % 2 == 0) {
//            System.out.println(num + "는 짝수입니다.");
//            //Ex num 이 5라면 콘솔에 5는 홀수입니다. 가 찍혀야되고 num이 10이면 짝수입니다 가 나와야댐
//        }else{
//            System.out.print(num + "은 홀수입니다.");
//        }
        System.out.print(num);
        System.out.print("은");
        System.out.print(num % 2 == 0 ? "짝" : "홀");
        System.out.print("수입니다");
    }
}