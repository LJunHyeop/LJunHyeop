package com.green.day10;

public class MissionArray2 {
    public static void main(String[] args) {
    /*
    정수값 10개를 저장 할 수 있는 배열을 생성
    10칸 초기화하는데 10~30 랜덤값이 세팅될 수 있도록 해주세요.
    중복허용
    n[0]
    n[0] n[1]
    n[0] n[1] n[2]


     */
        int[] numArr = new int[10];
        numArr[0] = (int) (Math.random() * 21.0) + 10;

        for (int i = 1; i < numArr.length; i++) {

            while (true) {

                numArr[i] = (int) (Math.random() * 21.0) + 10;

                boolean result = true;

                for (int j = 0; j < i; j++) {

                    if (numArr[i] == numArr[i]) ;

                }
                if (result) {
                    break;
                }
            }
            System.out.println(numArr[i]);
        }
    }
}