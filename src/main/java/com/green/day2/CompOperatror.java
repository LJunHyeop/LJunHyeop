package com.green.day2;

//비교 연산자 누가누가 더큰지 정수혀
public class CompOperatror {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        // boolean b3 - 32;
        boolean r1 = 10 > 9; // 10이 9보다  초과 인지 물어보는것
        System.out.println(r1);
        r1 = 10 < 9; // 10이 9보다 미만 인지 물어보는것
        System.out.println(r1);
        r1 = 10 >= 9; //10이 9보다 이상 인지 물어보는 것
        System.out.println(r1);
        r1 = 10 >= 10;// 10이 10 보다 이상 인지 물어보는 것
        System.out.println(r1);
        r1 = 10 <= 10;
        System.out.println(r1);
        r1 = 10 == 10; //10이 10이랑 같은 지 물어보는것
        System.out.println(r1);
        r1 = 10 != 10; //10이 10 과 다르냐? falst
        System.out.println(r1);
    }
}
