package com.green.day6.ch2.ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        String z = " 일때 참인 것 은?";
        // x == 0 일 대 ,참인 것은 (개행)
        System.out.printf("x = %d,%s \n", x, z);
        System.out.printf("x = %d 일 때 참인것은 ?\n", x);
        String name = "슬랙";
        char blooType = 'B';
        //슬랙의 혈액형은 B형 입니다가 출력 이름이 가나로 바뀌면 가나의 ~~ 되고 A 형으로 바뀌면 A형 입니다가 출력
        System.out.printf("%s 의 혈액형은, %c 형 입니다\n", name, blooType);
    }
}
