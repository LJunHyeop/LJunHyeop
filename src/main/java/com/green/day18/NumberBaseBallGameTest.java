package com.green.day18;

import java.util.Arrays;

public class NumberBaseBallGameTest {
    public static void main(String[] args) {
        NumberBaseBallGame game = new NumberBaseBallGame(6);
        System.out.println(game.NUMBER_COUNT);
        System.out.println(Arrays.toString(game.numArr));

    }

    static class NumberBaseBallGame {
        static final int MIN_NUMBER = 1;
        static final int DEFAULT_NUMBER = 3;
        static final int MAN_NUMBER = 9;

        final int NUMBER_COUNT;
        private int[] numArr;

        public NumberBaseBallGame(int NUMBER_COUNT) {
            this.NUMBER_COUNT = NUMBER_COUNT;
            this.init();
        }

        private void init() {  // 1~ 9 중복되지않게 각 방에 대입해주세요
            this.numArr = new int[NUMBER_COUNT];
            for (int i = 0; i < numArr.length; i++) {
                int arr = (int) (Math.random() * 9) + 1;
                numArr[i] = arr;
                for (int z = 0; z < i; z++) {
                    if (numArr[z] == arr) {
                        i--;/
                        break;
                    }
                }
            }
        }
    }
}
