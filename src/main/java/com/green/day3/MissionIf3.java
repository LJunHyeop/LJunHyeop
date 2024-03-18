package com.green.day3;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을입력해주세요. (남/여)");
        String gender = scan.nextLine();
        System.out.print("당신의키를 입력해 주세요 >> ");
        int height = scan.nextInt();
        if (gender.equals("남")) {
            if (height > 175) {
                System.out.println("당신의 키는 평균 초과입니다.");
            } else if (height < 175) {
                System.out.println("당신의 키는 평균 미만입니다");
            } else {
                System.out.println("당신은 평균입니다.");
            }
        } else if (gender.equals("여")) {
            if (height > 161) {
                System.out.println("당신의 키는 평균 초과입니다");
            } else if (height < 161) {
                System.out.println("당신의 키는 평균 미만입니다");
            } else {
                System.out.println("당신은 평균입니다.");
            }
        } else {
            System.out.println("성별을 입력해 주세요");
        }
        //남자 평균키 : 175 옂 ㅏ평균키 :161
        //gender 남 기준값 175
        //gender 여 기준값 161
        // 남or여 둘다 아니면 성별을 입력해 주세요. >종룡

    }
}
