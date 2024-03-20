package com.green.day4;

public class LogicalOperatorNot {
    public static void main(String[] args) {
        boolean r = true;
        System.out.println(!r);
        System.out.println("!!r: " + r);
        System.out.println("r: " + r);
        boolean tg = true;
        tg = !tg;
        System.out.println("tg : " + tg);
        tg = !tg;
        System.out.println("tg : " + tg);
        tg = !tg;
        System.out.println("tg : " + tg);
        tg = !tg;
        System.out.println("tg : " + tg);
        int tg2 = 0;
        tg2 = 1 - tg2;
        System.out.println("tg : " + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg : " + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg : " + tg2);
    }
}
