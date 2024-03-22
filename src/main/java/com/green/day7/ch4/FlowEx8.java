package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        /*
        주민뒷자리 첫번째 1,3 이 남자 2,4 가 여자
        Scanner 객체를 통해 주민번호를 입력 받으시고
        주민번호를 확인하여 여자 인지 남자 인지 유효 하지 않은 주민번호인지 출력
        switch 쓰면된다
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)>>");
        String num = scan.nextLine();
        char target = num.charAt(7);

        String result = switch (target) {
            case '1', '3' -> "당신은 남자입니다.";
            case '2', '4' -> "당신은 여자입니다.";
            default -> "유효하지 않은 주민번호 입니다.";
        };
        System.out.println(result);
    }
}

