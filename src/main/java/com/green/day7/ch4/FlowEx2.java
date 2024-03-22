package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        // Scanner 객체를 이용하여 콘솔에서 문자열 값을 받는다.
        //받은 물자열 을 숫자로 파싱한다. 파싱한 숫자가 0 이라면 >> 입력하신 숫나는 0입니다. 0이 아니라면 입력하신 숫자는 0이 아닙니다.
        // 입력하신 숫자는 "?" 입니다 를 출력될수있도록함
        Scanner scan = new Scanner(System.in);
        System.out.println("문자를 입력해 주세요 >> ");
        String b = scan.nextLine();
        int a = Integer.parseInt(b);
        if (a == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.printf("입력하신 숫자는 0이 아닙니다. 입력하신 숫자는 %d 입니다\n", a);
        }
        String result = switch (a) {
            case 0 -> "입력하신 숫자는 0입니다";
            default -> String.format("입력하신 숫자는 0이아닙니다" + "\n 입력하신 숫자는 %d 입니다.\n", a);
        };
        System.out.println(result);
    }
}
