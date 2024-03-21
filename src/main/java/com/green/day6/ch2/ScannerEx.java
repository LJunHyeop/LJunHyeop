package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해 주세요. >>");
        String input = scan.nextLine(); //"123" >> 123
        //int num = (int)(input);
        int num = Integer.parseInt(input); // 문자열에있는것을 정수로 바꿔줌
        System.out.println("num : " + num);
        System.out.println("num : " + 1 + (num + 1));
    }
}
