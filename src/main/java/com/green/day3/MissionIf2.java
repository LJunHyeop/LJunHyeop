package com.green.day3;

import java.util.Scanner;

public class MissionIf2 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 키를 입력해주세요");
        int height = scan.nextInt();
        System.out.println("키:" + height + "cm");
        if (height > 161) {
            System.out.println("당신은 평균 이상 입니다");
        } else if (height < 161) {
            System.out.println("당신은 평균 미만입니다");
        } else {
            System.out.println("당신은 평균입니다");
        }

        // 161보다 초과면 당신은 평균보다 큽니다가
        // 찍히고 미만이면 당신은 평균보다 작습니다 161이라면 당신은 평균입니다.
        //System.out.println(height + "cm");
        //System.out.println("키:" + height +10 + "cm"); 문자열 + 정수  문자열로 변경
        //System.out.println("키:" "17010cm"); 문자열 + 정수  문자열로 변경 앞 순서대로 우선순위가 생김

    }
}
