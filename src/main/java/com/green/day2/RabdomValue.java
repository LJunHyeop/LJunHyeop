package com.green.day2;

public class RabdomValue {
    public static void main(String[] args) {
        //형변환, type 이 안맞으면 맞게 type 변화를 줘야한다.
        //자동형변환 , 강제형변환 2가지 type 가 있다.
        System.out.println(Math.random() * 10);// 0.000000~ 0.99999999 1은 절대로 나오지않음
        int result = (int) (Math.random() * 10);
        result = (int) (0.67662838 * 10);
        result = (int) (0.67662838 * 10.0); // 0~9
        System.out.println(result);
    }
}
