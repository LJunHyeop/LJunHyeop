package com.green.day10;

public class MissionArray2V2 {
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
        //int a = (int)(Math.random()*21.0 +10);

        int[] arr = new int[10];
        int i = 0;
        while (i == 10) {
            int a = (int) (Math.random() * 20 + 10);
            int check = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == a) {
                    check++;


                }
            }
            if (check == 0) {
                arr[i] = i;
                i++;
            }
        }
    }
}
