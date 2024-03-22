package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        /*
        switch 로 문제해결
        Scanner 객체를 사용하여 Month(월)+ 정수로 입력받는다.
        month 값이 3~5 라면 현재의 계절은 봄입니다. 가 출력되도록 6~8이라면 현재의 계절은 여름입니다.
        9~11 계절 가을 12,1,2 라면 현재의 계절은 겨울입니다. 이외의 값은 잘못 입력 하셨습니다. 출력
         */
        Scanner month = new Scanner(System.in);
        System.out.println("월을 입력해주세요 >> ");
        int abc = month.nextInt();
        String mon = "봄입니다";
        switch (abc) {
            case 3, 4, 5: {
                break;
            }
            case 6, 7, 8:
                mon = "여름";
            {
                break;
            }
            case 9, 10, 11:
                mon = "가을";
            {
                break;
            }
            case 12, 1, 2:
                mon = "겨울";
            {
                break;
            }
            default:
                System.out.println(" 잘못 입력하셨습니다.");
        }
        System.out.printf("현재 계절은 %s 입니다.", mon);
    }
}
