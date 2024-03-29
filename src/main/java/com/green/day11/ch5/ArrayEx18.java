package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        /*
        각 첫번째 줄의 합계값 과 평균값을 구하기
         */
        int[][] score = {
                {100, 90, 80}
                , {20, 25, 30,}
                , {30, 30, 30,}
                , {40, 40, 40,}
        };
        int[] sumArr = new int[score[0].length];
        for (int i = 0; i < score.length; i++) {
            // System.out.println("score.length : "+score.length);
            // System.out.println("score.length : "+score[i].length);
            //System.out.println(score[i][z]);
            // System.out.println( score[i][z]);
            for (int z = 0; z < score[i].length; z++) {
                sumArr[z] += score[i][z];
            }
        }
        for (int i = 0; i < sumArr.length; i++) {
            System.out.printf("%d칸의 합계값 : %d, 평균값 : %.2f\n",
                    i, sumArr[i], (double) sumArr[i] / score.length);
        }
    }
}
