package com.green.day5;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요 .(남/여)>>>");
        String gender = scan.nextLine();
        //int num = null; //primitive type null을 가질수 없다 Referanece type은 객체의 주소값을 저장할 수있다. null > 주소값 없음
        //객체의 주소값만 저장 가능 (그리고 이것은 객체를 가리키고 있다고 표현)
        // null 주고값이 없다는 의미 ( 이것은 객체를 가리키고 있지않다.)
        String result = switch (gender) {
            case "여", "여자" -> "당신은 여성입니다.";
            case "남", "남자" -> "당신은 남성입니다.";
            default -> "성별을 입력해 주세요";
        };
        System.out.println(result);
    }
}
