package com.green.day2;

public class If {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        n2 = 30;
        if (n1 > n2) {
            System.out.println("n1가 n2 보다 초과값입니다.");
        } else {
            System.out.println("n1가 n2 보다 미만값 입니다.");
        }
        System.out.println("---------");
        n2 = 10;
        if (n1 < n2) {
            System.out.println("n1이 작다");
        }
        if (n1 > n2) {
            System.out.println("n1이 크다");
        } else {
            System.out.println("n1과 n2 가 같다");
        }
    }
}
