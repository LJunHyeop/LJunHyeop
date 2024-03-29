package com.green.day11.ch5;

//p.214 다차원배열
public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5]; // 배열안에 배열배열배열배열이 있는 느낌  3 0,1,2, 앞쪽은 줄을 뜻함
        score[0][0] = 5; // 0번줄 0번칸에 5를 집어넣겟다
        score[1][1] = 10; // 1번줄 1번칸에 10을 집어넣겟다
        score[1][3] = 50; // 1번줄 3번칸에 50을 집어넣겟다
        System.out.println("score.length" + score.length);
        System.out.println("score[0].length : " + score[0].length);
        int[] temp = score[0];

        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                System.out.printf("%d \t", score[i][z]);
            }
            System.out.println();
        }
    }
}
