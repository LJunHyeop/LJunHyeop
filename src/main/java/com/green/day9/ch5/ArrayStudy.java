package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30, n4 = 40, n5 = 50;
        System.out.println(n1);
        n1 = 11;
        System.out.println(n1);
        int[] numArr = new int[10];
        numArr = new int[11];   //10칸짜리 애가 변경된것이  아닌 11개로 새로 만들어진것
        //10칸이있는데 칸마다 int 타입 int 값만 저장할수 있다. 칸만 만들었지 초기화는 안된다 없는방 사용시 예외발생
        System.out.println("numArr[0]" + numArr[0]);
        numArr[0] = 11;


        System.out.println("numArr[0]" + numArr[0]);
        int[] numArr2 = {10, 20, 30, 40, 50};
        System.out.println("numArr2[1]: " + numArr2[1]);
        numArr2[1] = 25;
        System.out.println("numArr2[1]: " + numArr2[1]);

        int[] numArr3 = new int[]{10, 20, 30}; // 칸도 만들고 초기화도 바로한다 .
        // int aaa = null; 에러

        //int [] numArr4 = new String[5]; 는 안된다. 타입이 달라서

        String[] strArr = new String[5]; // 5칸이있는데 칸마다 String 타입 "="으로 저장되는 값은 주소값 1개만 저장
        System.out.println("strArr[0]" + strArr[0]);
        System.out.println("strArr[1]" + strArr[1]); //default 값 null 대문자로 시작하는것 들 모두
        /*
        배열을 사용하는 이유 ? 여러 값을 같은 타입에 편하게 쓰기/읽기 하기위해서
        배열의 특징 ? 크기는 고정 (생성후 나서 크기 변경 이 안됨)
        index 로 사용한다. index 는 0번부터 시작되며 마지막 index 값은 배열 크기 -1 값이다.
        for 문이랑 궁합이 굉장하다.
         */
    }
}
