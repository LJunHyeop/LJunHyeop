package com.green.day11.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();     //new 가 나오면 새거 새거면 무조건 주소값이 다르다 new 가 없으면 동일
        tv.color = "red";
        tv.channel = 10;
        tv.power = true;
        System.out.printf("tv color : %s channel : %d power : %b\n"
                , tv.color, tv.channel, tv.power);

        Tv tv2 = new Tv();
        tv2.channelUp();
        tv2.channelUp();
        System.out.println("tv == tv2 : " + (tv == tv2));// 레퍼런스 타입들 끼리의 == 비교는 주소값이 같냐 고 물어봄

        System.out.printf("tv color : %s channel : %d power : %b\n"
                , tv2.color, tv2.channel, tv2.power);
    }
}
