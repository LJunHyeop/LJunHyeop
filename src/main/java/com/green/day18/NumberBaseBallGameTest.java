package com.green.day18;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(4);
        System.out.println(game.NUMBER_COUNT);
        System.out.println(Arrays.toString(game.numArr));
        game.start();
    }


    static class NumberBaseBallGame {

        public NumberBaseBallGame(int NUMBER_COUNT) {
            if (NUMBER_COUNT < 1 || NUMBER_COUNT > MAN_NUMBER) {
                this.NUMBER_COUNT = DEFAULT_NUMBER;
            } else {
                this.NUMBER_COUNT = NUMBER_COUNT;
            }
            this.init();
        }

        static final int MIN_NUMBER = 1;
        static final int DEFAULT_NUMBER = 3;
        static final int MAN_NUMBER = 9;

        final int NUMBER_COUNT;
        private int[] numArr;

        public void start() {

            while (true) {
                int strike = 0;
                int ball = 0;
                int out = 0;
                Scanner scan = new Scanner(System.in);
                System.out.printf("%d 자리 숫자를 입력해주세요 구분은 스페이스 ", NUMBER_COUNT);
                String strAnswer = scan.nextLine();
                String[] answerStrArr = strAnswer.split("");
                int[] arr = new int[answerStrArr.length];
                if (numArr.length != answerStrArr.length) {
                    System.out.println("잘못입력 하셨습니다.");
                    continue;

                }
                for (int i = 0; i < numArr.length; i++) {
                    arr[i] = Integer.parseInt(answerStrArr[i]);
                }
                for (int i = 0; i < answerStrArr.length; i++) {
                    if (numArr[i] == arr[i]) {
                        strike++;
                    } else {
                        for (int j = 0; j < numArr.length; j++) {
                            if (arr[j] == numArr[i]) {
                                ball++;
                            }
                        }
                    }
                    out = numArr.length - strike - ball;
                }
                if (strike == NUMBER_COUNT) {
                    System.out.println("정답");
                    break;
                }
                System.out.printf("Strike : %d, ball : %d  out : %d \n", strike, ball, out);
            }
        }

        private void init() {  // 1~ 9 중복되지않게 각 방에 대입해주세요
            this.numArr = new int[NUMBER_COUNT];
            for (int i = 0; i < numArr.length; i++) {
                int arr = (int) (Math.random() * 9) + 1;
                numArr[i] = arr;
                for (int z = 0; z < i; z++) {
                    if (numArr[z] == arr) {
                        i--;
                        break;
                    }
                }
            }
        }
//                    num %= 10;
//                    arr[i] = num;
//                    num /= 10;
//                }
//                int strike=0, ball=0 , out=0;
//                for (int i =0; i < numArr.length; i++){
//                    if(arr[i] == numArr[i] ){
//                        ++strike;
//                    }
//                    else{
//                        for(int j =0; j< numArr.length; j++){
//                            if (numArr[j] == arr[i]){
//                                ++ball;
//                            }
//                        }
//                        out = NUMBER_COUNT - strike - ball;
//                    }break;
//                }
//        public  void start(){
//            int strike = 0;
//            int ball = 0;
//            int out = 0;
//            int[] arr = new int[NUMBER_COUNT];
//            Scanner scan = new Scanner(System.in);
//
//            while(strike != 3){
//                strike = 0;
//                ball = 0;
//                out = 3;
//                for(int i = 0; i < NUMBER_COUNT; i++) {
//                    arr[i] = scan.nextInt();
//                }
//                for(int i = 0; i < arr.length; i++){
//                    for(int j = 0; j < numArr.length; j++) {
//                        if(numArr[j] == arr[i]) {
//                            if(i == j) {
//                                strike++;
//                            }
//                            else{
//                                ball++;
//                            }
//                        }
//                    }
//                }
//                out -= strike + ball;
//                System.out.printf("S %d B %d O %d\n", strike, ball, out);
//            }
//            System.out.println("strike out");
//        }

    }
}
