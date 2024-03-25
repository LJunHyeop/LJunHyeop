package com.green.day7.ch4;

import java.util.Scanner;

public class Tranning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("역삼각형의 높이를 입력하세요: ");
        int height = scanner.nextInt();

        for (int i = height; i >= 1; i--) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
