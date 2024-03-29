package com.green.day11.ch6;

public class TvTest4 {
    public static void main(String[] args) {
        //Q1. Tv 객체의 주솟값을 3개 저장할 수있는 배열을 만들어주세요
        //Q2. 각 방에 tv 객체의 주소값을 넣어준다 모두 동일하지 않다.\
        //Q3. 0번방 tv는 채널 11 , 1번방 tv 는 채널 12 2번방 Tv는 채널 13 될수있도록 작업

        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = 11 + i;
            //System.out.printf(" 1번 채널은 :  %d 2번 채널은 %d :  3번채널은 %d",tvArr[i].channel,tvArr[i].channel,tvArr[i].channel);
        }
        for (int i = 0; i < tvArr.length; i++)
            System.out.printf("%d번방의 채널은 : %d\n", i, tvArr[i].channel);
    }
}
