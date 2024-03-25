package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        /*
        1,3 > 남
        2, 4 >여
        Scanner 객체를 통해 주민번호르 입력받고
        '1' > "당신은 2000년 이전에 출생한 남자입니다".
        '3' > "당신은 2000년 이후에 출생한 남자입니다".
        '2' > "당신은 2000년 이전에 출생한 여자입니다".
        '4' > "당신은 2000년 이전에 출생한 여자입니다".
        이외의값 > 유효하지않은 주민번호 입니다
        switch 만 쓸수있다
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("주민번호를 입력해주세요");
        String abc = scan.nextLine();
        char target = abc.charAt(7);
        String result = switch (target) {
            case '1' -> "당신은 2000년 이전에 출생한 남자입니다";
            case '3' -> "당신은 2000년 이후에 출생한 남자입니다";
            case '2' -> "당신은 2000년 이전에 출생한 여자입니다";
            case '4' -> "당신은 2000년 이후에 출생한 여자입니다";
            default -> "유효하지 않은 주민번호입니다";
        };
        System.out.println(result);
    }
}
