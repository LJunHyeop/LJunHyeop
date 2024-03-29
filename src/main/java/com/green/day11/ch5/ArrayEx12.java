package com.green.day11.ch5;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] name = {"Kim", "Park", "Yi"};
        System.out.println(name[1]);
        String tmp = name[1];
        System.out.println("tmp :" + tmp);

        //0번방의 값은 "Yu로 변경해주세요"

        name[0] = "Yu";
        System.out.println(name[0]);

        //일반 for 문
        for (int i = 0; i < name.length; i++) {
            String val = name[i];
            System.out.printf("Val : %s\n ", val);
        }
        /*
        향상된 for 문
        foreach 문
         */
        for (String val : name) {
            System.out.printf("Val : %s\n ", val); //읽어 오는것만 할려고 값변경은 되지않음
        }
    }
}