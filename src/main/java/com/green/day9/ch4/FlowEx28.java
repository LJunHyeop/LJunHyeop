package com.green.day9.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        /*
        1에서 100 사이의 랜덤 값을 만들어내고 랜덤값을 맞추는 게임
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > up
        입력한 숫자보다 정답이 작다 > down
        맞출떄 까지 반복
         */
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        System.out.printf("랜덤값을 입력해 주세요 %d \n", num);
        while (true) {
            int num2 = scan.nextInt();
            if (num2 < num) {
                System.out.println("up");
            } else if (num2 > num) {
                System.out.println("down");
            } else {
                System.out.println("정답");
                {
                    break;
                }
            }
        }
    }
}
