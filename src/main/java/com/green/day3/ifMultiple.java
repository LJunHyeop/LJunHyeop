package com.green.day3;

public class ifMultiple {
    public static void main(String[] args) {
        int val1 = 80, val2 = 100;
        if (val1 % 2 == 0) {
            if (val2 % 2 == 0) {
                System.out.println(val2 - val1);
            } else {
                System.out.println(val2);
            }
            //val1 이 짝수고 val2도 짝수면 val2 - val1 값을 출력 홀수면 val1 값만 출력
            //val1 이 홀수고 val2가 짝수면 val2-5 값을 출력 홀수면 val2값만 출력
        } else {
            if (val2 % 2 == 0) {
                System.out.println(val2 - 5);
            } else {
                System.out.println(val2);
            }
        }
        System.out.println("-------");
        Exam.test(val1, val2);
    }


    class Exam {
        public static int getRandomValue(int i, int z) {
            final int rVal = (int) (Math.random() * (z - i)) + i;
            return rVal;
        }

        public static void test(int val1, int val2) {
            if (val1 % 2 == 0 && val2 % 2 == 0) {
                System.out.println(val2 - val1);
                if (val1 % 2 == 1) {
                    System.out.println(val1);
                }
            } else if (val1 % 2 == 1 && val2 % 2 == 0) {
                System.out.println(val2 - 5);
                if (val2 % 2 == 1) {
                    System.out.println(val2);
                }
            }
        }
    }
}